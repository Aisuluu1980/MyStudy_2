package kg.tutorialapp.mystudy_2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_ad_viewholder.view.*

class AdViewHolder_1(itemView:View):BaseViewHolder<Any>(itemView) {
    override fun bind(item: Any) {
        item as String
        itemView.ad_text.text = item
    }

    companion object {
        fun create(parent: ViewGroup, listener: MyAdapter1.OnClickListener): BaseViewHolder<Any> {
            val view = LayoutInflater.from(parent.context)
                    .inflate(R.layout.item_ad_viewholder, parent, false)
            return AdViewHolder(view).apply {
                itemView.setOnClickListener {
                    listener.onAdClick(adapterPosition)
                }
            }
        }
    }
}
