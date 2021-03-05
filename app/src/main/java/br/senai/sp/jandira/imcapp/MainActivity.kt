package br.senai.sp.jandira.imcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_calcular.setOnClickListener {

            calcularIMC()

        }

    }

    fun calcularIMC(){
        var peso = editPeso.text.toString().toDouble()
        var altura = editAltura.text.toString().toDouble()
        var imc = peso / (altura * altura)

        resultado.text = imc.toString()

        Toast.makeText(this, "Meu primeiro programa Android", Toast.LENGTH_LONG).show()
    }
}