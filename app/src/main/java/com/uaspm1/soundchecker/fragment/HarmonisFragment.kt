package com.uaspm1.soundchecker.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.uaspm1.soundchecker.R
import com.uaspm1.soundchecker.databinding.FragmentHarmonisBinding


class HarmonisFragment : Fragment() {

    private var _binding: FragmentHarmonisBinding? = null
    private val binding get() = _binding!!

    private var soundMusic: MediaPlayer? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHarmonisBinding.inflate(inflater, container, false)

        binding.gitar.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.duar_memek)
            soundMusic?.start()
        }

        binding.angklung.setOnClickListener {
            resetSound(soundMusic)
            soundMusic = MediaPlayer.create(context, R.raw.dor_kontol)
            soundMusic?.start()
        }

        return binding.root
    }

    private fun resetSound(mp: MediaPlayer?) {
        if (mp?.isPlaying == true) {
            mp.stop()
            mp.reset()
        }
    }

}