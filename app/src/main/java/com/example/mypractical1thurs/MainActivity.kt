package com.example.mypractical1thurs

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Roll Button
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        //Count Up Button
        val countUpButton: Button = findViewById(R.id.countUp_button)
        countUpButton.setOnClickListener { countUp() }

        //Reset Button
        val resetButton: Button = findViewById(R.id.reset_button)
        resetButton.setOnClickListener { reset() }

    }

    private fun rollDice() {
        Toast.makeText(
            this, "button clicked",
            Toast.LENGTH_SHORT
        ).show()

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result2_text)
        val resultText3: TextView = findViewById(R.id.result3_text)
        val resultTotal: TextView = findViewById(R.id.resultTotal_text)
        //resultText.text = "Dice Rolled!"
        val randomInt = Random().nextInt(6) + 1
        val randomInt2 = Random().nextInt(6) + 1
        val randomInt3 = Random().nextInt(6) + 1

        resultText.text = randomInt.toString()
        resultText2.text = randomInt2.toString()
        resultText3.text = randomInt3.toString()

        var resultInt = resultText.text.toString().toInt()
        var resultInt2 = resultText2.text.toString().toInt()
        var resultInt3 = resultText3.text.toString().toInt()

        resultTotal.text = "Total: " + (resultInt + resultInt2 + resultInt3).toString()
    }

    private fun countUp() {
        Toast.makeText(
            this, "Counted Up",
            Toast.LENGTH_SHORT
        ).show()

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result2_text)
        val resultText3: TextView = findViewById(R.id.result3_text)
        val resultTotal: TextView = findViewById(R.id.resultTotal_text)

        if (resultText.text == "Dice 1" && resultText2.text == "Dice 2" && resultText3.text == "Dice 3") {
            resultText.text = "1"
            resultText2.text = "1"
            resultText3.text = "1"

            var resultInt = resultText.text.toString().toInt()
            var resultInt2 = resultText2.text.toString().toInt()
            var resultInt3 = resultText3.text.toString().toInt()

            resultTotal.text = (resultInt + resultInt2 + resultInt3).toString()
        } else {
            var resultInt = resultText.text.toString().toInt()
            var resultInt2 = resultText2.text.toString().toInt()
            var resultInt3 = resultText3.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
            if (resultInt2 < 6) {
                resultInt2++
                resultText2.text = resultInt2.toString()
            }
            if (resultInt3 < 6) {
                resultInt3++
                resultText3.text = resultInt3.toString()
            }

            resultTotal.text = "Total: " + (resultInt + resultInt2 + resultInt3).toString()
        }
    }

    private fun reset(){
        Toast.makeText(
            this, "Reset dice",
            Toast.LENGTH_SHORT
        ).show()

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result2_text)
        val resultText3: TextView = findViewById(R.id.result3_text)
        val resultTotal: TextView = findViewById(R.id.resultTotal_text)

        resultText.text = "Dice 1"
        resultText2.text = "Dice 2"
        resultText3.text = "Dice 3"
        resultTotal.text = "Total: "
    }
}

