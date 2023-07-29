package com.example.aplicacin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TrianguloPascalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangulo_pascal)

        val etNumero = findViewById<EditText>(R.id.etNumero)
        val btnRealizarPascal = findViewById<Button>(R.id.btnRealizarPascal)
        val tvResultadoPascal = findViewById<TextView>(R.id.tvResultadoPascal)

        btnRealizarPascal.setOnClickListener {
            val filas = etNumero.text.toString().toInt()
            val trianguloPascal = generarTrianguloPascal(filas)
            tvResultadoPascal.text = trianguloPascal.joinToString("\n")
        }

        val btnRegresar = findViewById<Button>(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            finish()
        }
    }

    private fun generarTrianguloPascal(filas: Int): List<String> {
        val trianguloPascal = mutableListOf<String>()

        for (i in 0 until filas) {
            var num = 1
            val valoresFila = StringBuilder()

            for (j in 0..i) {
                valoresFila.append(String.format("%4d", num))
                num = num * (i - j) / (j + 1)
            }

            val espacios = (filas - i - 1) * 2
            trianguloPascal.add(String.format("%${espacios}s%s", "", valoresFila.toString()))
        }

        return trianguloPascal
    }
}
