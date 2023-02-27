package com.fdgoca.fivedotsgetonecolorall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val mtL = mutableListOf(1,2,2,1,1)
    val imtl = mutableListOf<ImageView>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imtl.add(findViewById(R.id.imageViewDots1))
        imtl.add(findViewById(R.id.imageViewDots2))
        imtl.add(findViewById(R.id.imageViewDots3))
        imtl.add(findViewById(R.id.imageViewDots4))
        imtl.add(findViewById(R.id.imageViewDots5))
        val textViewRulesDots = findViewById<TextView>(R.id.textViewRulesDots)
        for (ii in 0..4){
            if (mtL[ii] == 2) imtl[ii].setImageResource(R.drawable.five_color_dots_blue)
            if (mtL[ii] == 1) imtl[ii].setImageResource(R.drawable.five_color_dots_red)
        }


        for (ii in 0..4)
            imtl[ii].setOnClickListener {
                if (ii>0) {
                    if (mtL[ii - 1] == 1) {
                        mtL[ii - 1] = 2;
                        imtl[ii - 1].setImageResource(R.drawable.five_color_dots_blue)
                    }else{

                        mtL[ii - 1] = 1;
                        imtl[ii - 1].setImageResource(R.drawable.five_color_dots_red)
                    }
                }
                if (ii<4) {
                    if (mtL[ii + 1] == 1) {
                        mtL[ii + 1] = 2;
                            imtl[ii + 1].setImageResource(R.drawable.five_color_dots_blue)
                    }else {
                        mtL[ii + 1] = 1;
                             imtl[ii + 1].setImageResource(R.drawable.five_color_dots_red)
                    }
                }
                if (mtL == listOf(2,2,2,2,2)) textViewRulesDots.text = "Win!!!!!"
            }

    }
}