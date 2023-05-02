//1 Mei 2023
//Latihan Monitory
//10120909
//Vincentius Mickey Satya Wisesa
//IF-10

package com.example.lat3_if10_10120909_vincentiusmickeysatyawisesa


import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val textBodyDetail : TextView = findViewById(R.id.textBodyDetail)
        textBodyDetail.text = Html.fromHtml(getString(R.string.detailBody))
        val buttonMulai : Button = findViewById(R.id.buttonMulai)
        buttonMulai.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.buttonMulai -> {
                val editTextKode = findViewById<EditText>(R.id.editTextKodeKeluarga)
                if(editTextKode.text.isEmpty()){
                    val dialog = Dialog(this)
                    dialog.setContentView(R.layout.activity_warning_dialog)
                    val buttonOke = dialog.findViewById<Button>(R.id.buttonOkeKembali)
                    buttonOke?.setOnClickListener {
                        dialog.dismiss()
                    }
                    dialog.show()
                }else{
                    val moveIntent = Intent( this@LoginActivity, BiodataActivity::class.java)
                    startActivity(moveIntent)
                }
            }
        }
    }

}