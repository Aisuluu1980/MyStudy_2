package kg.tutorialapp.mystudy_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityLessons : AppCompatActivity() {
    lateinit var btn_42: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessons)
        runLesson_42()
    }

    private fun runLesson_42() {
        btn_42= findViewById(R.id.btn_42)
        btn_42.setOnClickListener {
            val recyclerLesson = Intent(this, ActivityRecyclerView::class.java)
            startActivity(recyclerLesson)
        }
    }

}