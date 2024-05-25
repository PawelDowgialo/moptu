package com.example.moptu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class TileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tile)

        val backButton = findViewById<ImageButton>(R.id.back_button)
        val shareButton = findViewById<ImageButton>(R.id.share_button)
        val imageView = findViewById<ImageView>(R.id.main_image)
        val titleTextView = findViewById<TextView>(R.id.title_text)
        val distanceTextView = findViewById<TextView>(R.id.distance_text)
        val description_text = findViewById<TextView>(R.id.description_text)
        val phoneTextView = findViewById<TextView>(R.id.phone_text)
        val addressTextView = findViewById<TextView>(R.id.address_text)

        val imageResource = intent.getIntExtra("image_resource", 0)
        val title = intent.getStringExtra("title")
        val distance = intent.getStringExtra("distance")
        val address = intent.getStringExtra("address")
        val phone = intent.getStringExtra("phone")
        val description = intent.getStringExtra("description")

        imageView.setImageResource(imageResource)
        titleTextView.text = title
        distanceTextView.text = distance
        addressTextView.text = address
        phoneTextView.text = phone
        description_text.text = description

        backButton.setOnClickListener {
            finish()
        }

        shareButton.setOnClickListener {
            shareContent()
        }
    }

    private fun shareContent() {
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT, "Musisz odwiedzić te miejsce :) : ${intent.getStringExtra("title")} jest ono tam: ${intent.getStringExtra("address")}.")
            type = "text/plain"
        }
        startActivity(Intent.createChooser(shareIntent, "Share place"))
    }
}
