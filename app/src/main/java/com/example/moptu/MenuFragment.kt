package com.example.moptu

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class MenuFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        view.findViewById<ImageView>(R.id.tile_image_1).setOnClickListener {
            val intent = Intent(activity, TileActivity::class.java).apply {
                putExtra("image_resource", R.drawable.xd)
                putExtra("title", view.findViewById<TextView>(R.id.tile_image_1_description).text)
                putExtra("distance", view.findViewById<TextView>(R.id.tile_image_1_distance).text)
                putExtra("address", "Adress 1")
            }
            startActivity(intent)
        }

        view.findViewById<ImageView>(R.id.tile_image_2).setOnClickListener {
            val intent = Intent(activity, TileActivity::class.java).apply {
                putExtra("image_resource", R.drawable.xd)
                putExtra("title", view.findViewById<TextView>(R.id.tile_image_2_description).text)
                putExtra("distance", view.findViewById<TextView>(R.id.tile_image_2_distance).text)
                putExtra("address", "Adress 2")
            }
            startActivity(intent)
        }

        view.findViewById<ImageView>(R.id.tile_image_3).setOnClickListener {
            val intent = Intent(activity, TileActivity::class.java).apply {
                putExtra("image_resource", R.drawable.xd)
                putExtra("title", view.findViewById<TextView>(R.id.tile_image_3_description).text)
                putExtra("distance", view.findViewById<TextView>(R.id.tile_image_3_distance).text)
                putExtra("address", "Adress 3")
            }
            startActivity(intent)
        }

        view.findViewById<ImageView>(R.id.tile_image_4).setOnClickListener {
            val intent = Intent(activity, TileActivity::class.java).apply {
                putExtra("image_resource", R.drawable.xd)
                putExtra("title", view.findViewById<TextView>(R.id.tile_image_4_description).text)
                putExtra("distance", view.findViewById<TextView>(R.id.tile_image_4_distance).text)
                putExtra("address", "Adress 4")
            }
            startActivity(intent)
        }

        view.findViewById<ImageView>(R.id.tile_image_5).setOnClickListener {
            val intent = Intent(activity, TileActivity::class.java).apply {
                putExtra("image_resource", R.drawable.xd)
                putExtra("title", view.findViewById<TextView>(R.id.tile_image_5_description).text)
                putExtra("distance", view.findViewById<TextView>(R.id.tile_image_5_distance).text)
                putExtra("address", "Adress 5")
            }
            startActivity(intent)
        }

        view.findViewById<ImageView>(R.id.tile_image_6).setOnClickListener {
            val intent = Intent(activity, TileActivity::class.java).apply {
                putExtra("image_resource", R.drawable.xd)
                putExtra("title", view.findViewById<TextView>(R.id.tile_image_6_description).text)
                putExtra("distance", view.findViewById<TextView>(R.id.tile_image_6_distance).text)
                putExtra("address", "Adress 6")
            }
            startActivity(intent)
        }

        return view
    }
}
