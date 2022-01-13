package com.kgoncharov.recyclerview

import androidx.core.content.res.ResourcesCompat
import androidx.recyclerview.widget.RecyclerView
import com.kgoncharov.recyclerview.databinding.ItemUserBinding

class UserViewHolder(private val binding: ItemUserBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(user: User) = with(binding) {
        textViewId.text = user.id.toString()
        if (user.id == 1) {
            val context = binding.root.context
            textViewId.setTextColor(ResourcesCompat.getColor(context.resources, R.color.purple_500, context.theme))
        } else {
            val context = binding.root.context
            textViewId.setTextColor(ResourcesCompat.getColor(context.resources, R.color.black, context.theme))
        }
        textViewFirstName.text = user.firstName
        textViewLastName.text = user.lastName
        root.setOnClickListener {  }
    }
}