package com.kgoncharov.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kgoncharov.recyclerview.databinding.ItemUserBinding

class UsersAdapter : RecyclerView.Adapter<UserViewHolder>() {

    private val items = mutableListOf<User>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(ItemUserBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    fun submitList(users: List<User>) {
        items.clear()
        items.addAll(users)
        notifyDataSetChanged()
    }

    fun addItem(user: User) {
        items.add(user)
        notifyItemInserted(items.lastIndex)
    }
}