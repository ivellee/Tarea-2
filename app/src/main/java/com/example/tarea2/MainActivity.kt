package com.example.tarea2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*Mandamos a llamar a los elementos*/
        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextEmail = findViewById<EditText>(R.id.editTextEmail)
        val editTextPhone = findViewById<EditText>(R.id.editTextPhone)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        val mainScreenLayout = findViewById<View>(R.id.mainScreenLayout)

        val textViewName = findViewById<TextView>(R.id.textViewName)
        val textViewEmail = findViewById<TextView>(R.id.textViewEmail)
        val textViewPhone = findViewById<TextView>(R.id.textViewPhone)

        /*Al presionar el botón*/
        buttonSubmit.setOnClickListener {
            /*Entrada de los datos en los cuadros de texto*/
            val name = editTextName.text.toString().trim()
            val email = editTextEmail.text.toString().trim()
            val phone = editTextPhone.text.toString().trim()

            /*Validar que los campos esten rellenos*/
            if (name.isEmpty() || email.isEmpty() || phone.isEmpty()) {
                Toast.makeText(this, "Por favor, completa todos los campos.", Toast.LENGTH_SHORT).show()
            } else {
                /*Ocultamos el formulario para mostrar la pantalla principal*/
                editTextName.visibility = View.GONE
                editTextEmail.visibility = View.GONE
                editTextPhone.visibility = View.GONE
                buttonSubmit.visibility = View.GONE

                mainScreenLayout.visibility = View.VISIBLE

                /*Mostrar los datos en la pantalla principal*/
                textViewName.text = "Nombre: $name"
                textViewEmail.text = "Correo: $email"
                textViewPhone.text = "Teléfono: $phone"
            }
        }
    }
}


