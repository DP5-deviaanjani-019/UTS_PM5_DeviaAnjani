package com.example.quizdev

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

class Quiz1 : AppCompatActivity() {

    private val questions = listOf(
        "Apa yang dimaksud dengan 'API'?",
        "Bahasa pemrograman mana yang paling sering digunakan untuk pengembangan aplikasi web front-end?",
        "Framework mana yang sering digunakan untuk pengembangan aplikasi mobile di Android?",
        "Apa fungsi dari 'Version Control System' (VCS)?",
        "Manakah dari berikut ini yang merupakan metode pengembangan perangkat lunak yang berfokus pada iterasi dan umpan balik?"
    )

    private val options = listOf(
        listOf("Application Programming Interface", "Automated Program Integration", "Application Process Information", "Automatic Programming Interface", "None of the above"),
        listOf("Python", "Java", "JavaScript", "C++", "Ruby"),
        listOf("Django", "React", "Spring", "Flutter", "Angular"),
        listOf("Mengelola database", "Mengelola versi dan kolaborasi kode", "Mengoptimalkan kecepatan aplikasi", "Mengelola sistem operasi", "Meningkatkan keamanan aplikasi"),
        listOf("Waterfall", "Agile", "V-Model", "Spiral", "Big Bang")
    )

    private val correctAnswers = listOf(
        "Application Programming Interface",
        "JavaScript",
        "Flutter",
        "Mengelola versi dan kolaborasi kode",
        "Agile"
    )

    private var currentQuestionIndex = 0 
