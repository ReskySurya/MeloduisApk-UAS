package com.uaspm1.soundchecker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class fileAdapter(private val listAlat: ArrayList<alatMusikdata>) : RecyclerView.Adapter<fileAdapter.CardViewHolder>() {
    inner class CardViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val namaMusik = itemView.findViewById<TextView>(R.id.title_alat)
        val isiDeskripsi = itemView.findViewById<TextView>(R.id.isi_deskripsi)
        val image_alat = itemView.findViewById<ImageView>(R.id.foto_alat)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val listView = inflater.inflate(R.layout.recycler_view_item, parent, false)
        // Return a new holder instance
        return CardViewHolder(listView)
    }

    override fun getItemCount(): Int {
        return listAlat.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val alat = listAlat[position]

//        Glide.with(holder.itemView.context).load(alat.foto).apply(RequestOptions()).into(holder.image_alat)

        holder.image_alat.setImageResource(alat.foto)
        holder.namaMusik.text = alat.name
        holder.isiDeskripsi.text = alat.deskripsi

        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "Anda Memilih"+listAlat[holder.adapterPosition].name,
            Toast.LENGTH_SHORT).show()
        }
    }

}