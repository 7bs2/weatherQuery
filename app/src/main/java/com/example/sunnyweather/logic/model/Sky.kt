package com.example.sunnyweather.logic.model
import com.example.sunnyweather.R

object Sky  {
    data class Item(val info: String, val icon: Int, val bg: Int)

    private val dataList = mapOf("CLEAR_DAY" to Item("晴", R.drawable.ic_clear_day, R.drawable.bg_clear_day),
        "CLEAR_NIGHT" to Item("晴", R.drawable.ic_clear_night, R.drawable.bg_clear_night),
        "PARTLY_CLOUDY_DAY" to Item("多云", R.drawable.ic_partly_cloud_day, R.drawable.bg_partly_cloudy_day),
        "PARTLY_CLOUDY_NIGHT" to Item("多云", R.drawable.ic_partly_cloud_night, R.drawable.bg_partly_cloudy_night),
        "CLOUDY" to Item("阴", R.drawable.ic_cloudy, R.drawable.bg_cloudy),
        "WIND" to Item("大风", R.drawable.ic_cloudy, R.drawable.bg_wind),
        "LIGHT_RAIN" to Item("小雨", R.drawable.ic_light_rain, R.drawable.bg_rain),
        "MODERATE_RAIN" to Item("中雨", R.drawable.ic_moderate_rain, R.drawable.bg_rain),
        "HEAVY_RAIN" to Item("大雨", R.drawable.ic_heavy_rain, R.drawable.bg_rain),
        "STORM_RAIN" to Item("暴雨", R.drawable.ic_storm_rain, R.drawable.bg_rain),
        "THUNDER_SHOWER" to Item("雷阵雨", R.drawable.ic_thunder_shower, R.drawable.bg_rain),
        "SLEET" to Item("雨夹雪", R.drawable.ic_sleet, R.drawable.bg_rain),
        "LIGHT_SNOW" to Item("小雪", R.drawable.ic_light_snow, R.drawable.bg_snow),
        "MODERATE_SNOW" to Item("中雪", R.drawable.ic_moderate_snow, R.drawable.bg_snow),
        "HEAVY_SNOW" to Item("大雪", R.drawable.ic_heavy_snow, R.drawable.bg_snow),
        "STORM_SNOW" to Item("暴雪", R.drawable.ic_heavy_snow, R.drawable.bg_snow),
        "HAIL" to Item("冰雹", R.drawable.ic_hail, R.drawable.bg_snow),
        "LIGHT_HAZE" to Item("轻度雾霾", R.drawable.ic_light_haze, R.drawable.bg_fog),
        "MODERATE_HAZE" to Item("中度雾霾", R.drawable.ic_moderate_haze, R.drawable.bg_fog),
        "HEAVY_HAZE" to Item("重度雾霾", R.drawable.ic_heavy_haze, R.drawable.bg_fog),
        "FOG" to Item("雾", R.drawable.ic_fog, R.drawable.bg_fog),
        "DUST" to Item("浮尘", R.drawable.ic_fog, R.drawable.bg_fog)
    )

    fun getSky(Itemcon: String) = dataList[Itemcon] ?: dataList["CLEAR_DAY"]
}