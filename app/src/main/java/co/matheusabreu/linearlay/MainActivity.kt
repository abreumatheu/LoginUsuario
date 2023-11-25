package co.matheusabreu.linearlay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import co.matheusabreu.linearlay.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

