package com.project.segunfrancis.mergeadaptersample.recycleradapters

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.project.segunfrancis.mergeadaptersample.R
import com.project.segunfrancis.mergeadaptersample.dto.Banner
import kotlinx.android.synthetic.main.item_layout_banner.view.*

/**
 * Created by SegunFrancis
 */
class BannerAdapter(private val banner: Banner) :
    RecyclerView.Adapter<BannerAdapter.BannerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerViewHolder {
        return BannerViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_layout_banner, parent, false)
        )
    }

    override fun getItemCount() = 1

    override fun onBindViewHolder(holder: BannerViewHolder, position: Int) =
        holder.bind(banner)

    class BannerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(banner: Banner) {
            Glide.with(itemView.imageViewBanner.context)
                .load(banner.bannerImage)
                .into(itemView.imageViewBanner)
        }
    }
}