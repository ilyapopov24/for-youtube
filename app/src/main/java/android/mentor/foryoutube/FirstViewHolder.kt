package android.mentor.foryoutube

import android.mentor.foryoutube.databinding.ItemFirstBinding
import androidx.recyclerview.widget.RecyclerView

class FirstViewHolder(private val item: ItemFirstBinding): RecyclerView.ViewHolder(item.root) {
    fun bind(text: String) {
        item.first.text = text
    }
}
