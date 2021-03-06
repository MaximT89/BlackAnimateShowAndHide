package com.example.testkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class FragmentSecond : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btn1 : Button = view.findViewById(R.id.btn_1)
        btn1.setOnClickListener {
            (context as MainActivity).changeFragment(FragmentFirst.newInstance())
        }
    }

    companion object {
        fun newInstance(): FragmentSecond {
            return FragmentSecond()
        }
    }


}