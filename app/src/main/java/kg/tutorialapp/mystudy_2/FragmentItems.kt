package kg.tutorialapp.mystudy_2

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.fragment_items.*

class FragmentItems : Fragment(R.layout.fragment_items), MyAdapter1.OnClickListener {
    private lateinit var myAdapter: MyAdapter1
    private lateinit var listener: FragmentItemLestener
    private lateinit var list: List<Any>

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is FragmentItemLestener) listener = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }

    private fun setup() {
        list = Data.getLongListOfItems()
        myAdapter = MyAdapter1(this)
        recyclerView.adapter = myAdapter
        myAdapter.setNewItems(list)
    }

    override fun onItemClick(position: Int) {
        val item = list [position] as Item
        listener.openFragmentItemDetails(item.id)
    }

    override fun onAdClick(position: Int) {
        val url = list[position] as String
        listener.openBrowser(url)
    }

    override fun onButtonClick(position: Int) {
        val item = list[position] as Item
        Toast.makeText(context,item.name, Toast.LENGTH_SHORT).show()
    }
}
