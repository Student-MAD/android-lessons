package com.kgoncharov.materialelements
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayoutMediator
import com.kgoncharov.materialelements.databinding.FragmentMainBinding

class FragmentMain : Fragment() {

    lateinit var binding: FragmentMainBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        binding.viewPager.adapter = MyPagerAdapter(this)

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        Snackbar.make(binding.root, "Test snackbar", Snackbar.LENGTH_LONG).setAction("Action") {
            Toast.makeText(requireContext(), "Test", Toast.LENGTH_LONG).show()
        }.show()
    }
}