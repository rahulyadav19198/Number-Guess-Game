package com.friends.numberguess.level

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.friends.numberguess.R
import com.friends.numberguess.adapter.HistoryAdapter
import com.friends.numberguess.main.LevelActivity
import com.friends.numberguess.main.ScoreActivity
import com.startapp.sdk.adsbase.StartAppSDK
import kotlin.random.Random


class Level1 : AppCompatActivity() {

    private lateinit var enterNo:EditText
    private lateinit var showGuess:TextView
    private lateinit var showResult:TextView
    private lateinit var btn:Button
    private var str:String = "ry"
    private var no:Int = 5
    private var count:Int=1
    private val guessInfoList = arrayListOf<String>()
    private lateinit var historyRecyclerAdapter: HistoryAdapter
    private lateinit var recyclerHistory:RecyclerView
    private  lateinit var layoutManager:RecyclerView.LayoutManager
    private  var guessRange:Int=0
    private var guessSave:String=""
    private lateinit var header:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        StartAppSDK.init(this, "	202230028", true)
        setContentView(R.layout.activity_level1)

        enterNo=findViewById(R.id.enterNo)
        showGuess=findViewById(R.id.showGuess)
        showResult=findViewById(R.id.showResult)
        btn=findViewById(R.id.btn)
        header=findViewById(R.id.header)
        recyclerHistory=findViewById(R.id.recyclerView)
        layoutManager=LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


        guessRange = intent.getIntExtra("Range", 0)
        guessSave = intent.getStringExtra("SCORE")!!
        header.text = intent.getStringExtra("Display")


         val randomValues =List(1)  { Random.nextInt(0, guessRange) }

        no = randomValues[0]
        val sharedPreferencess= getSharedPreferences(
            getString(R.string.shared_preference),
            Context.MODE_PRIVATE
        )


        /* Make cousor blinkable */
        enterNo.requestFocus()
        enterNo.setCursorVisible(true)

        btn.setOnClickListener {

            /* parse user enter text into string */
            str = enterNo.getText().toString()

            if (str.isEmpty()) {

                    Toast.makeText(this, "Enter a number!", Toast.LENGTH_LONG).show()

                } else {

                    if (str.toInt() > guessRange-1 || str.toInt() < 0) {

                        Toast.makeText(this@Level1, "Out of Range!", Toast.LENGTH_SHORT).show()

                        val alterDialog=androidx.appcompat.app.AlertDialog.Builder(this)

                        alterDialog.setTitle("Confirmation")
                        alterDialog.setMessage("Out of Range! Range is 1 - ${guessRange - 1}")
                        alterDialog.setPositiveButton("Ok"){ text, listener->

                        }

                        alterDialog.create()
                        alterDialog.show()

                    }

                    else {

                        if (str.toInt() > no) {

                            showResult.setText("Your guess is large!")
                            enterNo.getText().clear()


                        } else if (str.toInt() < no) {

                            showResult.setText("Your guess is small!")
                            enterNo.getText().clear()

                        } else if (str.toInt() == no) {

                            showResult.setText("Hurrey! You won")

                            btn.visibility= View.GONE


                            when(guessSave)
                            {
                                "score" -> sharedPreferencess.edit().putString(
                                    guessSave,
                                    count.toString()
                                ).apply()

                                "score2" -> sharedPreferencess.edit().putString(
                                    "score2",
                                    count.toString()
                                ).apply()

                                "score3" -> sharedPreferencess.edit().putString(
                                    "score3",
                                    count.toString()
                                ).apply()

                                "score4" -> sharedPreferencess.edit().putString(
                                    "score4",
                                    count.toString()
                                ).apply()

                                "score5" -> sharedPreferencess.edit().putString(
                                    "score5",
                                    count.toString()
                                ).apply()

                                "score6" -> sharedPreferencess.edit().putString(
                                    "score6",
                                    count.toString()
                                ).apply()

                                "score7" -> sharedPreferencess.edit().putString(
                                    "score7",
                                    count.toString()
                                ).apply()

                                "score8" -> sharedPreferencess.edit().putString(
                                    "score8",
                                    count.toString()
                                ).apply()
                            }

                            val alterDialog=androidx.appcompat.app.AlertDialog.Builder(this)

                            alterDialog.setTitle("Congratulation!")
                            alterDialog.setMessage("Hurrey! you won Number is $str")
                            alterDialog.setPositiveButton("Select Level"){ text, listener->

                                val intent= Intent(
                                    this@Level1,
                                    LevelActivity::class.java
                                )
                                startActivity(intent)

                            }

                            alterDialog.setNegativeButton("Score Board"){ text, listener->

                                val intent = Intent(
                                    this,
                                    ScoreActivity::class.java
                                )

                                finish()

                                startActivity(intent)

                            }

                            alterDialog.create()
                            alterDialog.show()

                        }


                        /* show guess count to user */
                        showGuess.setText(count.toString())

                        count+=1

                        /*  pass all guess no into adapter */
                        guessInfoList.add(str)

                        historyRecyclerAdapter=
                            HistoryAdapter(
                                this,
                                guessInfoList
                            )
                        recyclerHistory.adapter= historyRecyclerAdapter
                        recyclerHistory.layoutManager =layoutManager


                    }

            }


            /*  after enter no make number palatte disable  */
        numberPad()

        }


    }

    private fun numberPad()
    {

        var view: View? = this.currentFocus

        if (view != null){

            var im:InputMethodManager=  getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            im.hideSoftInputFromWindow(view.windowToken, 0)
        }

    }






}






