package pro.developer.tictactoe

import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.ProgressBar

class activity_splash : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.requestFeature(Window.FEATURE_NO_TITLE)

        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)

        var imageViewLogo=findViewById<ImageView>(R.id.imageViewLogo)
        var progressbart=findViewById<ProgressBar>(R.id.progressbart)


        // progressbar
        progressbart.max=100
        val current_progress=100

        ObjectAnimator.ofInt(progressbart,"progress",current_progress)
            .setDuration(3000)
            .start()



        // handler

        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.zoom)
        imageViewLogo.startAnimation(anim)

        Handler().postDelayed({
            startActivity(Intent(applicationContext, MainActivity::class.java))
        }, 3000)



    }
}
