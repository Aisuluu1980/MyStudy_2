package kg.tutorialapp.mystudy_2

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recycler_click_listener.*

class ActivityRecyclerClickListener : AppCompatActivity(), FragmentItemLestener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_click_listener)

        supportFragmentManager.beginTransaction()
                .add(R.id.container, FragmentItems())
                .addToBackStack(null)
                .commit()
    }
    override fun openFragmentItemDetails(id: Long) {
        supportFragmentManager
                .beginTransaction()
                .replace(R.id.container, FragmentItemDetails.newInstance(id))
                .addToBackStack(null)
                .commit()
    }

    override fun openBrowser(url: String) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(intent)
    }
}