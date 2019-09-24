package com.example.dicodingsubmissionberninofalya

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewPlaneAdapter(private val listPlane: ArrayList<Plane>) : RecyclerView.Adapter<CardViewPlaneAdapter.CardViewViewHolder>()  {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_hero, parent, false)
        return CardViewViewHolder(view)
    }
    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val plane = listPlane[position]

        Glide.with(holder.itemView.context)
            .load(plane.photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgPhoto)

        holder.tvName.text = plane.name
        holder.tvDetail.text = plane.shortDescription

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listPlane[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listPlane.size
    }
    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto : ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName : TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail : TextView = itemView.findViewById(R.id.tv_item_detail)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Plane)
    }


}