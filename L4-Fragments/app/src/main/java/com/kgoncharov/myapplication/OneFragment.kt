package com.kgoncharov.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kgoncharov.myapplication.databinding.FragmentOneBinding

class OneFragment(private val variable: Int) : Fragment() {

    lateinit var binding: FragmentOneBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }
}