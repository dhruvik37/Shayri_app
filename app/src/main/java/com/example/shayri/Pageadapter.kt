package com.example.shayri

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter

class Pageadapter(var mainActivity3: MainActivity3, var set2: Array<String>) : PagerAdapter() {
    override fun getCount(): Int {
        return set2.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var textpage:TextView
        var vi=LayoutInflater.from(mainActivity3).inflate(R.layout.pagerview,container,false)
        textpage=vi.findViewById(R.id.textpe)
        textpage.setText(set2[position])
        container.addView(vi)
        
        return vi
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

}
