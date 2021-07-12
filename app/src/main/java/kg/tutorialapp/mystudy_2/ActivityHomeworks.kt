package kg.tutorialapp.mystudy_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_homeworks.*

class ActivityHomeworks : AppCompatActivity() {
    lateinit var btnHw_41: Button
    lateinit var btnHw_42: Button
    lateinit var btnHw_43: Button
    lateinit var btnHw_46: Button
    lateinit var btnHw_47: Button
    lateinit var btnHw_49: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homeworks)
        runHw_41()
        runHw_42()
        runHw_43()
        runHw_46()
        runHw_47()
        runHw_49()
    }

    private fun runHw_49() {
        btnHw_49 = findViewById(R.id.btn_hw_49)
        btnHw_49.setOnClickListener{
            val hwSimpleService = Intent(this, ActivitySimpleService::class.java)
            startActivity(hwSimpleService)
        }

    }

    private fun runHw_47() {
        btnHw_47 = findViewById(R.id.btn_hw_47)
        btnHw_47.setOnClickListener{
            val hwReceiver = Intent(this, ActivityReceiver_47::class.java)
            startActivity(hwReceiver)
        }

    }

    private fun runHw_46() {
        btnHw_46 = findViewById(R.id.btn_hw_46)
        btnHw_46.setOnClickListener{
            val hwSharedPreferences = Intent(this, ActivitySharedPreferences::class.java)
            startActivity(hwSharedPreferences)
        }

    }

    private fun runHw_43() {
        btnHw_43 = findViewById(R.id.btn_hw_43)
        btnHw_43.setOnClickListener{
            val hwRecyclerEditText = Intent(this, RecyclerActivity_HW_43::class.java)
            startActivity(hwRecyclerEditText)
        }

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