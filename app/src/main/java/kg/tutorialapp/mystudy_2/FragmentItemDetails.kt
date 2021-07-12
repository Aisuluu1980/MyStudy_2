package kg.tutorialapp.mystudy_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_item_details.*

class FragmentItemDetails : Fragment(R.layout.fragment_item_details) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }

    private fun setup() {
        val idFromArgs = arguments?.getLong(Long::class.java.canonicalName)

        idFromArgs?.let { id ->

            val details = Data.itemDetails.find { it.id == id }

            details?.let {
                detail_icon.setImageResource(details.icon)
                detail_name.text = details.name
                detail_creator.text = details.creator
                detail_description.text = details.description
            }
        }
    }

    companion object{
        fun newInstance(id: Long): FragmentItemDetails{
            val bundle = Bundle().apply {
                putLong(Long::class.java.canonicalName, id)
            }

            return FragmentItemDetails().apply { arguments = bundle }
        }
    }
}


