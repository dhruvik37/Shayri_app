package com.example.shayri

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var list :ListView

    var array= arrayOf("Morning Shayri","Night Shayri","Brithday Shayri","Friend Shayri","Attitude Shayri","Funny Shayri","Yaad Shayri","Best Wishes","God Shayri","All In One","Kite Shayri","other Shayri","Royal Shayri","Janmashtami Shayri","Sad Shayri","Diwali Shayri","2 line Shayri","motivational Shayri","indepandence Shayri","Holi Shayri","Valentine Shayri","Republic Shayri","Ganesha Shayri","Navratri Shayri","Shravan Shayri")
    //var colour=arrayOf(R.drawable.colour,R.drawable.colour1,R.drawable.colour2,R.drawable.colour3,R.drawable.colour4
                 //       ,R.drawable.colour5,R.drawable.colour6,R.drawable.colour7,R.drawable.colour8,R.drawable.colour9
                    //    ,R.drawable.colour10,R.drawable.colour11,R.drawable.colour12,R.drawable.colour13,R.drawable.colour14
                     //   ,R.drawable.colour15,R.drawable.colour16,R.drawable.colour17,R.drawable.colour18,R.drawable.colour19
                     //   ,R.drawable.colour20,R.drawable.colour21,R.drawable.colour22,R.drawable.colour23,R.drawable.colour24)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list=findViewById(R.id.list)

       //var adapter= ArrayAdapter(this,android.R.layout.simple_list_item_1,array)

        var adapter= Class1(this,array)

        list.adapter=adapter



        list.setOnItemClickListener{parent,view,position,id->

            var intent = Intent(this@MainActivity,MainActivity2::class.java)
            startActivity(intent.putExtra("dk",array[position]))
        }
    }

}
