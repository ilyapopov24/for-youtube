package android.mentor.foryoutube

import android.mentor.foryoutube.databinding.ItemSecondBinding
import androidx.recyclerview.widget.RecyclerView

class SecondViewHolder(private val item: ItemSecondBinding): RecyclerView.ViewHolder(item.root) {
    fun bind(text: String) {
        item.second.text = text
    }
}
