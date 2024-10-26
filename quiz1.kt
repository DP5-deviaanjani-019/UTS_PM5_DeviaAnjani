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
