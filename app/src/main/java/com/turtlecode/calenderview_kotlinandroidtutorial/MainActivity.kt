package com.turtlecode.calenderview_kotlinandroidtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var year1: Int = 0
    var month1: Int = 0
    var day1: Int = 0

    var year2: Int = 0
    var month2: Int = 0
    var day2: Int = 0

    var total1 : Int = 0
    var total2 : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        calendarView.setOnDateChangeListener {
                calendarView, i, i1, i2 ->
            year1 = i
            month1 = i1+1
            day1 = i2
        }
        calendarView2.setOnDateChangeListener {
                calendarView, i, i1, i2 ->
            year2 = i
            month2 = i1+1
            day2 = i2
        }
    }

    fun calculate(view: View) {
        total1 = (year1*360) + (month1*30) + day1
        total2 = (year2*360) + (month2*30) + day2
        println(total1)
        println(total2)

        textView.text = "${total1-total2}" + " day"
    }
}