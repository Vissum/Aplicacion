package com.example.aplicacin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FibonacciActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fibonacci)

        val etNumero = findViewById<EditText>(R.id.etNumero)
        val btnRealizarFibonacci = findViewById<Button>(R.id.btnRealizarFibonacci)
        val tvResultadoFibonacci = findViewById<TextView>(R.id.tvResultadoFibonacci)

        btnRealizarFibonacci.setOnClickListener {
            val numero = etNumero.text.toString().toInt()
            val resultado = generateFibonacciSeries(numero)
            tvResultadoFibonacci.text = resultado.joinToString(", ")
        }

        val btnRegresar = findViewById<Button>(R.id.btnRegresar)
        btnRegresar.setOnClickListener {
            finish()
        }
    }

    private fun generateFibonacciSeries(n: Int): List<Int> {
        val fibonacciSeries = mutableListOf<Int>()

        var num1 = 0
        var num2 = 1

        for (i in 1..n) {
            fibonacciSeries.add(num1)
            val sum = num1 + num2
            num1 = num2
            num2 = sum
        }

        return fibonacciSeries
    }
}
