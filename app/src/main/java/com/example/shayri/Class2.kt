package com.example.shayri

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context.CLIPBOARD_SERVICE
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.getSystemService
import androidx.core.content.ContextCompat.startActivity

class   Class2(var mainActivity2: MainActivity2, var blank: Array<String>) :BaseAdapter() {
    override fun getCount(): Int {
        return blank.size
    }

    override fun getItem(p0: Int): Any {
        return p0
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, p1: View?, p2: ViewGroup?): View {

        var view2=LayoutInflater.from(mainActivity2).inflate(R.layout.card2,p2,false)

        var card2 :TextView
        card2=view2.findViewById(R.id.listview)

        card2.setText(blank[position])

        var copyincard2 :ImageView
        copyincard2=view2.findViewById(R.id.copyincard2)

        copyincard2.setOnClickListener {

            val textToCopy = blank[position]
            val clipboardManager = mainActivity2.getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clipData = ClipData.newPlainText("text", textToCopy)
            clipboardManager.setPrimaryClip(clipData)
            Toast.makeText(mainActivity2, "Text copied to clipboard", Toast.LENGTH_LONG).show()
        }

        var shareincard2:ImageView
        shareincard2=view2.findViewById(R.id.shareincard2)

        shareincard2.setOnClickListener {

            val sendIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, blank[position])
                type = "text/plain"
            }
            val shareIntent = Intent.createChooser(sendIntent, null)
            mainActivity2.startActivity(shareIntent)
        }

        var whatsappincard2:ImageView
        whatsappincard2=view2.findViewById(R.id.whatsappincard2)

        whatsappincard2.setOnClickListener {
            val messageEditText = blank[position]
            val message = messageEditText


            sendMessage(message);
        }
        return view2
    }

    private fun sendMessage(message: String) {
        val intent = Intent(Intent.ACTION_SEND)


        intent.type = "text/plain"


        intent.setPackage("com.whatsapp")


        intent.putExtra(Intent.EXTRA_TEXT, message)


        if (intent.resolveActivity(mainActivity2.packageManager) == null) {
            Toast.makeText(mainActivity2,
                "Please install whatsapp first.",
                Toast.LENGTH_SHORT).show()
            return
        }

        mainActivity2.startActivity(intent)
    }
}
