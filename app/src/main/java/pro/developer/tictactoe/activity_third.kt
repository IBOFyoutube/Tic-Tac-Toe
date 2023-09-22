package pro.developer.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class activity_third : AppCompatActivity() {

    private lateinit var builder: AlertDialog.Builder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_third)

        val button0=findViewById<Button>(R.id.button0)
        val button1=findViewById<Button>(R.id.button1)
        val button2=findViewById<Button>(R.id.button2)
        val button3=findViewById<Button>(R.id.button3)
        val button4=findViewById<Button>(R.id.button4)
        val button5=findViewById<Button>(R.id.button5)
        val button6=findViewById<Button>(R.id.button6)
        val button7=findViewById<Button>(R.id.button7)
        val button8=findViewById<Button>(R.id.button8)
        val buttonReset=findViewById<Button>(R.id.buttonReset)

        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.move)


        var chance = "X"
        var board = arrayListOf<String>("", "", "", "", "", "", "", "", "")

        button0.setOnClickListener {
            if (board[0] != "")
            else if (chance == "X") {
                button0.text = "X"
                board[0] = "X"
                chance = "O"
            } else {
                button0.text = "O"
                board[0] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button1.setOnClickListener {
            if (board[1] != "")
            else if (chance == "X") {
                button1.text = "X"
                board[1] = "X"
                chance = "O"
            } else {
                button1.text = "O"
                board[1] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button2.setOnClickListener {
            if (board[2] != "")
            else if (chance == "X") {
                button2.text = "X"
                board[2] = "X"
                chance = "O"
            } else {
                button2.text = "O"
                board[2] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button3.setOnClickListener {
            if (board[3] != "")
            else if (chance == "X") {
                button3.text = "X"
                board[3] = "X"
                chance = "O"
            } else {
                button3.text = "O"
                board[3] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button4.setOnClickListener {
            if (board[4] != "")
            else if (chance == "X") {
                button4.text = "X"
                board[4] = "X"
                chance = "O"
            } else {
                button4.text = "O"
                board[4] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button5.setOnClickListener {
            if (board[5] != "")
            else if (chance == "X") {
                button5.text = "X"
                board[5] = "X"
                chance = "O"
            } else {
                button5.text = "O"
                board[5] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button6.setOnClickListener {
            if (board[6] != "")
            else if (chance == "X") {
                button6.text = "X"
                board[6] = "X"
                chance = "O"
            } else {
                button6.text = "O"
                board[6] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button7.setOnClickListener {
            if (board[7] != "")
            else if (chance == "X") {
                button7.text = "X"
                board[7] = "X"
                chance = "O"
            } else {
                button7.text = "O"
                board[7] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        button8.setOnClickListener {
            if (board[8] != "")
            else if (chance == "X") {
                button8.text = "X"
                board[8] = "X"
                chance = "O"
            } else {
                button8.text = "O"
                board[8] = "O"
                chance = "X"
            }
            resultOut(board)
        }

        buttonReset.setOnClickListener{
            startActivity(Intent(applicationContext, activity_third::class.java))
        }



    }

    private fun resultOut(board: ArrayList<String>){
        val builder=AlertDialog.Builder(this)
        if(result(board, "X")){
       //     startActivity(Intent(applicationContext, activity_won::class.java).putExtra("player", "X Won"))
            builder.setTitle("Winner")
                .setMessage("X Won !\nDo you wanna play again ?")
                .setNegativeButton("No"){dialogInterface,it->
                    finish()
                }
                .setPositiveButton("Yes"){dialogInterface,it->
                    startActivity(Intent(this,activity_third::class.java))
                }
                .setNeutralButton("Menu"){dialogInterface,it->
                    startActivity(Intent(this,MainActivity::class.java))
                }
            builder.show()

        }else if(result(board, "O")){
      //      startActivity(Intent(applicationContext, activity_won::class.java).putExtra("player", "0 Won"))
            builder.setTitle("Winner")
                .setMessage("0 Won ! \nDo you wanna play again ?")
                .setNegativeButton("No"){dialogInterface,it->
                   finish()
                }
                .setPositiveButton("Yes"){dialogInterface,it->
                    startActivity(Intent(this,activity_third::class.java))
                }
                .setNeutralButton("Menu"){dialogInterface,it->
                    startActivity(Intent(this,MainActivity::class.java))
                }
            builder.show()
        }
        if(isBoardFull(board)){

       //     startActivity(Intent(applicationContext, activity_won::class.java).putExtra("player", "It's Draw"))

            builder.setTitle("Winner")
                .setMessage("Draw ! \nDo you wanna play again ?")
                .setNegativeButton("No"){dialogInterface,it->
                    finish()
                }
                .setPositiveButton("Yes"){dialogInterface,it->
                    startActivity(Intent(this,activity_third::class.java))
                }
                .setNeutralButton("Menu"){dialogInterface,it->
                    startActivity(Intent(this,MainActivity::class.java))
                }
            builder.show()


        }
    }

    private fun isBoardFull(board: ArrayList<String>): Boolean {
        for (i in board)
            if(i != "X" && i != "O") return false
        return true
    }

    private fun result(bd: ArrayList<String>, s: String): Boolean =
        if(bd[0] == s && bd[1] == s && bd[2] == s) true
        else if(bd[3] == s && bd[4] == s && bd[5] == s) true
        else if(bd[6] == s && bd[7] == s && bd[8] == s) true
        else if(bd[0] == s && bd[3] == s && bd[6] == s) true
        else if(bd[1] == s && bd[4] == s && bd[7] == s) true
        else if(bd[2] == s && bd[5] == s && bd[8] == s) true
        else if(bd[0] == s && bd[4] == s && bd[8] == s) true
        else if(bd[2] == s && bd[4] == s && bd[6] == s) true
        else false

    // for handling back buttton of the Android Device
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this@activity_third, MainActivity::class.java))
    }

}
