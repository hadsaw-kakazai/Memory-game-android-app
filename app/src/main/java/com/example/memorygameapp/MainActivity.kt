package com.example.memorygameapp

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val images = arrayOf<Int>(R.drawable.lamp,R.drawable.cupcake,R.drawable.birthday,R.drawable.birthdaycake,R.drawable.gift)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun setImage1(v: View){
        var btn = findViewById<ImageButton>(R.id.btnone)
        btn.setImageResource(images[1])
        val timer = object: CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                var time = findViewById<TextView>(R.id.timer)
                var diff = millisUntilFinished
                val secondsInMilli: Long = 1000
                val elapsedSeconds = diff / secondsInMilli

                time.text = "$elapsedSeconds"
            }

            override fun onFinish() {
                btn.setImageResource(images[0])
            }
        }
        timer.start()


    }




    fun setImage2(v: View){
        var btn = findViewById<ImageButton>(R.id.btntwo)
        btn.setImageResource(images[2])
        val timer = object: CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                var time = findViewById<TextView>(R.id.timer)
                var diff = millisUntilFinished
                val secondsInMilli: Long = 1000
                val elapsedSeconds = diff / secondsInMilli

                time.text = "$elapsedSeconds"
            }

            override fun onFinish() {
                btn.setImageResource(images[0])
            }
        }
        timer.start()


    }




    fun setImage3(v: View){
        var btn = findViewById<ImageButton>(R.id.btnthree)
        btn.setImageResource(images[4])
        val timer = object: CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                var time = findViewById<TextView>(R.id.timer)
                var diff = millisUntilFinished
                val secondsInMilli: Long = 1000
                val elapsedSeconds = diff / secondsInMilli

                time.text = "$elapsedSeconds"
            }

            override fun onFinish() {
                btn.setImageResource(images[0])
            }
        }
        timer.start()


    }




    fun setImage4(v: View){
        var btn = findViewById<ImageButton>(R.id.btnfour)
        btn.setImageResource(images[3])
        val timer = object: CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                var time = findViewById<TextView>(R.id.timer)
                var diff = millisUntilFinished
                val secondsInMilli: Long = 1000
                val elapsedSeconds = diff / secondsInMilli

                time.text = "$elapsedSeconds"
            }

            override fun onFinish() {
                btn.setImageResource(images[0])
            }
        }
        timer.start()


    }



    fun setImage5(v: View){
        var btn = findViewById<ImageButton>(R.id.btnfive)
        btn.setImageResource(images[4])
        val timer = object: CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                var time = findViewById<TextView>(R.id.timer)
                var diff = millisUntilFinished
                val secondsInMilli: Long = 1000
                val elapsedSeconds = diff / secondsInMilli

                time.text = "$elapsedSeconds"
            }

            override fun onFinish() {
                btn.setImageResource(images[0])
            }
        }
        timer.start()


    }



    fun setImage6(v: View){
        var btn = findViewById<ImageButton>(R.id.btnsix)
        btn.setImageResource(images[1])
        val timer = object: CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                var time = findViewById<TextView>(R.id.timer)
                var diff = millisUntilFinished
                val secondsInMilli: Long = 1000
                val elapsedSeconds = diff / secondsInMilli

                time.text = "$elapsedSeconds"
            }

            override fun onFinish() {
                btn.setImageResource(images[0])
            }
        }
        timer.start()


    }



    fun setImage7(v: View){
        var btn = findViewById<ImageButton>(R.id.btnseven)
        btn.setImageResource(images[3])
        val timer = object: CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                var time = findViewById<TextView>(R.id.timer)
                var diff = millisUntilFinished
                val secondsInMilli: Long = 1000
                val elapsedSeconds = diff / secondsInMilli

                time.text = "$elapsedSeconds"
            }

            override fun onFinish() {
                btn.setImageResource(images[0])
            }
        }
        timer.start()


    }



    fun setImage8(v: View){
        var btn = findViewById<ImageButton>(R.id.btneight)
        btn.setImageResource(images[1])
        val timer = object: CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                var time = findViewById<TextView>(R.id.timer)
                var diff = millisUntilFinished
                val secondsInMilli: Long = 1000
                val elapsedSeconds = diff / secondsInMilli

                time.text = "$elapsedSeconds"
            }

            override fun onFinish() {
                btn.setImageResource(images[0])
            }
        }
        timer.start()


    }


    fun setImage9(v: View){
        var btn = findViewById<ImageButton>(R.id.btnnine)
        btn.setImageResource(images[2])
        val timer = object: CountDownTimer(10000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                var time = findViewById<TextView>(R.id.timer)
                var diff = millisUntilFinished
                val secondsInMilli: Long = 1000
                val elapsedSeconds = diff / secondsInMilli

                time.text = "$elapsedSeconds"
            }

            override fun onFinish() {
                btn.setImageResource(images[0])
            }
        }
        timer.start()


    }


}