package kg.tutorialapp.mystudy_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityLessons : AppCompatActivity() {
    lateinit var btn_42: Button
    lateinit var btn_43: Button
    lateinit var btn_44: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessons)
        runLesson_42()
        runLesson_43()
        runLesson_44()
    }

    private fun runLesson_44() {
        btn_44 = findViewById(R.id.btn_44)
        btn_44.setOnClickListener{
            val recyclerListenerIntent = Intent(this, ActivityRecyclerClickListener::class.java)
            startActivity(recyclerListenerIntent)
        }
    }

    private fun runLesson_42() {
        btn_42= findViewById(R.id.btn_42)
        btn_42.setOnClickListener {
            val recyclerLesson = Intent(this, ActivityRecyclerView::class.java)
            startActivity(recyclerLesson)
        }
    }
    private fun runLesson_43() {
        btn_43= findViewById(R.id.btn_43)
        btn_43.setOnClickListener {
            val recyclerLayoutManager = Intent(this, ActivityRecyclerView::class.java)
            startActivity(recyclerLayoutManager)
        }
    }

}