package com.friends.numberguess.main


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import com.friends.numberguess.R
import com.startapp.sdk.adsbase.StartAppAd
import com.startapp.sdk.adsbase.StartAppSDK

class MainActivity : AppCompatActivity() {

    private lateinit var start:Button
    private lateinit var score:Button
    private lateinit var exit:Button
    private lateinit var instruction:Button
    private lateinit var progressLayout: RelativeLayout
    private var vis:Int=1



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StartAppSDK.init(this, "	202230028", true)
        setContentView(R.layout.activity_main)
        //StartAppAd.disableSplash()

        start=findViewById(R.id.start)
        score=findViewById(R.id.score)
        exit=findViewById(R.id.exit)
        progressLayout=findViewById(R.id.progressLayout)
        instruction=findViewById(R.id.instruction)



        vis=intent.getIntExtra("RY", 1)


        if(vis == 1) {

            progressLayout.visibility = View.VISIBLE

            Handler().postDelayed({
                progressLayout.visibility = View.INVISIBLE

            }, 2000)



        }
        else
        {
            progressLayout.visibility=View.INVISIBLE
        }



        exit.setOnClickListener{
            val alterDialog=androidx.appcompat.app.AlertDialog.Builder(this)

            alterDialog.setTitle("Confirmation")
            alterDialog.setMessage("Are you sure you want to exit app?")

            alterDialog.setNegativeButton("Yes"){ text, listener->

                ActivityCompat.finishAffinity(this)

            }
            alterDialog.setPositiveButton("No"){ text, listener->

                onRestart()

            }


            alterDialog.create()
            alterDialog.show()
        }




        start.setOnClickListener{

           open()

        }

        score.setOnClickListener {

            val intent=Intent(
                this@MainActivity,
                ScoreActivity::class.java
            )
            startActivity(intent)

        }

        instruction.setOnClickListener {

            val intent=Intent(
                this@MainActivity,
                Instruction::class.java
            )
            startActivity(intent)


        }


    }

   private fun open()
    {

        if(StartAppAd.showAd(this)){

            StartAppAd.showAd(this)

        }

            val intent=Intent(
                this@MainActivity,
                LevelActivity::class.java
            )
            startActivity(intent)



    }

    override fun onBackPressed() {}




}