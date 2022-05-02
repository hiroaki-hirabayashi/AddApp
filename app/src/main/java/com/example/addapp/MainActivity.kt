package com.example.addapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Viewの取得(idで)
        val et1: EditText = findViewById(R.id.et1)
        val et2:EditText = findViewById(R.id.et2)
        val btnAdd : Button = findViewById(R.id.btnAdd)
        val tvAns : TextView = findViewById(R.id.tvAns)
        val btnClear:Button =findViewById(R.id.btnClear)

        // クリック処理（足し算）
        btnAdd.setOnClickListener {

            if(et1.text.toString() == ("") || et2.text.toString() == ("")) {
                // エラー処理:トースト
                Toast.makeText(this,"数字を入力してください",Toast.LENGTH_LONG).show()

                // エラー処理:アラートダイアログ
//                AlertDialog.Builder(this)
//                        .setTitle("ERROR!")
//                        .setMessage("数字を入力してください")
//                        .setPositiveButton("OK",null)
//                        .show()

            } else {
                // Edit(編集型) ⇒ String(文字)型 ⇒　int型
                val sum =et1.text.toString().toInt() + et2.text.toString().toInt()
                tvAns.text = "合計は $sum"
            }


        }

        // クリア処理
        btnClear.setOnClickListener {
            et1.text.clear()
            et2.text.clear()
            tvAns.text ="答え"
        }
    }
}