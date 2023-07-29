package com.example.aplicacin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.NumberFormat
import java.util.Locale

class DecisionesActivity : AppCompatActivity() {

    @SuppressLint("StringFormatInvalid")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_decisiones)

        val radioGroupOpciones = findViewById<RadioGroup>(R.id.radioGroupOpciones)
        val etCantidad = findViewById<EditText>(R.id.etCantidad)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)

        btnCalcular.setOnClickListener {
            val cantidadString = etCantidad.text.toString()
            if (cantidadString.isNotEmpty()) {
                val cantidad = cantidadString.toDouble()
                val porcentaje = when (radioGroupOpciones.checkedRadioButtonId) {
                    R.id.rbIva -> 0.12 // 12% de IVA
                    R.id.rbIgss -> 0.0483 // 4.83% de IGSS
                    R.id.rbSueldoLiquido -> 0.09 // 9% de retención de ISR para sueldo líquido
                    else -> 0.0
                }

                val resultado = cantidad * (1 - porcentaje)

                val nf = NumberFormat.getCurrencyInstance(Locale("es", "GT"))
                val resultadoFormateado = nf.format(resultado)

                tvResultado.text = getString(R.string.resultado, resultadoFormateado)
            } else {
                tvResultado.text = getString(R.string.ingrese_una_cantidad_valida)
            }
        }


        btnRegresar.setOnClickListener {
            finish()
        }
    }
}
