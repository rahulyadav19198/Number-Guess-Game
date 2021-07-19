package com.friends.numberguess.main

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.friends.numberguess.R

class ScoreActivity : AppCompatActivity() {

    private lateinit var score1:TextView
    private lateinit var score2:TextView
    private lateinit var score3:TextView
    private lateinit var score4:TextView
    private lateinit var score5:TextView
    private lateinit var score6:TextView
    private  lateinit var score7:TextView
    private  lateinit var score8:TextView
    private var guess:String = ""
    private var preTest:Int=100
    private var result:Boolean=false
    private var guess2:String = ""
    private var preTest2:Int=100
    private var result2:Boolean=false
    private var guess3:String = ""
    private var preTest3:Int=100
    private var result3:Boolean=false
    private var guess4:String = ""
    private var preTest4:Int=100
    private var result4:Boolean=false
    private var guess5:String = ""
    private var preTest5:Int=100
    private var result5:Boolean=false
    private var guess6:String = ""
    private var preTest6:Int=1000
    private var result6:Boolean=false
    private var guess7:String = ""
    private var preTest7:Int=1000
    private var result7:Boolean=false
    private var guess8:String = ""
    private var preTest8:Int=1000
    private var result8:Boolean=false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        score1 = findViewById(R.id.score1)
        score2 = findViewById(R.id.score2)
        score3 = findViewById(R.id.score3)
        score4 = findViewById(R.id.score4)
        score5 = findViewById(R.id.score5)
        score6 = findViewById(R.id.score6)
        score7 = findViewById(R.id.score7)
        score8 = findViewById(R.id.score8)

        forScore1()

        forScore2()

        forScore3()

        forScore4()

        forScore5()


        forScore6()

        forScore7()

        forScore8()


    }

    fun forScore1(){


        val sharedPreferencess= getSharedPreferences(getString(R.string.shared_preference), Context.MODE_PRIVATE)

        guess = sharedPreferencess.getString("score","0").toString()

        result = sharedPreferencess.getBoolean("Bool",false)

        if(result)
        {

            preTest = sharedPreferencess.getString("Result","0").toString().toInt()

        }

        if(guess.toInt() == 0) {

            score1.text = "0"

        }else{

            score1.text = preTest.toString()

            if (guess.toInt() < preTest) {

                score1.text = guess

                sharedPreferencess.edit().putString("Result",guess).apply()
                sharedPreferencess.edit().putBoolean("Bool",true).apply()

            }

        }
    }

    fun forScore2(){


        val sharedPreferencess= getSharedPreferences(getString(R.string.shared_preference), Context.MODE_PRIVATE)

        guess2 = sharedPreferencess.getString("score2","0").toString()

        result2 = sharedPreferencess.getBoolean("Bool2",false)

        if(result2)
        {

            preTest2 = sharedPreferencess.getString("Result2","0").toString().toInt()

        }

        if(guess2.toInt() == 0) {

            score2.text = "0"

        }else{

            score2.text = preTest2.toString()

            if (guess2.toInt() < preTest2) {

                score2.text = guess2

                sharedPreferencess.edit().putString("Result2",guess2).apply()
                sharedPreferencess.edit().putBoolean("Bool2",true).apply()

            }

        }
    }


    fun forScore3(){


        val sharedPreferencess= getSharedPreferences(getString(R.string.shared_preference), Context.MODE_PRIVATE)

        guess3 = sharedPreferencess.getString("score3","0").toString()

        result3 = sharedPreferencess.getBoolean("Bool3",false)

        if(result3)
        {

            preTest3 = sharedPreferencess.getString("Result3","0").toString().toInt()

        }

        if(guess3.toInt() == 0) {

            score3.text = "0"

        }else{

            score3.text = preTest3.toString()

            if (guess3.toInt() < preTest3) {

                score3.text = guess3

                sharedPreferencess.edit().putString("Result3",guess3).apply()
                sharedPreferencess.edit().putBoolean("Bool3",true).apply()

            }

        }
    }


    fun forScore4(){


        val sharedPreferencess= getSharedPreferences(getString(R.string.shared_preference), Context.MODE_PRIVATE)

        guess4 = sharedPreferencess.getString("score4","0").toString()

        result4 = sharedPreferencess.getBoolean("Bool4",false)

        if(result4)
        {

            preTest4 = sharedPreferencess.getString("Result4","0").toString().toInt()

        }

        if(guess4.toInt() == 0) {

            score4.text = "0"

        }else{

            score4.text = preTest4.toString()

            if (guess4.toInt() < preTest4) {

                score4.text = guess4

                sharedPreferencess.edit().putString("Result4",guess4).apply()
                sharedPreferencess.edit().putBoolean("Bool4",true).apply()

            }

        }
    }

    fun forScore5(){


        val sharedPreferencess= getSharedPreferences(getString(R.string.shared_preference), Context.MODE_PRIVATE)

        guess5 = sharedPreferencess.getString("score5","0").toString()

        result5 = sharedPreferencess.getBoolean("Bool5",false)

        if(result5)
        {

            preTest5 = sharedPreferencess.getString("Result5","0").toString().toInt()

        }

        if(guess5.toInt() == 0) {

            score5.text = "0"

        }else{

            score5.text = preTest5.toString()

            if (guess5.toInt() < preTest5) {

                score5.text = guess5

                sharedPreferencess.edit().putString("Result5",guess5).apply()
                sharedPreferencess.edit().putBoolean("Bool5",true).apply()

            }

        }
    }

    fun forScore6(){


        val sharedPreferencess= getSharedPreferences(getString(R.string.shared_preference), Context.MODE_PRIVATE)

        guess6 = sharedPreferencess.getString("score6","0").toString()

        result6 = sharedPreferencess.getBoolean("Bool6",false)

        if(result6)
        {

            preTest6 = sharedPreferencess.getString("Result6","0").toString().toInt()

        }

        if(guess6.toInt() == 0) {

            score6.text = "0"

        }else{

            score6.text = preTest6.toString()

            if (guess6.toInt() < preTest6) {

                score6.text = guess6

                sharedPreferencess.edit().putString("Result6",guess6).apply()
                sharedPreferencess.edit().putBoolean("Bool6",true).apply()

            }

        }
    }

    fun forScore7(){


        val sharedPreferencess= getSharedPreferences(getString(R.string.shared_preference), Context.MODE_PRIVATE)

        guess7 = sharedPreferencess.getString("score7","0").toString()

        result7 = sharedPreferencess.getBoolean("Bool7",false)

        if(result7)
        {

            preTest7 = sharedPreferencess.getString("Result7","0").toString().toInt()

        }

        if(guess7.toInt() == 0) {

            score7.text = "0"

        }else{

            score7.text = preTest7.toString()

            if (guess7.toInt() < preTest7) {

                score7.text = guess7

                sharedPreferencess.edit().putString("Result7",guess7).apply()
                sharedPreferencess.edit().putBoolean("Bool7",true).apply()

            }

        }
    }

    fun forScore8(){


        val sharedPreferencess= getSharedPreferences(getString(R.string.shared_preference), Context.MODE_PRIVATE)

        guess8 = sharedPreferencess.getString("score8","0").toString()

        result8 = sharedPreferencess.getBoolean("Bool8",false)

        if(result8)
        {

            preTest8 = sharedPreferencess.getString("Result8","0").toString().toInt()

        }

        if(guess8.toInt() == 0) {

            score8.text = "0"

        }else{

            score8.text = preTest8.toString()

            if (guess8.toInt() < preTest8) {

                score8.text = guess8

                sharedPreferencess.edit().putString("Result8",guess8).apply()
                sharedPreferencess.edit().putBoolean("Bool8",true).apply()

            }

        }
    }

    override fun onBackPressed() {
        val intent= Intent(this, MainActivity::class.java)
        intent.putExtra("RY",2)
        finish()
        startActivity(intent)
    }

}