package kg.tutorialapp.mystudy_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlin.collections.ArrayList

class MyAdaper2(private val context: Context, private val myList: ArrayList<String>): RecyclerView.Adapter<MyAdaper2.ViewHolder>(){


    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(myItem: String, index:Int) {
            val tvTitle = itemView.findViewById<TextView>(R.id.text_viewholder)
            tvTitle.text = myItem
            itemView.setOnClickListener {
                Toast.makeText(context, myItem, Toast.LENGTH_LONG).show()
            }
            val delete = itemView.findViewById<ImageButton>(R.id.btn_delete_item)
            delete.setOnClickListener { deleteItem(index) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val myListItem = LayoutInflater.from(context).inflate(R.layout.item_viewholder_with_delete, parent, false)
        return ViewHolder(myListItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(myList[position], position)
    }
    override fun getItemCount(): Int {
        return myList.count()
    }
    fun deleteItem(index:Int){
        myList.removeAt(index)
        notifyDataSetChanged()
    }
}