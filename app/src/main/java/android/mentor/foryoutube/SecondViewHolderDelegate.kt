package android.mentor.foryoutube

import android.mentor.foryoutube.databinding.ItemSecondBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SecondViewHolderDelegate: AdapterDelegate<List<String>> {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder =
        SecondViewHolder(
            ItemSecondBinding.inflate(LayoutInflater.from(parent.context), parent, false),
        )

    override fun onBindViewHolder(
        items: List<String>,
        position: Int,
        holder: RecyclerView.ViewHolder
    ) {
        holder as SecondViewHolder
        holder.bind(items[position])
    }

    override fun isForViewType(items: List<String>, position: Int): Boolean {
        return items[position].contains("second", ignoreCase = true)
    }
}