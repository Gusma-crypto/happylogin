package com.agus.happylogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Deklarasi Variabel
        var username = findViewById<EditText>(R.id.et_username)
        var password = findViewById<EditText>(R.id.et_password)
        var  reset   = findViewById<Button>(R.id.btn_reset)
        var  submit  = findViewById<Button>(R.id.btn_submit)

        //aksi button reset jika di klik
        reset.setOnClickListener {
            username.setText("")
            password.setText("")
        }

        //aksi button submit jika diklik
        submit.setOnClickListener{
            val user=username
            val pw= password
            Toast.makeText(this@MainActivity, "Anda Berhasil Login", Toast.LENGTH_SHORT).show()
        }


    }
}
