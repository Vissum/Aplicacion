package com.example.aplicacin


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SegundoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segundo)

        val btnMatematicaBasica = findViewById<View>(R.id.btnMatematicaBasica)
        val btnDecisiones = findViewById<View>(R.id.btnDecisiones)
        val btnConjeturas = findViewById<View>(R.id.btnConjeturas)
        val btnRetornar = findViewById<View>(R.id.btnRetornar)

        btnMatematicaBasica.setOnClickListener {
            val intent = Intent(this, MateActivity::class.java)
            startActivity(intent)
        }

        btnDecisiones.setOnClickListener {
            val intent = Intent(this, DecisionesActivity::class.java)
            startActivity(intent)

        }

        btnConjeturas.setOnClickListener {
            val intent = Intent(this, ConjeturasActivity::class.java)
            startActivity(intent)
        }

        btnRetornar.setOnClickListener {

            finish()
        }
    }
}
