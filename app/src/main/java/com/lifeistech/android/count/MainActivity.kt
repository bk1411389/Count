package com.lifeistech.android.count

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        count_text_view.text = "0"

        plus_button.setOnClickListener{
            number = number + 1
            count_text_view.text = number.toString()
        }
        minus_button.setOnClickListener{
            number = number - 1
            count_text_view.text = number.toString()
        }
    }
}
