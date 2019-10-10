package mx.edu.utng.jgarcia.appmultiple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_principal.*
import android.content.Intent
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class PrincipalActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        btn1Tran.setOnClickListener{
            startActivity(Intent(this,  Transformacion1Activity::class.java))
        }

        btn2Tran.setOnClickListener{
            startActivity(Intent(this,Transformacion2Activity::class.java))
        }

        btn3Tran.setOnClickListener{
            startActivity(Intent(this,Transformacion3Activity::class.java))
        }

        btnSalir.setOnClickListener{
            System.exit(0)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu_simplex,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var msg: String = ""
        //switch
        when(item.itemId){
            R.id.itmTran1-> {startActivity(Intent(this,  Transformacion1Activity::class.java))}
            R.id.itmTran2-> {startActivity(Intent(this,Transformacion2Activity::class.java))}
            R.id.itmTran3-> {startActivity(Intent(this,  Transformacion3Activity::class.java))}
            R.id.itmSalir-> {System.exit(0)}
        }
        Toast.makeText(this,msg, Toast.LENGTH_LONG).show()
        return super.onOptionsItemSelected(item)
    }
}
