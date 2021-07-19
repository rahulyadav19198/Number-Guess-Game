package com.friends.numberguess.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.friends.numberguess.R
import com.friends.numberguess.level.*
import com.startapp.sdk.adsbase.StartAppAd
import com.startapp.sdk.adsbase.StartAppSDK

class LevelActivity : AppCompatActivity() {

   private lateinit var level1:Button
   private lateinit var level2:Button
   private lateinit var level3:Button
   private lateinit var level4:Button
   private lateinit var level5:Button
   private lateinit var level6:Button
   private lateinit var level7:Button
   private lateinit var level8:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StartAppSDK.init(this, "	202230028", true)
        setContentView(R.layout.activity_level)

        level1=findViewById(R.id.level1)
        level2=findViewById(R.id.level2)
        level3=findViewById(R.id.level3)
        level4=findViewById(R.id.level4)
        level5=findViewById(R.id.level5)
        level6=findViewById(R.id.level6)
        level7=findViewById(R.id.level7)
        level8=findViewById(R.id.level8)


        level1.setOnClickListener{

            val intent= Intent(this@LevelActivity, Level1::class.java)

            intent.putExtra("Range",11)
            intent.putExtra("Display"," 10")
            intent.putExtra("SCORE","score")

            startActivity(intent)
            StartAppAd.showAd(this)

        }

        level2.setOnClickListener{

            val intent= Intent(this@LevelActivity, Level1::class.java)

            intent.putExtra("Range",21)
            intent.putExtra("Display"," 20")
            intent.putExtra("SCORE","score2")

            startActivity(intent)
            StartAppAd.showAd(this)

        }

        level3.setOnClickListener{

            val intent= Intent(this@LevelActivity, Level1::class.java)

            intent.putExtra("Range",51)
            intent.putExtra("Display"," 50")
            intent.putExtra("SCORE","score3")

            startActivity(intent)
            StartAppAd.showAd(this)

        }

        level4.setOnClickListener{

            val intent= Intent(this@LevelActivity, Level1::class.java)

            intent.putExtra("Range",81)
            intent.putExtra("Display"," 80")
            intent.putExtra("SCORE","score4")

            startActivity(intent)
            StartAppAd.showAd(this)

        }

        level5.setOnClickListener{

            val intent= Intent(this@LevelActivity, Level1::class.java)

            intent.putExtra("Range",101)
            intent.putExtra("Display"," 100")
            intent.putExtra("SCORE","score5")

            startActivity(intent)
            StartAppAd.showAd(this)

        }

        level6.setOnClickListener{

            val intent= Intent(this@LevelActivity, Level1::class.java)

            intent.putExtra("Range",501)
            intent.putExtra("Display"," 500")
            intent.putExtra("SCORE","score6")

            startActivity(intent)
            StartAppAd.showAd(this)

        }

        level7.setOnClickListener{

            val intent= Intent(this@LevelActivity, Level1::class.java)

            intent.putExtra("Range",701)
            intent.putExtra("Display"," 700")
            intent.putExtra("SCORE","score7")

            startActivity(intent)
            StartAppAd.showAd(this)
        }

        level8.setOnClickListener{

            val intent= Intent(this@LevelActivity, Level1::class.java)

            intent.putExtra("Range",1001)
            intent.putExtra("Display"," 1000")
            intent.putExtra("SCORE","score8")

            startActivity(intent)
            StartAppAd.showAd(this)
        }



    }

    override fun onBackPressed() {
        val intent= Intent(this@LevelActivity, MainActivity::class.java)
        intent.putExtra("RY",2)
        finish()
        startActivity(intent)
    }
}