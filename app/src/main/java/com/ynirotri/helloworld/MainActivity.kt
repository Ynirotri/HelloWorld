package com.ynirotri.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainTituloTextView :  TextView = findViewById(R.id.main_titulo_text_view)

        val nombre = intent.extras?.getString("nombre")
        mainTituloTextView.text = nombre
    }
        override fun onBackPressed(){
        super.onBackPressed()

    }
}

