package kg.tutorialapp.mystudy_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ActivityFragment_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment_1)
        setUp()
    }

    private fun setUp() {
        supportFragmentManager
            .beginTransaction()
            .add(R.id.container_1, Fragment_1())
            .commit()
    }
}


