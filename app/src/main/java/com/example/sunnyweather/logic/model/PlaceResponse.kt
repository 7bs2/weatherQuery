package com.example.sunnyweather.logic.model

import android.location.Location
import com.google.gson.annotations.SerializedName


//搜索城市  得到相关的城市
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(val name: String, val location: com.example.sunnyweather.logic.model.Location, @SerializedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)