package com.uaspm1.soundchecker.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.uaspm1.soundchecker.databinding.FragmentRitmisBinding

class RitmisFragment : Fragment() {
    private var _binding: FragmentRitmisBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        val binding = FragmentRitmisBinding.inflate(inflater, container, false)

        return binding.root
    }
}