package kg.tutorialapp.mystudy_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_ad_viewholder.view.*

class AdViewHolder(itemView: View):BaseViewHolder<Any>(itemView){

    override fun bind(item:Any){
        item as String
        itemView.ad_text.text = item
    }
    companion object {
        fun create(parent: ViewGroup):AdViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_ad_viewholder,parent,false)
            return AdViewHolder(view)
        }
    }
}