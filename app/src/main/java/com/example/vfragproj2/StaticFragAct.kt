package com.example.vfragproj2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class StaticFragAct : AppCompatActivity(),MyInterface{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_static_frag)
    }

    override fun myMethod(data: String) {
        var myredFrag = supportFragmentManager.findFragmentById(R.id.fragmentRed) as RedFrag

        myredFrag.myResult(data)
    }


}