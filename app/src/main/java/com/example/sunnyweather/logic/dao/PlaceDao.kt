package com.example.sunnyweather.logic.dao

import android.content.Context
import com.example.sunnyweather.SunnyWeatherApplication
import com.example.sunnyweather.logic.model.Place
import com.google.gson.Gson

object PlaceDao {
    fun savePlace(place: Place) {
        sharePreference().edit().apply {
            putString("place", Gson().toJson(place))
            apply()
        }
    }

    fun getPlace(): Place {
        val placeJson = sharePreference().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSave() = sharePreference().contains("place")

    private fun sharePreference() = SunnyWeatherApplication.context.getSharedPreferences("sunny_weather", Context.MODE_PRIVATE)

}