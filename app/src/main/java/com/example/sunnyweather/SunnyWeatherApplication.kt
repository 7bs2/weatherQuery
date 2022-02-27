package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

class SunnyWeatherApplication : Application() {

    @SuppressLint("StaticFieldLeak")
    companion object {
        const val TOKEN = "fAdFYql33NlAr6Bm"
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}