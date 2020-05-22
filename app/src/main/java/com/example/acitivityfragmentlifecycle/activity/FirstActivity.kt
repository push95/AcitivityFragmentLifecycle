package com.example.acitivityfragmentlifecycle.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.acitivityfragmentlifecycle.R
import com.example.acitivityfragmentlifecycle.fragment.FirstFragment

class FirstActivity : AppCompatActivity() {

    private val TAG ="FirstActivity"
    private var btnClickMe:Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        Log.e(TAG, "onCreate")
        val firstFragment =FirstFragment()
        val fragmentManager :FragmentManager=supportFragmentManager
        val fragmentTransaction :FragmentTransaction =fragmentManager.beginTransaction()
                fragmentTransaction.replace(R.id.frame_container,firstFragment).commit()



       /* btnClickMe=findViewById(R.id.btn_clickme)
        btnClickMe!!.setOnClickListener{
            val nextIntent =Intent(this,SecondActivity::class.java)
            startActivity(nextIntent)
        }*/
        /*val firstFragment =FirstFragment()
        val fragmentManager :FragmentManager = supportFragmentManager
        val fragmentTransaction :FragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.frame_container, firstFragment).commit()
*/


    }




    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause")

    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy")
    }

}
