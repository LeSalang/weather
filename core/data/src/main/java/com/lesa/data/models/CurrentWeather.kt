package com.lesa.data.models

data class CurrentWeather(
    val lastUpdated: String, // Local time when the real time data was updated
    val tempC: Double, // Temperature in Celsius
    val conditionText: String, // Weather condition text
    val conditionIcon: String, // Weather condition icon
    val windKph: Double, // Wind speed in kilometers per hour
    val windDir: String, // Wind direction as 16 point compass (e.g., NSW)
    val pressureMmHg: Double, // Pressure in mmHg (In * 25.4)
    val precipMm: Double, // Precipitation amount in millimeters
    val humidity: Int, // Humidity as a percentage
    val feelslikeC: Double, // Feels like temperature in Celsius
    val uv: Double, // UV Index
    val gustKph: Double, // Wind gust in kilometers per hour
)
