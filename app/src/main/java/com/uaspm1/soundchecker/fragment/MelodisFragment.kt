package com.uaspm1.soundchecker.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.uaspm1.soundchecker.databinding.FragmentMelodisBinding

class MelodisFragment : Fragment() {
    private var _binding: FragmentMelodisBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMelodisBinding.inflate(inflater, container, false)
        return binding.root
    }

}