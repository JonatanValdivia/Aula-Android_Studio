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
        if(editPeso.text.isEmpty()){
            editPeso.error = getString(R.string.erro_peso)

        }else if(editAltura.text.isEmpty()){
            editAltura.error = getString(R.string.erro_altura)
        }else{


            var imc = imc()
            //Cálculos não podem ser feitos no MainActivity, por isso fora criado um novo arquivo
            imc.peso = editPeso.text.toString().toDouble()
            imc.altura = editAltura.text.toString().toDouble()
            resultado.text = imc.calcularIMC().toString()

            Toast.makeText(this, "Meu primeiro programa Android", Toast.LENGTH_LONG).show()
        }
    }
}