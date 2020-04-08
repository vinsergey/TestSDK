package asta.mobi.testsdk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import asta.mobi.calc.CalcUtils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sum = CalcUtils.plus(3, 4)

        Toast.makeText(this, "Sum = $sum", Toast.LENGTH_LONG).show()
    }
}
