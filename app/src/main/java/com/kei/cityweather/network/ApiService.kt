package com.kei.cityweather.network

import com.kei.cityweather.model.DailyResponse
import com.kei.cityweather.model.ForecastResponse
import com.kei.cityweather.model.WeatherResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("weather?")
    fun getWeatherByGPS(
            @Query("lat") latitude : String,
            @Query("lan") longitude : String,
            @Query("units") units : String
    ): Single<WeatherResponse>

    @GET("forecast?")
    fun getForecastByGPS(
            @Query("lat") latitude : String,
            @Query("lan") longitude : String,
            @Query("units") units : String
    ): Single<ForecastResponse>
    @GET("find?")
    fun getCityDailyWeatherByGPS(
            @Query("lat") latitude : String,
            @Query("lan") longitude : String,
            @Query("cnt") cnt : String,
            @Query("units") units : String
    ): Single<DailyResponse>
}