package com.example.afinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main3.*


class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val i = intent
        var txt1 = i.getStringExtra("txt1")
        var txt3 = i.getStringExtra("txt2")
        var txt4 = i.getStringExtra("txt3")

        val txt2 = "%,.2f".format(txt1.toString().toDouble())
        textBMI.text = "%,.2f".format(txt1.toString().toDouble())

        textBMR.text = txt3.toString()
        textTDEE.text = txt4.toString()

        bBack2.setOnClickListener {
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }

    class MainActivity {

    }
}