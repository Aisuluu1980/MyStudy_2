package kg.tutorialapp.mystudy_2

import android.util.Log
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kg.tutorialapp.mystudy_2.MyAdapter.Type.Ad
import kg.tutorialapp.mystudy_2.MyAdapter.Type.ITEM

class MyAdapter: RecyclerView.Adapter<BaseViewHolder<Any>>() {
        private val items = arrayListOf<Any>()

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Any> {
            Log.i(MyAdapter.tag, "onCreateViewHolder()")
            return when(viewType){
                ITEM -> MyViewHolder.create(parent)
                else -> AdViewHolder.create(parent)
            }
        }

        override fun onBindViewHolder(holder:BaseViewHolder<Any>, position: Int) {
            Log.i(MyAdapter.tag, "onBindViewHolder()")
            holder.bind(items[position])
        }

        override fun getItemCount() = items.count()

    override fun getItemViewType(position: Int):Int{
        return when(items[position]){
            is String -> Ad
            is Item -> ITEM
            else -> -1
        }
    }
    fun setNewItems(newItems: List<Any>){
            items.clear()
            items.addAll(newItems)
            notifyDataSetChanged()
        }
        object Type{
            const val ITEM = 0
            const val Ad = 1
        }
        companion object{
            const val tag ="ADAPTER"
        }
}