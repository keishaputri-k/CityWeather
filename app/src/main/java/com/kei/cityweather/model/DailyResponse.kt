package com.kei.cityweather.model

data class DailyResponse(
	val count: Int? = null,
	val cod: String? = null,
	val message: String? = null,
	val list: List<ListItemD?>? = null
)

data class Coord(
	val lon: Double? = null,
	val lat: Double? = null
)

data class ListItemD(
	val dt: Int? = null,
	val rain: Any? = null,
	val coord: Coord? = null,
	val snow: Any? = null,
	val name: String? = null,
	val weather: List<WeatherItemD?>? = null,
	val main: Main? = null,
	val id: Int? = null,
	val clouds: Clouds? = null,
	val sys: Sys? = null,
	val wind: Wind? = null
)

data class WeatherItemD(
	val icon: String? = null,
	val description: String? = null,
	val main: String? = null,
	val id: Int? = null
)

data class Sys(
	val country: String? = null
)

data class Wind(
	val deg: Int? = null,
	val speed: Double? = null
)

data class Clouds(
	val all: Int? = null
)

data class Main(
	val temp: Double? = null,
	val tempMin: Double? = null,
	val humidity: Int? = null,
	val pressure: Int? = null,
	val feelsLike: Double? = null,
	val tempMax: Double? = null,
	val grndLevel: Int? = null,
	val seaLevel: Int? = null
)

