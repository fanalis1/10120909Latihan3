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
import android.widget.TextView

class DoneActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_done)
        val name = intent.getStringExtra("username")
        val textViewDone : TextView = findViewById(R.id.textViewDone)
        textViewDone.text = "Beres! Sekarang $name sudah bisa ngecek penggunaan HP $name setiap hari buat bantu ngingetin $name buat ngatur waktu :)"

        val buttonOkeClose : Button = findViewById(R.id.buttonOkeClose)
        buttonOkeClose.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.buttonOkeClose -> {
                val moveIntent = Intent(this@DoneActivity, WelcomeActivity::class.java)
                moveIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
                startActivity(moveIntent)
            }
        }
    }
}