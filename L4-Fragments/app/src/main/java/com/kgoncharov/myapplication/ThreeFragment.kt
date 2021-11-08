package com.kgoncharov.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kgoncharov.myapplication.databinding.FragmentThreeBinding

class ThreeFragment : Fragment() {
    lateinit var binding: FragmentThreeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentThreeBinding.inflate(inflater, container, false)
        return binding.root
    }
}