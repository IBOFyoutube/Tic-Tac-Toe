package pro.developer.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        window.requestFeature(Window.FEATURE_CONTENT_TRANSITIONS)
        setContentView(R.layout.activity_main)


        val animClockwise = AnimationUtils.loadAnimation(applicationContext, R.anim.clockwise)
        val animMove = AnimationUtils.loadAnimation(applicationContext, R.anim.move)
        val animFade = AnimationUtils.loadAnimation(applicationContext, R.anim.fade)
        val animSlide = AnimationUtils.loadAnimation(applicationContext, R.anim.slide)
        val animZoom = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
        val animZoom2 = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom2)
        val animBlink = AnimationUtils.loadAnimation(applicationContext, R.anim.blink)


        var btnSingle=findViewById<Button>(R.id.btnSingle)
        var btnMulti=findViewById<Button>(R.id.btnMulti)


        btnSingle.setOnClickListener{
            btnSingle.startAnimation(animZoom2)
            startActivity(Intent(this@MainActivity, activity_second::class.java))
        }

        btnMulti.setOnClickListener{
            btnMulti.startAnimation(animZoom2)
            startActivity(Intent(this@MainActivity, activity_third::class.java))
        }



        // back ImageView


    }

    // for handling back button of the Android Device
    override fun onBackPressed() {
        super.onBackPressed()
        moveTaskToBack(true)
    }

}
