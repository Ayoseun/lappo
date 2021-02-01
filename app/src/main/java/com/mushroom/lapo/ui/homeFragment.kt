package com.mushroom.lapo.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mushroom.lapo.R
import com.mushroom.lapo.adapter.RecyclerViewAdapter
import com.mushroom.lapo.model.Source


class homeFragment : Fragment() {
   lateinit var row :RecyclerViewAdapter

lateinit var Rev : RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment

       val view = inflater.inflate(R.layout.fragment_home, container, false)
        Rev = view.findViewById(R.id.ReV)

        row = RecyclerViewAdapter()
        Rev. layoutManager =LinearLayoutManager(activity)

        Rev.adapter  = row
        addData()
        return view

    }

    fun addData(){
        val data = Source.createdSource()
        row.submitList(data)
    }





}
