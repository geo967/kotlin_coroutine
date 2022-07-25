package com.example.coroutines2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.coroutines2.databinding.ActivityMain2Binding
import com.example.coroutines2.databinding.ActivityMainBinding
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

     /*   GlobalScope.launch {
            Log.d("Dog","Inside OnCreate.....")
            delay(10000L)
            val ans=doNetworkCall()
            Log.d("Dog","After 1st Call, $ans")

            val ans1=doNetworkCall1()
            Log.d("Dog","After 2nd Call, $ans1")
        }
        Log.d("Dog","Outside Global Scope")*/


    }

   /* private suspend fun doNetworkCall():String{
        Log.d("Dog","Inside network call.....")
        delay(3000L)
        return "this is a network call"
    }
    private suspend fun doNetworkCall1():String{
        Log.d("Dog","Inside network call 1.....")
        delay(3000L)
        return "this is a network call 1"
    }*/
}