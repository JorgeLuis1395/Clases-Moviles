package com.example.jorgecarrillo.moviles

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        buttonActividad1.setOnClickListener{view: View -> irActividadDos() }
        setContentView(R.layout.activity_main)
    }
    fun irActividadDos(){
        val intent = Intent(this,Actividad2::class.java)
        startActivity(intent)
    }
}
