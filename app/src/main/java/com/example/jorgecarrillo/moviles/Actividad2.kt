package com.example.jorgecarrillo.moviles

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_actividad2.*

class Actividad2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actividad2)
        button2.setOnClickListener({v: View? -> irActividad3() })
    }
    fun irActividad3 (){
        val intent = Intent (this, Main2Activity::class.java)
        startActivity(intent)
    }
}
