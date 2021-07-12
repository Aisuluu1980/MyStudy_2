package kg.tutorialapp.mystudy_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recycler_view.*

class ActivityRecyclerView : AppCompatActivity() {

    private lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        var actionBar = supportActionBar
        actionBar!!.title = "Main"
        actionBar.setDisplayHomeAsUpEnabled(true)

        setup()
    }

    private fun setup() {
        myAdapter = MyAdapter()
//        recycler = findViewById(R.id.recyclerView)
        recyclerView.adapter = myAdapter
        myAdapter.setNewItems(Data.getLongListOfItems())
    }

}