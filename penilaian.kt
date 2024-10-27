package com.example.quizdev

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Penilaian : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_penilaian)

        // Mengambil skor dari Intent
        val score = intent.getIntExtra("SCORE", 0)

        // Menampilkan skor di TextView
        val scoreTextView: TextView = findViewById(R.id.tv_skor)
        scoreTextView.text = score.toString()

        // Menambahkan klik listener pada button untuk berpindah ke rinciannilai
        val startButton: Button = findViewById(R.id.startButton)
        startButton.setOnClickListener {
            val intent = Intent(this, rinciannilai::class.java) // Membuat Intent
            startActivity(intent) // Memulai aktivitas rinciannilai
        }

        // Mengatur padding sesuai dengan insets dari sistem
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
