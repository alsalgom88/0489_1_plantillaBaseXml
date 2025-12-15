package com.example.plantillabasexml
// Paquet on es troba aquesta activitat.

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.plantillabasexml.databinding.ActivityMainConstraintBinding
// Importem el ViewBinding generat automàticament per al layout constraint

/**
 * Activitat que utilitza un ConstraintLayout.
 * Permet treballar amb constriccions modernes i layouts adaptatius.
 */
class MainConstraintActivity : AppCompatActivity() {

    // Declarem la variable de binding (per accedir a les vistes XML sense findViewById)
    private lateinit var binding: ActivityMainConstraintBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        // Mètode que s’executa en crear-se l’activitat
        super.onCreate(savedInstanceState)

        // Inflem el layout Constraint i creem el binding
        binding = ActivityMainConstraintBinding.inflate(layoutInflater)

        // Assignem el layout inflat com a vista principal
        setContentView(binding.root)

        // Canviem el text inicial del TextView
        binding.textViewHello.text = "ConstraintLayout actiu!"

        // Acció en fer clic al botó
        binding.buttonClick.setOnClickListener {
            binding.textViewHello.text = "Has fet clic (ConstraintLayout)"
        }
    }
}