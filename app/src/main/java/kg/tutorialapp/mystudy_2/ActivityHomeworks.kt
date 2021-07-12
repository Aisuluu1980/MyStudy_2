package kg.tutorialapp.mystudy_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityHomeworks : AppCompatActivity() {
    lateinit var btnHw_41: Button
    lateinit var btnHw_42: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeworks)
        runHw_41()
        runHw_42()
    }

    private fun runHw_42() {
        btnHw_42 = findViewById(R.id.btn_hw_42)
        btnHw_42.setOnClickListener{
            val hwNotifications = Intent(this, ActivityNotifications::class.java)
            startActivity(hwNotifications)
        }
    }

    private fun runHw_41() {
            btnHw_41 = findViewById(R.id.btn_hw_41)
            btnHw_41.setOnClickListener {
                val hwDrawerFragments = Intent(this, ActivityNavigationDrawer::class.java)
                startActivity(hwDrawerFragments)
            }
        }
}