package fr.epita.aaron.tictactoe


import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val explicitIntent = Intent(this, SecondActivity::class.java)
        explicitIntent.putExtra("name",editText.toString())
        btn1.setOnClickListener{
            startActivity(explicitIntent)

        }

    }

}