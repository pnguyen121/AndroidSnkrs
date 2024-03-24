package com.pnguyen121.snkrs.views.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.pnguyen121.snkrs.databinding.FragmentHomeBinding
import com.pnguyen121.snkrs.extensions.autoCleared


class HomeFragment : Fragment() {

    private var binding by autoCleared<FragmentHomeBinding>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false)
        this.binding = binding
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}