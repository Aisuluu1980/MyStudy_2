package kg.tutorialapp.mystudy_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_myviewholder.*
import kotlinx.android.synthetic.main.item_myviewholder_1.view.*


class MyViewHolder_2(itemView: View): BaseViewHolder<Any>(itemView){
    override fun bind(item: Any){
    item as Item
    itemView.run{
        icon_image.setImageResource(item.icon)
        text_viewholder.text = item.name
    }
}

companion object{
    fun create(parent: ViewGroup, listener: MyAdapter1.OnClickListener): BaseViewHolder<Any>{
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_myviewholder_1,parent,false)
        val holder =  MyViewHolder_2(view)

        holder.itemView.setOnClickListener {
            listener.onItemClick(holder.adapterPosition)
        }

        holder.itemView.btn_holder.setOnClickListener {
            listener.onButtonClick(holder.adapterPosition)
        }

        return holder
    }
}
}