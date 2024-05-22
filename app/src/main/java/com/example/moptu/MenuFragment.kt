package com.example.moptu

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class MenuFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        view.findViewById<ImageView>(R.id.tile_image_1).setOnClickListener {
            val intent = Intent(activity, Tile1Activity::class.java).apply {
                putExtra("image_resource", R.drawable.xd) // zamień na właściwe ID zasobu obrazu
                putExtra("title", "Place name 1")
                putExtra("distance", "Distance 1 km")
                putExtra("address", "Adress 1")
            }
            startActivity(intent)
        }

        view.findViewById<ImageView>(R.id.tile_image_2).setOnClickListener {
//            val intent = Intent(activity, Tile2Activity::class.java)
//            startActivity(intent)
        }

        view.findViewById<ImageView>(R.id.tile_image_3).setOnClickListener {
//            val intent = Intent(activity, Tile3Activity::class.java)
//            startActivity(intent)
        }

        view.findViewById<ImageView>(R.id.tile_image_4).setOnClickListener {
//            val intent = Intent(activity, Tile4Activity::class.java)
//            startActivity(intent)
        }

        return view
    }
}
