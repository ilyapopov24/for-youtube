package android.mentor.foryoutube

import android.mentor.foryoutube.databinding.ItemDefaultBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class DefaultViewHolderDelegate: AdapterDelegate<List<String>> {

    override fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder =
        DefaultViewHolder(
            ItemDefaultBinding.inflate(LayoutInflater.from(parent.context), parent, false),
        )

    override fun onBindViewHolder(
        items: List<String>,
        position: Int,
        holder: RecyclerView.ViewHolder
    ) {
        holder as DefaultViewHolder
        holder.bind(items[position])
    }

    override fun isForViewType(items: List<String>, position: Int) = true
}
