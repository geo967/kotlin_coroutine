package com.example.coroutines2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //coroutine contexts ; dispatchers
        GlobalScope.launch { Dispatchers.IO
             Log.d("Ant","This is the coroutine from the main thread ${Thread.currentThread().name}")
             val ans1=doNetworkCall()
             Log.d("Ant","After fun invoke $ans1")
             delay(3000L)
             withContext(Dispatchers.Main){
                 Log.d("Ant","This is the coroutine from the main thread $ans1")

             }
         }
    }
    private suspend fun doNetworkCall():String{
        Log.d("Ant","Inside network call.....")
        delay(10000L)
        return "this is a network call"
    }
}