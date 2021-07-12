package kg.tutorialapp.mystudy_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivitySimpleService : AppCompatActivity() {
    lateinit var btn_simple: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_service)

        btn_simple = findViewById(R.id.btn_service)
        btn_simple.setOnClickListener {
            val hwServiceSimple = Intent(this, SimpleService::class.java)
            startService(hwServiceSimple)
        }
    }
}