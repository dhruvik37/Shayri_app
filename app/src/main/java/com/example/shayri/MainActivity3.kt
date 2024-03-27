package com.example.shayri

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager


class MainActivity3 : AppCompatActivity() {

    lateinit var fixed :ViewPager
//    lateinit var left:Button
//    lateinit var right:Button
    lateinit var copy :ImageView
    lateinit var share :ImageView
    lateinit var whatsapp :ImageView

    var set2 = arrayOf<String>("")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        fixed=findViewById(R.id.fix)

//        left=findViewById(R.id.left)
//        right=findViewById(R.id.right)
        var positionn = intent.getIntExtra("pos",0)
//        var seat=intent.getStringExtra("name")
//
//        //fixed.setText(seat)

        set2  = intent.getStringArrayExtra("array")!!

        var Myadapter = Pageadapter(this,set2)

        fixed.adapter =Myadapter


        fixed.setCurrentItem(positionn)




    }
}