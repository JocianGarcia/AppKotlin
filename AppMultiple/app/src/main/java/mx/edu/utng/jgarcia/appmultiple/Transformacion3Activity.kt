package mx.edu.utng.jgarcia.appmultiple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_transformacion3.*

class Transformacion3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transformacion3)

        btnRegresaTran3.setOnClickListener{
            finish()
        }
    }
}
