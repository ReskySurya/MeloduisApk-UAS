package com.uaspm1.soundchecker.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.uaspm1.soundchecker.R
import com.uaspm1.soundchecker.databinding.FragmentUtamaBinding

class Utamafragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val binding = FragmentUtamaBinding.inflate(inflater, container, false)

        binding.ritmisBtn.setOnClickListener {
            it.findNavController()
                .navigate(R.id.action_utamafragment_to_ritmis)
        }
        binding.melodisBtn.setOnClickListener {
            it.findNavController()
                .navigate(R.id.action_utamafragment_to_melodis2)
        }
        binding.harmonisBtn.setOnClickListener {
            it.findNavController()
                .navigate(R.id.action_utamafragment_to_harmonis2)
        }

        return binding.root
    }
}