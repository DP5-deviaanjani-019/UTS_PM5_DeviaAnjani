package com.example.quizdev

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Button
import android.widget.TextView

class rinciannilai : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rinciannilai)

        // Set padding agar UI mengikuti insets dari sistem
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Mendapatkan TextView dan menampilkan soal
        val tvSoal = findViewById<TextView>(R.id.tv_soal)
        tvSoal.text = getSoalText()

        // Menambahkan klik listener pada Button "Tutup"
        val btnTutup = findViewById<Button>(R.id.btn_tutup)
        btnTutup.setOnClickListener {
            // Intent untuk kembali ke halaman Intro
            val intent = Intent(this, Intro::class.java)
            startActivity(intent)
            finish() // Tutup aktivitas saat ini agar tidak bisa kembali dengan tombol Back
        }
    }

    // Fungsi untuk menyusun soal dan jawaban
    private fun getSoalText(): String {
        return StringBuilder().apply {
            append("1. Apa yang dimaksud dengan 'API'?\n")
            append("A. Application Programming Interface\n")
            append("B. Automated Program Integration\n")
            append("C. Application Process Information\n")
            append("D. Automatic Programming Interface\n")
            append("E. None of the above\n")
            append("Jawaban Benar: A. Application Programming Interface\n\n")

            append("2. Bahasa pemrograman mana yang paling sering digunakan untuk pengembangan aplikasi web front-end?\n")
            append("A. Python\n")
            append("B. Java\n")
            append("C. JavaScript\n")
            append("D. C++\n")
            append("E. Ruby\n")
            append("Jawaban Benar: C. JavaScript\n\n")

            append("3. Framework mana yang sering digunakan untuk pengembangan aplikasi mobile di Android?\n")
            append("A. Django\n")
            append("B. React\n")
            append("C. Spring\n")
            append("D. Flutter\n")
            append("E. Angular\n")
            append("Jawaban Benar: D. Flutter\n\n")

            append("4. Apa fungsi dari 'Version Control System' (VCS)?\n")
            append("A. Mengelola database\n")
            append("B. Mengelola versi dan kolaborasi kode\n")
            append("C. Mengoptimalkan kecepatan aplikasi\n")
            append("D. Mengelola sistem operasi\n")
            append("E. Meningkatkan keamanan aplikasi\n")
            append("Jawaban Benar: B. Mengelola versi dan kolaborasi kode\n\n")

            append("5. Manakah dari berikut ini yang merupakan metode pengembangan perangkat lunak yang berfokus pada iterasi dan umpan balik?\n")
            append("A. Waterfall\n")
            append("B. Agile\n")
            append("C. V-Model\n")
            append("D. Spiral\n")
            append("E. Big Bang\n")
            append("Jawaban Benar: B. Agile\n")
        }.toString()
    }
}
