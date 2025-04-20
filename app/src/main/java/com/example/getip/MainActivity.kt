package com.example.getip

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.getip.api.ApiClient
import com.example.getip.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFetch.setOnClickListener {
            fetchIpAddress()
        }
    }

    private fun fetchIpAddress() {
        lifecycleScope.launch {
            try {
                val response = ApiClient.service.getIp()
                binding.tvIp.text = "Your IP: ${response.ip}"
            } catch (e: Exception) {
                binding.tvIp.text = "Error: ${e.message}"
            }
        }
    }
}