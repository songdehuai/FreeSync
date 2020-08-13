package com.freesync

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {
            FreeSync.default().addCall<String>(key = this) {
                log("订阅1:${it}")
            }
            FreeSync.default().addCall<String>(key = this) {
                log("订阅2:${it}")
            }
        }

        btnClear.setOnClickListener {
            log("", true)
        }
        
        btnStart.setOnClickListener {
            startActivity(Intent(this@MainActivity, TestActivity::class.java))
        }

        btnCall.setOnClickListener {
            FreeSync.default().call<String>(key = this, value = "哈哈哈哈")
        }


        FreeSync.default().addCall<UserBean>("hhh") {
            it?.let {
                log("name:${it.name},age:${it.age}")
            }
        }

    }


    private fun log(text: String?, isNew: Boolean = false) {
        if (isNew) {
            etLog.setText("$text\n")
        } else {
            etLog.append("$text\n")
        }
    }
}