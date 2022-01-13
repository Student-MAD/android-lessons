package com.kgoncharov.materialelements

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kgoncharov.materialelements.databinding.FragmentOneBinding

class Fragment1(private val position: Int) : Fragment() {

    lateinit var binding: FragmentOneBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentOneBinding.inflate(inflater, container, false)
        binding.textViewFragment.text = position.toString()
        return binding.root
    }
}