package ru.nkyancen.meetingsurprise

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Находим кнопки по id
        val kseniaButton = findViewById<Button>(R.id.buttonKsenia)
        val nikitaButton = findViewById<Button>(R.id.buttonNikita)

        // Обработчики нажатий
        kseniaButton.setOnClickListener {
            Toast.makeText(this, "Привет, Ксения!", Toast.LENGTH_SHORT).show()
        }

        nikitaButton.setOnClickListener {
            Toast.makeText(this, "Привет, Никита!", Toast.LENGTH_SHORT).show()
        }
    }
}