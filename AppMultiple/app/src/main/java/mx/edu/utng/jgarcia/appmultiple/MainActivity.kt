package mx.edu.utng.jgarcia.appmultiple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.content.Intent

class MainActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT:Long=8500//5 Segundos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Crear objeto de la clase Animation, se asocia el xml que tiene la animacion
        val animation: Animation = AnimationUtils.loadAnimation(this,R.anim.animacion)
        txvUno.startAnimation(animation)

        Handler().postDelayed({
            startActivity(Intent(this,PrincipalActivity::class.java))
            finish()
        },SPLASH_TIME_OUT)
    }
}
