package com.example.acitivityfragmentlifecycle.fragment

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.acitivityfragmentlifecycle.R


class SecondFragment : Fragment() {

    private val TAG ="SecondFragment"

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e(TAG ,"onAttach")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG ,"onCreate")

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.e(TAG ,"onCreateView")
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e(TAG ,"onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG ,"onStart")

    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG ,"onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG ,"onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG ,"onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e(TAG ,"onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG ,"onDestroy")
    }
}
