package com.example.acitivityfragmentlifecycle.fragment

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.text.TextUtils.replace
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

import com.example.acitivityfragmentlifecycle.R




class FirstFragment : Fragment() {
    private val TAG ="FirstFragment"
    private var rootView :View?=null
    private var btn :Button?=null


    override fun onAttach(context: Context){
        super.onAttach(context)
        Log.e(TAG, "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG, "onCreated")


    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.e(TAG, "onCreateView")
        rootView = inflater.inflate(R.layout.fragment_first, container, false)
        btn = rootView!!.findViewById(R.id.btn_fragmentOne) as Button
        btn!!.setOnClickListener {
            var secondFragment = SecondFragment()
            var fragmentmanager = activity!!.supportFragmentManager
            var fragmentTransaction: FragmentTransaction? = fragmentmanager?.beginTransaction()
            fragmentTransaction!!.addToBackStack(null)
            fragmentTransaction!!.replace(R.id.frame_container, secondFragment).commit()

        }
        return rootView

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e(TAG, "onActivityCreated")

    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart")
    }




    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume")
    }


    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop")
    }





    override fun onDestroyView() {
        super.onDestroyView()
        Log.e(TAG, "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy")

    }


    override fun onDetach() {
        super.onDetach()
        Log.e(TAG, "onDetach")
    }







}
