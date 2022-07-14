package com.chaosundercontrol.simulador

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.chaosundercontrol.simulador.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val comFindViewById = 1
        val comBinding = 2
        val escolha = comFindViewById

        if (escolha == comFindViewById) {
            //método 1 - usando findViewById, mais repetitivo, evitar
            setContentView(R.layout.activity_main)
            val tvHello = findViewById<TextView>(R.id.textViewHello)
            tvHello.text = "Olá Mundo com findViewById"
        }
        if (escolha == comBinding) {
            //método 2 - recomendado - inserir campos no arquivo build.grade(app)
            val binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
            binding.textViewHello.text = "Olá Mundo com Binding"
        }
    }
}