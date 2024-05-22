package com.example.moptu

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import androidx.fragment.app.Fragment

class SearchFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_search, container, false)

        val editTextSearch = view.findViewById<EditText>(R.id.editText_search)
        val imageViewSearch = view.findViewById<ImageView>(R.id.imageView_search)

        imageViewSearch?.setOnClickListener {
            val inputSearch = editTextSearch.text.toString()
            if (inputSearch == "Desc1") {
                Log.i("SearchFragment", inputSearch)
                val intent = Intent(activity, TileActivity::class.java).apply {
                    putExtra("image_resource", R.drawable.xd)
                    putExtra("title", "Description 1")
                    putExtra("distance", "Distance 1")
                    putExtra("address", "Adress 1")
                }
                startActivity(intent)
            }

            else if (inputSearch == "Desc2") {
                Log.i("SearchFragment", inputSearch)
                val intent = Intent(activity, TileActivity::class.java).apply {
                    putExtra("image_resource", R.drawable.xd)
                    putExtra("title", "Description 2")
                    putExtra("distance", "Distance 2")
                    putExtra("address", "Adress 2")
                }
                startActivity(intent)
            }

            else if (inputSearch == "Desc3") {
                Log.i("SearchFragment", inputSearch)
                val intent = Intent(activity, TileActivity::class.java).apply {
                    putExtra("image_resource", R.drawable.xd)
                    putExtra("title", "Description 3")
                    putExtra("distance", "Distance 3")
                    putExtra("address", "Adress 3")
                }
                startActivity(intent)
            }

            else if (inputSearch == "Desc4") {
                Log.i("SearchFragment", inputSearch)
                val intent = Intent(activity, TileActivity::class.java).apply {
                    putExtra("image_resource", R.drawable.xd)
                    putExtra("title", "Description 4")
                    putExtra("distance", "Distance 4")
                    putExtra("address", "Adress 4")
                }
                startActivity(intent)
            }

            else if (inputSearch == "Desc5") {
                Log.i("SearchFragment", inputSearch)
                val intent = Intent(activity, TileActivity::class.java).apply {
                    putExtra("image_resource", R.drawable.xd)
                    putExtra("title", "Description 5")
                    putExtra("distance", "Distance 5")
                    putExtra("address", "Adress 5")
                }
                startActivity(intent)
            }

            else if (inputSearch == "Desc6") {
                Log.i("SearchFragment", inputSearch)
                val intent = Intent(activity, TileActivity::class.java).apply {
                    putExtra("image_resource", R.drawable.xd)
                    putExtra("title", "Description 6")
                    putExtra("distance", "Distance 6")
                    putExtra("address", "Adress 6")
                }
                startActivity(intent)
            }
        }
        return view
    }
}
