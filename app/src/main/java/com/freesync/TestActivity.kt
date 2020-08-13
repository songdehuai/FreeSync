package com.freesync

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        btnTest.setOnClickListener {

            val user = UserBean("哈哈哈哈哈", 1)

            FreeSync.default().call<String>("hhh", user)
        }
    }

}