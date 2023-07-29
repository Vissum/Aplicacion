package com.example.aplicacin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ConjeturasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conjeturas)

        val btnCollatz = findViewById<Button>(R.id.btnCollatz)
        val btnFibonacci = findViewById<Button>(R.id.btnFibonacci)
        val btnTrianguloPascal = findViewById<Button>(R.id.btnTrianguloPascal)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)

        btnCollatz.setOnClickListener {
            val intent = Intent(this, CollatzActivity::class.java)
            startActivity(intent)
        }

        btnFibonacci.setOnClickListener {
            val intent = Intent(this, FibonacciActivity::class.java)
            startActivity(intent)
        }

        btnTrianguloPascal.setOnClickListener {
            val intent = Intent(this, FibonacciActivity::class.java)
            startActivity(intent)
        }

        btnRegresar.setOnClickListener {
            finish()
        }
    }
}
