package com.example.aplicacin


import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNombre = findViewById<EditText>(R.id.etNombre)
        val etContrasena = findViewById<EditText>(R.id.etContrasena)
        val btnIniciarSesion = findViewById<Button>(R.id.btnIniciarSesion)
        val tvMensajeError = findViewById<TextView>(R.id.tvMensajeError)

        btnIniciarSesion.setOnClickListener {
            val nombre = etNombre.text.toString()
            val contrasena = etContrasena.text.toString()

            if (nombre == "Kenneth" && contrasena == "Hola") {
                val intent = Intent(this, SegundoActivity::class.java)
                startActivity(intent)
            } else {
                tvMensajeError.text = "Nombre o contraseña incorrectos"
            }
        }
    }
}
