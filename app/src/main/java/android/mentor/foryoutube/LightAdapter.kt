package android.mentor.foryoutube

import android.mentor.foryoutube.databinding.ItemDefaultBinding
import android.mentor.foryoutube.databinding.ItemFirstBinding
import android.mentor.foryoutube.databinding.ItemSecondBinding
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class LightAdapter(
    private val items: List<String>,
): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private val delegatesManager = AdapterDelegatesManager(
        FirstViewHolderDelegate(),
        SecondViewHolderDelegate(),
    )

    override fun getItemViewType(position: Int): Int {
        return delegatesManager.getItemViewType(items, position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return delegatesManager.onCreateViewHolder(parent, viewType)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        delegatesManager.onBindViewHolder(items, position, holder)
    }

    override fun getItemCount(): Int = items.size
}
