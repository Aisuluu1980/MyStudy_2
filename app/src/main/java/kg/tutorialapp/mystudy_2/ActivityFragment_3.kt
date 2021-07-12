package kg.tutorialapp.mystudy_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityFragment_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_3)
        setUp()
    }
    private fun setUp() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container_3, Fragment_3())
            .commit()
    }
}