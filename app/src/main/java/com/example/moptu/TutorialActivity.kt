package com.example.moptu

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TutorialActivity : AppCompatActivity() {

    private var isFirstScreen = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tutorial)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nextButton = findViewById<Button>(R.id.button_next)
        val previousButton = findViewById<Button>(R.id.button_previous)
        val imageView = findViewById<ImageView>(R.id.defaultPhoto)
        val infoTextView = findViewById<TextView>(R.id.infoTextView)

        nextButton.setOnClickListener {
            nextButton.text = "zakończ"
            if (isFirstScreen) {
                imageView.setImageResource(R.drawable.ssmenu)
                infoTextView.text = "Dowiedz się więcej na temat ciekawych miejsc do zwiedzenia!\nKliknij w jedno ze zdjęć\ni dowiedz się więcej o wybranym miejscu"
                isFirstScreen = false
            } else {
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("title", "Witamy po tutorialu!")
                }
                startActivity(intent)
                finish()
            }
        }

        previousButton.setOnClickListener {
            if(isFirstScreen){
                val intent = Intent(this, MainActivity::class.java).apply {
                    putExtra("title", "Witamy po tutorialu!")
                }
                startActivity(intent)
            }else{
                nextButton.text = "dalej"
                imageView.setImageResource(R.drawable.sssearch)
                infoTextView.text = "Wpisz jedno z tych miejsc:\n-Jura\n-Biebrza\n-Sandomierz\n-Wolin\n-Bory\n-Elbląg"
                isFirstScreen = true
            }

        }
    }
}
