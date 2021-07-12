package kg.tutorialapp.mystudy_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnLesoons: Button
    lateinit var btnHw: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        runLessons()
        runHw()
    }

    private fun runHw() {
        btnHw = findViewById(R.id.btn_hw)
        btnHw.setOnClickListener {
            val homeWorks = Intent(this, ActivityHomeworks::class.java)
            startActivity(homeWorks)
        }
    }

    private fun runLessons() {
        btnLesoons = findViewById(R.id.btn_lessons)
        btnLesoons.setOnClickListener {
            val lessons = Intent(this, ActivityLessons::class.java)
            startActivity(lessons)
        }
    }
}