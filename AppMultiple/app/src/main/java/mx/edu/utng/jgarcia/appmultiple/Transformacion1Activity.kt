package mx.edu.utng.jgarcia.appmultiple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_transformacion1.*

class Transformacion1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transformacion1)

        btnRegresaTran1.setOnClickListener{
            finish()
        }
    }
}
