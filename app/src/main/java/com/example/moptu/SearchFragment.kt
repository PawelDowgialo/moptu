package com.example.moptu

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
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

        val rEdittext = Regex("^\\p{L}+[^0-9]")

        imageViewSearch.setOnClickListener {
            val inputSearch = editTextSearch.text.toString()
            if (rEdittext.matches(editTextSearch.text)){
                if (inputSearch == "Jura") {
                    val intent = Intent(activity, TileActivity::class.java).apply {
                        putExtra("image_resource", R.drawable.jurakrakowskoczestochowska_zdj)
                        putExtra("title", "Jura Krakowsko-Częstochowska")
                        putExtra("distance", "519 km")
                        putExtra("address", "Wyżyna Krakowsko-Częstochowska, 32-047, woj. śląskie")
                        putExtra("phone", "887 704 885")
                        putExtra("description", "Wyżyna Krakowsko-Częstochowska (341.3) – " +
                                "makroregion geograficzny położony w południowej Polsce, " +
                                "wschodnia część Wyżyny Śląsko-Krakowskiej. Znajduje się w" +
                                " dorzeczu górnej Wisły oraz górnej Warty. Historycznie Wyżyna " +
                                "Krakowsko-Częstochowska leży w zachodniej Małopolsce przy granicy ze " +
                                "Śląskiem. Na Wyżynie zbudowano system średniowiecznych zamków, " +
                                "niegdyś strzegących granicy Królestwa Polskiego przed napadami z " +
                                "Górnego Śląska (tzw. Orle Gniazda).")
                    }
                    startActivity(intent)
                }

                else if (inputSearch == "Biebrza") {
                    Log.i("SearchFragment", inputSearch)
                    val intent = Intent(activity, TileActivity::class.java).apply {
                        putExtra("image_resource", R.drawable.kanalelblaski_zdj)
                        putExtra("title", "Biebrzański Park Narodowy")
                        putExtra("distance", "189 km")
                        putExtra("address", "Biebrzański Park Narodowy, woj. podlaskie")
                        putExtra("phone", "795 222 304")
                        putExtra("description", "Biebrzański Park Narodowy – polski park narodowy, " +
                                "utworzony w 1993 roku na terenach Kotliny Biebrzańskiej w województwie podlaskim. " +
                                "Największy Park w Polsce o powierzchni 592,23 km². Siedziba Parku znajduje się w Osowcu-Twierdzy, gmina Goniądz.\n" +
                                "Obejmuje dolinę Biebrzy począwszy od ujścia Niedźwiedzicy do Biebrzy, a skończywszy na" +
                                " ujściu Biebrzy do Narwi. Niemal cały bieg Biebrzy znajduje się na terenie parku (ok. 155 km). " +
                                "Ochronę tego terenu zapoczątkowano w latach międzywojennych, tworząc dwa rezerwaty: Czerwone Bagno " +
                                "(w zmienionych granicach istniejący do dziś) oraz Grzędy.")
                    }
                    startActivity(intent)
                }

                else if (inputSearch == "Sandomierz") {
                    Log.i("SearchFragment", inputSearch)
                    val intent = Intent(activity, TileActivity::class.java).apply {
                        putExtra("image_resource", R.drawable.sandomierz_zdj)
                        putExtra("title", "Sandomierz")
                        putExtra("distance", "455 km")
                        putExtra("address", "Sandomierz, woj. świętokrzyskie")
                        putExtra("phone", "729 563 839")
                        putExtra("description", "Sandomierz (wym. [sãnˈdɔ̃mʲjɛʃ] ( odsłuchaj), łac. Sandomiria) – " +
                                "miasto w województwie świętokrzyskim, w powiecie sandomierskim, położone nad Wisłą, na siedmiu " +
                                "wzgórzach (stąd nazywane czasem „małym Rzymem”). Sandomierz jest usytuowany na Nizinie Nadwiślańskiej " +
                                "i rozciąga się od Wyżyny Sandomierskiej po Równinę Tarnobrzeską. Większość zabudowy wraz z historycznym " +
                                "centrum, uznanym w 2017 za pomnik historii, położona jest na lewym brzegu Wisły, a przemysłowa część, " +
                                "zwana Nadbrzeziem, leży przy prawym brzegu, w Kotlinie Sandomierskiej, granicząc z Tarnobrzegiem.\n" +
                                "\n" +
                                "Przez miasto przebiegają szlaki turystyczne: cysterski, św. Jakuba, Via Jagiellonica, " +
                                "Architektury Drewnianej oraz Wschodni Szlak Rowerowy Green Velo.\n" +
                                "\n" +
                                "Historycznie położony jest w Małopolsce, główne miasto dawnej ziemi sandomierskiej, następnie " +
                                "województwa sandomierskiego. Miasto królewskie w powiecie sandomierskim województwa sandomierskiego " +
                                "w drugiej połowie XVI wieku. W czasach Rzeczypospolitej Obojga Narodów w Sandomierzu mieściła się " +
                                "kasa szafarzy podatków dla Małopolski. Sandomierz uzyskał prawo składu w 1286 roku.")
                    }
                    startActivity(intent)
                }

                else if (inputSearch == "Bory") {
                    Log.i("SearchFragment", inputSearch)
                    val intent = Intent(activity, TileActivity::class.java).apply {
                        putExtra("image_resource", R.drawable.wolinski_zdj)
                        putExtra("title", "Bory Tucholskie")
                        putExtra("distance", "199 km")
                        putExtra("address", "Bory Tucholskie, granica województw kujawsko-pomorskiego i pomorskiego")
                        putExtra("phone", "674 366 523")
                        putExtra("description", "Bory Tucholskie (kaszub. Tëchòlsczé Bòrë, niem. Tucheler Heide) – " +
                                "jeden z najbardziej rozległych kompleksów borów sosnowych w Polsce. Zajmuje ok. 3 tys. km² " +
                                "sandru w dorzeczu Brdy i Wdy oraz Równiny Tucholskiej i Równiny Charzykowskiej. Od " +
                                "lasów tych wziął nazwę również mezoregion fizycznogeograficzny Bory Tucholskie znajdujący " +
                                "się we wschodniej części kompleksu oraz szereg powierzchniowych form ochrony przyrody: " +
                                "park narodowy, rezerwat biosfery, obszar Natura 2000, a także leśny kompleks promocyjny. " +
                                "Bory Tucholskie dały również nazwy jednostkom różnych systemów podziału geobotanicznego, np. " +
                                "okręg Borów Tucholskich w systemie Szafera i Zarzyckiego lub dzielnica Borów Tucholskich w " +
                                "systemie Mroczkiewicza.\n" +
                                "\n" +
                                "Terytorium Borów Tucholskich zamieszkane jest przez rdzenną ludność Borowiaków Tucholskich," +
                                " a także Kaszubów, Kociewiaków oraz Krajniaków.")
                    }
                    startActivity(intent)
                }

                else if (inputSearch == "Wolin") {
                    Log.i("SearchFragment", inputSearch)
                    val intent = Intent(activity, TileActivity::class.java).apply {
                        putExtra("image_resource", R.drawable.wolinski_zdj)
                        putExtra("title", "Wolin")
                        putExtra("distance", "513 km")
                        putExtra("address", "Woliński Park Narodowy, Grodno 1, 72-500 Międzyzdroje")
                        putExtra("phone", "664 346 723")
                        putExtra("description", "Woliński Park Narodowy – polski park narodowy znajdujący się w województwie " +
                                "zachodniopomorskim, w środkowo-zachodniej części wyspy Wolin, pomiędzy Zatoką Pomorską i " +
                                "Zalewem Szczecińskim. Powierzchnia parku wynosi 10 937 ha. W logo parku znajdują się " +
                                "bielik zwyczajny oraz nieco bardziej schowany mikołajek nadmorski.")
                    }
                    startActivity(intent)
                }

                else if (inputSearch == "Elbląg") {
                    Log.i("SearchFragment", inputSearch)
                    val intent = Intent(activity, TileActivity::class.java).apply {
                        putExtra("image_resource", R.drawable.kanalelblaski_zdj)
                        putExtra("title", "Kanał Elbląski")
                        putExtra("distance", "107 km")
                        putExtra("address", "Kanał Elbląski, woj. warmińsko-mazurskie")
                        putExtra("phone", "664 356 421")
                        putExtra("description", "Kanał Elbląski (niem. Oberländischer Kanal, pol. Kanał Oberlandzki) – " +
                                "żeglowna droga wodna na terenie województwa warmińsko-mazurskiego. W 1978 fragment kanału uznano " +
                                "za zabytek techniki, natomiast w 2011 został uznany za pomnik historii. Kanał Elbląski w 2007 r. " +
                                "w plebiscycie „Rzeczpospolitej” został uznany za jeden z siedmiu cudów Polski.")
                    }
                    startActivity(intent)
                }else{
                    val builder = AlertDialog.Builder(requireContext())
                    builder.setTitle("Błąd")
                    builder.setMessage("Błędna nazwa")
                    builder.setPositiveButton("OK") { dialog, _ ->
                        dialog.dismiss()
                    }
                    builder.create().show()
                }
            }else{
                val builder = AlertDialog.Builder(requireContext())
                builder.setTitle("Błąd")
                builder.setMessage("Błędna nazwa")
                builder.setPositiveButton("OK") { dialog, _ ->
                    dialog.dismiss()
                }
                builder.create().show()
            }

        }
        return view
    }
}
