package com.example.plantillabasexml
// Defineix el paquet del projecte (equivalent a una carpeta lògica del codi)

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.plantillabasexml.databinding.ActivityMainLinearBinding
// Importem les classes necessàries i el ViewBinding associat al layout "activity_main_linear.xml"

/**
 * Aquesta activitat utilitza un LinearLayout i ViewBinding.
 * És la versió més senzilla per començar a treballar amb Android.
 */
class MainLinearActivity : AppCompatActivity() {

    // Declarem una variable per al binding (enllaça el codi amb el layout XML)
    // lateinit vol dir que la inicialitzarem després, dins d’onCreate()
    private lateinit var binding: ActivityMainLinearBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // Aquesta funció s’executa automàticament quan es crea l’activitat.
        super.onCreate(savedInstanceState)

        // Infla el fitxer XML i crea una instància del binding amb totes les vistes accessibles.
        binding = ActivityMainLinearBinding.inflate(layoutInflater)

        // Defineix el contingut visual de l’activitat (root = arrel del layout)
        setContentView(binding.root)

        // Canviem el text inicial del TextView
        binding.textViewHello.text = "LinearLayout actiu!"

        // Definim què passa quan l’usuari fa clic al botó
        binding.buttonClick.setOnClickListener {
            // Quan es fa clic, canviem el text del TextView
            binding.textViewHello.text = "Has fet clic (LinearLayout)"
        }
    }
}