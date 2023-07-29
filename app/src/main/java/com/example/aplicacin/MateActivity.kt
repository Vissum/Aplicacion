package com.example.aplicacin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MateActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mate)

        val etNumero1 = findViewById<EditText>(R.id.etNumero1)
        val etNumero2 = findViewById<EditText>(R.id.etNumero2)
        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val btnOperar = findViewById<Button>(R.id.btnOperar)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        btnOperar.setOnClickListener {
            val num1 = etNumero1.text.toString().toDouble()
            val num2 = etNumero2.text.toString().toDouble()

            val selectedOperationId = radioGroup.checkedRadioButtonId

            val resultado = when (findViewById<RadioButton>(selectedOperationId).text.toString()) {
                "Suma" -> num1 + num2
                "Resta" -> num1 - num2
                "Multiplicación" -> num1 * num2
                "División" -> num1 / num2
                else -> 0.0
            }


            tvResultado.text = "Resultado: $resultado"
        }

        btnRegresar.setOnClickListener {
            finish()
        }
    }
}
