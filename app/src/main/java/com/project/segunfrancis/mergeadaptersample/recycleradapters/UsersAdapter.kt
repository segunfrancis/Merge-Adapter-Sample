package com.project.segunfrancis.mergeadaptersample.recycleradapters

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.project.segunfrancis.mergeadaptersample.R
import com.project.segunfrancis.mergeadaptersample.dto.User
import kotlinx.android.synthetic.main.item_layout.view.*
import kotlin.collections.ArrayList

/**
 * Created by SegunFrancis
 */
class UsersAdapter(private val users: ArrayList<User>) :
    RecyclerView.Adapter<UsersAdapter.UsersViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        return UsersViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_layout, parent, false)
        )
    }

    override fun getItemCount() = users.size

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) =
        holder.bind(users[position])

    class UsersViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            itemView.textViewUserName.text = user.name
            Glide.with(itemView.imageViewAvatar.context)
                .load(user.avatar)
                .into(itemView.imageViewAvatar)
        }
    }
}