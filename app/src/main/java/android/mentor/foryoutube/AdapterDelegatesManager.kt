package android.mentor.foryoutube

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AdapterDelegatesManager<T>() {

    companion object {
        private const val DEFAULT_VIEW_TYPE = Integer.MAX_VALUE - 1
    }

    private val defaultDelegate = DefaultViewHolderDelegate()

    constructor(vararg delegates: AdapterDelegate<T>) : this() {
        delegates.forEach(::addDelegate)
    }

    private var delegates: HashMap<Int, AdapterDelegate<T>> = hashMapOf()

    private fun addDelegate(delegate: AdapterDelegate<T>): AdapterDelegatesManager<T> = apply {
        delegates[delegates.size] = delegate
    }

    fun getItemViewType(items: T, position: Int): Int {
        delegates.forEach { delegate ->
            if (delegate.value.isForViewType(items, position)) return delegate.key
        }
        return DEFAULT_VIEW_TYPE
    }

    fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        delegates.forEach { delegate ->
            if (delegate.key == viewType) return delegate.value.onCreateViewHolder(parent)
        }
        return defaultDelegate.onCreateViewHolder(parent)
    }

    fun onBindViewHolder(items: T, position: Int, viewHolder: RecyclerView.ViewHolder) {
        delegates.forEach { delegate ->
            if (delegate.value.isForViewType(items, position)) {
                return delegate.value.onBindViewHolder(items, position, viewHolder)
            }
        }
        @Suppress("UNCHECKED_CAST")
        return defaultDelegate.onBindViewHolder(items as List<String>, position, viewHolder)
    }
}
