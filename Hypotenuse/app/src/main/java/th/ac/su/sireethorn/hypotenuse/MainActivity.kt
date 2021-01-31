package th.ac.su.sireethorn.hypotenuse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val setA =findViewById<EditText>(R.id.edtA)
        val setB =findViewById<EditText>(R.id.edtB)
        val btnSub = findViewById<Button>(R.id.btnSolve)
        val viewC = findViewById<TextView>(R.id.textviewC)

        var discount:Double = 0.0
        var total:Double = 0.0

    btnSub.setOnClickListener() {

        var inputA:Double = setA.text.toString().toDouble()
        var inputB:Double = setB.text.toString().toDouble()

        discount = inputA * inputA + inputB * inputB;
        total = Math.sqrt(discount);
        viewC.text = total.toString()


    }

    }
}