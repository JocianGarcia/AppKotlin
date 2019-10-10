package mx.edu.utng.jgarcia.appmultiple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_transformacion2.*

class Transformacion2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transformacion2)

        btnRegresaTran2.setOnClickListener{
            finish()
        }
    }
}
