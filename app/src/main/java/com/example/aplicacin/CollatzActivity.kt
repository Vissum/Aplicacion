package com.example.aplicacin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CollatzActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collatz)

        val etNumero = findViewById<EditText>(R.id.etNumero)
        val btnRealizarConjetura = findViewById<Button>(R.id.btnRealizarConjetura)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btnRealizarConjetura.setOnClickListener {
            val input = etNumero.text.toString()
            if (input.isNotEmpty()) {
                val number = input.toLong()
                val result = collatzConjecture(number)
                tvResultado.text = result
            }
        }

        btnRegresar.setOnClickListener {
            finish()
        }
    }

    private fun collatzConjecture(number: Long): String {
        var n = number
        var result = "$n"
        while (n != 1L) {
            n = if (n % 2 == 0L) n / 2 else (3 * n) + 1
            result += ", $n"
        }
        return result
    }
}
