package dev.francisco.bundleextras

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.francisco.bundleextras.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMain3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // realiza a soma dos valores fornecidos na primeira e na segunda activity e mostra o resultado

        val i = intent

        val numero1 = i.extras?.getInt("numero1")
        val numero2 = i.extras?.getInt("numero2")

        // Faz a validacao Null dos dois valores

        if (numero1 != null && numero2 != null) {
            val soma = numero1 + numero2
            binding.textResultado.setText("Soma do $numero1 e do $numero2 é igual a: $soma")
        } else {
            binding.textResultado.setText("Erro ao passar os valores")
        }
    }
}