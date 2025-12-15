package com.example.plantillabasexml
// Paquet principal del projecte

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
// Importem classes per treballar amb vistes tradicionals (sense ViewBinding)

/**
 * Aquesta activitat representa la versió antiga.
 * No utilitza ViewBinding, sinó que accedeix manualment a les vistes amb findViewById().
 */
class MainLegacyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // Aquesta funció s’executa al crear-se l’activitat.
        super.onCreate(savedInstanceState)

        // Indiquem quin layout XML volem mostrar (antic mètode)
        setContentView(R.layout.activity_main_legacy)

        // Busquem manualment les vistes pel seu ID definit a XML
        val textView = findViewById<TextView>(R.id.textViewHello)
        val button = findViewById<Button>(R.id.buttonClick)

        // Modifiquem el text inicial
        textView.text = "Versió antiga amb findViewById"

        // Afegim l’esdeveniment de clic del botó
        button.setOnClickListener {
            textView.text = "Has fet clic (antic)"
        }
    }
}