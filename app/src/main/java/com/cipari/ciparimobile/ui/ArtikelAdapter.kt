package com.cipari.ciparimobile.ui

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cipari.ciparimobile.R
import com.cipari.ciparimobile.databinding.ItemArtikelBinding
import com.cipari.ciparimobile.model.Artikel
import com.bumptech.glide.Glide

class ArtikelAdapter : RecyclerView.Adapter<ArtikelAdapter.GameViewHolder>() {
    private var listData = ArrayList<Artikel>()
    var onItemClick: ((Artikel) -> Unit)? = null

    fun setData(newListData: List<Artikel>?) {
        if (newListData == null) return
        listData.clear()
        listData.addAll(newListData)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder =
        GameViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_artikel, parent, false)
        )

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = listData.size

    inner class GameViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemArtikelBinding.bind(itemView)
        fun bind(data: Artikel) {

            binding.apply {
                txtTitle.text = data.title
                txtDesc.text = data.description
                Glide.with(itemView.context)
                    .load(data.image)
                    .into(imgArtikel)
                root.setOnClickListener {
                    itemView.context.startActivity(Intent(itemView.context, DetailArtikelActivity::class.java).apply {
                        putExtra(DetailArtikelActivity.EXTRA_ARTIKEL, data)
                    })
                    onItemClick?.invoke(listData[adapterPosition])
                }
            }
        }
    }
}
