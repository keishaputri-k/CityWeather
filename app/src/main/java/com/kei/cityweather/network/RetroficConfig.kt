package com.kei.cityweather.network


import com.kei.cityweather.BuildConfig
import com.kei.cityweather.model.DailyResponse
import com.kei.cityweather.model.ForecastResponse
import com.kei.cityweather.model.WeatherResponse
import io.reactivex.rxjava3.core.Single
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitConfig {
    private val api = Retrofit.Builder().baseUrl(BuildConfig.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
        .client(getOkHttpClient())
        .build()
        .create(ApiService::class.java)

    fun getForecastFromGPS(latitude : String, longitude : String, units : String) : Single<ForecastResponse>{
        return api.getForecastByGPS(latitude, longitude, units)
    }

    fun getDataFromGPS(latitude: String, longitude: String, units: String) : Single<WeatherResponse>{
        return api.getWeatherByGPS(latitude, longitude, units)
    }

    fun getCityDailyWeatherFromGPS(latitude: String, longitude: String, cnt : String, units: String) : Single<DailyResponse>{
        return api.getCityDailyWeatherByGPS(latitude, longitude, cnt, units)
    }

    private fun getOkHttpClient(): OkHttpClient {
        val client = OkHttpClient.Builder()
        client.addInterceptor(RequestInterceptor())
        return client.build()
    }


}