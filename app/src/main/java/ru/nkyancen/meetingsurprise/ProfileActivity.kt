package ru.nkyancen.meetingsurprise

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val name = intent.getStringExtra(EXTRA_NAME) ?: "Гость"
        val titleView = findViewById<TextView>(R.id.textName)
        titleView.text = name
    }

    companion object {
        const val EXTRA_NAME = "extra_name"
    }
}