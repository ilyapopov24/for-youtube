package android.mentor.foryoutube

import android.mentor.foryoutube.databinding.ItemDefaultBinding
import android.mentor.foryoutube.databinding.ItemFirstBinding
import androidx.recyclerview.widget.RecyclerView

class DefaultViewHolder(private val item: ItemDefaultBinding): RecyclerView.ViewHolder(item.root) {
    fun bind(text: String) {
        item.defaultTextview.text = text
    }
}
