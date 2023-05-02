//1 Mei 2023
//Latihan Monitory
//10120909
//Vincentius Mickey Satya Wisesa
//IF-10

package com.example.lat3_if10_10120909_vincentiusmickeysatyawisesa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class WelcomeActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val buttonMulai : Button = findViewById(R.id.buttonMulai)
        buttonMulai.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.buttonMulai -> {
                val moveIntent = Intent(this@WelcomeActivity, LoginActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}