package pro.developer.tictactoe

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.core.view.isInvisible

class activity_won : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_won)

        var textViewWon=findViewById<TextView>(R.id.textViewWon)
        var btn_yes=findViewById<TextView>(R.id.btn_yesanswer)
        var btn_no=findViewById<TextView>(R.id.btn_noanswer)
        var root=findViewById<LinearLayout>(R.id.root)
        root.isInvisible

        val player = intent.getStringExtra("player")
//        if(player == "Draw") textViewWon.text = "Draw"
//        else textViewWon.text = "$player WON"

        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
        textViewWon.startAnimation(anim)



        if(player == "Draw") textViewWon.text = "Draw"
        else textViewWon.text = "$player "




        Handler().postDelayed({
            startActivity(Intent(this@activity_won, MainActivity::class.java))
        }, 2000)

    }
}
