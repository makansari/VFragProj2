package com.example.vfragproj2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.blue_frag.view.*

class BlueFrag  : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v = inflater.inflate(R.layout.blue_frag,container,false)

        v.buttonBluePassdata.setOnClickListener {
           /* var redFrag = RedFrag()
            var b = Bundle()
            b.putString("key1","Welcome to RedFrag")
            redFrag.arguments = b
            fragmentManager?.beginTransaction()?.replace(R.id.myMainActLayout,redFrag)?.commit()*/

            var myInterface : MyInterface = activity as MyInterface
            myInterface.myMethod("Hello Guys")



        }
        return v
    }
}