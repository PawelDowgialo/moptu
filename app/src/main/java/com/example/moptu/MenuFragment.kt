package com.example.moptu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.fragment.app.Fragment

class MenuFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_menu, container, false)

        view.findViewById<ImageView>(R.id.tile_image_1).setOnClickListener {
            // Handle click for tile 1
        }
        view.findViewById<ImageView>(R.id.tile_image_2).setOnClickListener {
            // Handle click for tile 2
        }
        view.findViewById<ImageView>(R.id.tile_image_3).setOnClickListener {
            // Handle click for tile 3
        }
        view.findViewById<ImageView>(R.id.tile_image_4).setOnClickListener {
            // Handle click for tile 4
        }

        return view
    }
}
