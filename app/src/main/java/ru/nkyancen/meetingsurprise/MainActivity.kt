package ru.nkyancen.meetingsurprise

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val kseniaButton = findViewById<Button>(R.id.buttonKsenia)
        val nikitaButton = findViewById<Button>(R.id.buttonNikita)
        val randomButton = findViewById<Button>(R.id.buttonRandom)

        kseniaButton.setOnClickListener {
            Toast.makeText(this, "Привет, Ксения!", Toast.LENGTH_SHORT).show()
            startProfile("Ксения Мишукова")
        }

        nikitaButton.setOnClickListener {
            Toast.makeText(this, "Привет, Никита!", Toast.LENGTH_SHORT).show()
            startProfile("Никита Янцен")
        }

        randomButton.setOnClickListener {
            val candidates = listOf("Ксения Мишукова", "Никита Янцен")
            val randomName = candidates[Random.nextInt(candidates.size)]
            startProfile(randomName)
        }
    }

    private fun startProfile(name: String) {
        val intent = Intent(this, ProfileActivity::class.java)
        intent.putExtra(ProfileActivity.EXTRA_NAME, name)
        startActivity(intent)
    }
}