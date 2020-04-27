package com.project.segunfrancis.mergeadaptersample.recycleradapters

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.segunfrancis.mergeadaptersample.R
import com.project.segunfrancis.mergeadaptersample.dto.MyDetail
import kotlinx.android.synthetic.main.item_layout_my_detail.view.*

/**
 * Created by SegunFrancis
 */
class MyDetailAdapter(private val myDetail: MyDetail) :
    RecyclerView.Adapter<MyDetailAdapter.MyDetailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyDetailViewHolder {
        return MyDetailViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_layout_my_detail, parent, false)
        )
    }

    override fun getItemCount() = 1

    override fun onBindViewHolder(holder: MyDetailViewHolder, position: Int) =
        holder.bind(myDetail)

    class MyDetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: MyDetail) = with(itemView) {
            itemView.textViewUser.text = user.name
            itemView.textViewAboutMe.text = user.aboutMe
        }
    }
}