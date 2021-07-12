package kg.tutorialapp.mystudy_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityHomeworks : AppCompatActivity() {
    lateinit var btnHw_41: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeworks)
        runHw_41()
    }

    private fun runHw_41() {
            btnHw_41 = findViewById(R.id.btn_hw_41)
            btnHw_41.setOnClickListener {
                val hwDrawerFragments = Intent(this, ActivityNavigationDrawer::class.java)
                startActivity(hwDrawerFragments)
            }
        }
}