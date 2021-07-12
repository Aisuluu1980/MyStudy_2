package kg.tutorialapp.mystudy_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityFragment_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_2)
        setUp()
    }
    private fun setUp() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container_2, Fragment_2())
            .commit()
    }
}