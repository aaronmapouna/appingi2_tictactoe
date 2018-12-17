package fr.epita.aaron.tictactoe

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity() {

    var turn = true
    var gameOver = false
    var str = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        Player2.isEnabled = false

        case00.setTextColor(Color.BLACK)
        case01.setTextColor(Color.BLACK)
        case02.setTextColor(Color.BLACK)
        case10.setTextColor(Color.BLACK)
        case11.setTextColor(Color.BLACK)
        case12.setTextColor(Color.BLACK)
        case20.setTextColor(Color.BLACK)
        case21.setTextColor(Color.BLACK)
        case22.setTextColor(Color.BLACK)


        case00.setOnClickListener()
        {
            if (turn == true) {
                str = "X"
                turn = false
                Player1.isEnabled = false
                Player2.isEnabled = true
            } else {
                turn = true
                str = "O"
                Player1.isEnabled = true
                Player2.isEnabled = false
            }

            case00.text = str


        }

        case01.setOnClickListener()
        {
            if (turn == true) {
                str = "X"
                turn = false
                Player1.isEnabled = false
                Player2.isEnabled = true
            } else {
                turn = true
                str = "O"
                Player1.isEnabled = true
                Player2.isEnabled = false
            }

            case01.text = str

        }
        case02.setOnClickListener()
        {
            if (turn == true) {
                str = "X"
                turn = false

                Player1.isEnabled = false
                Player2.isEnabled = true
            } else {
                turn = true
                str = "O"

                Player1.isEnabled = true
                Player2.isEnabled = false
            }

            case02.text = str

        }
        case10.setOnClickListener()
        {
            if (turn == true) {
                str = "X"
                turn = false

                Player1.isEnabled = false
                Player2.isEnabled = true
            } else {
                turn = true
                str = "O"

                Player1.isEnabled = true
                Player2.isEnabled = false
            }

            case10.text = str

        }
        case11.setOnClickListener()
        {
            if (turn == true) {
                str = "X"
                turn = false

                Player1.isEnabled = false
                Player2.isEnabled = true
            } else {
                turn = true
                str = "O"

                Player1.isEnabled = true
                Player2.isEnabled = false
            }

            case11.text = str

        }
        case12.setOnClickListener()
        {

            if (turn == true) {
                str = "X"
                turn = false

                Player1.isEnabled = false
                Player2.isEnabled = true
            } else {
                turn = true
                str = "O"

                Player1.isEnabled = true
                Player2.isEnabled = false
            }

            case12.text = str

        }
        case20.setOnClickListener()
        {

            if (turn == true) {
                str = "X"
                turn = false

                Player1.isEnabled = false
                Player2.isEnabled = true
            } else {
                turn = true
                str = "O"

                Player1.isEnabled = true
                Player2.isEnabled = false
            }

            case20.text = str
        }
        case21.setOnClickListener()
        {
            if (turn == true) {
                str = "X"
                turn = false

                Player1.isEnabled = false
                Player2.isEnabled = true
            } else {
                turn = true
                str = "O"

                Player1.isEnabled = true
                Player2.isEnabled = false
            }

            case21.text = str

        }
        case22.setOnClickListener()
        {

            if (turn == true) {
                str = "X"
                turn = false

                Player1.isEnabled = false
                Player2.isEnabled = true
            } else {
                turn = true
                str = "O"

                Player1.isEnabled = true
                Player2.isEnabled = false
            }

            case22.text = str

        }


    }


}
