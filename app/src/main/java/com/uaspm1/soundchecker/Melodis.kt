package com.uaspm1.soundchecker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.uaspm1.soundchecker.databinding.FragmentMelodisBinding
import com.uaspm1.soundchecker.databinding.FragmentRitmisBinding

class Melodis : Fragment() {
    private lateinit var rvMusik: RecyclerView
    private val list = ArrayList<alatMusikdata>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMelodisBinding.inflate(inflater, container, false)

        rvMusik = binding.rvlist
        rvMusik.setHasFixedSize(true)

        list.addAll(listOf(
            alatMusikdata("Alat Musik 1", "Deskripsi 1", R.drawable.jimbe),
            alatMusikdata("Alat Musik 2", "Deskripsi 2", R.drawable.jimbe),
            alatMusikdata("Alat Musik 3", "Deskripsi 3", R.drawable.jimbe),
        ))
        rvMusik.layoutManager = LinearLayoutManager(context)
        rvMusik.adapter = fileAdapter(list)

        return binding.root
    }

}