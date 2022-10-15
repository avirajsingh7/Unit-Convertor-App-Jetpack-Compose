package com.example.unitconvertor

val length = mapOf(
    "Kilometre" to 0.001,
    "Metre" to 1.0,
    "Centimetre" to 100.0,
    "Millimetre" to 1000.0,
    "Micrometre" to 1e+6,
    "Nanometre" to 1e+9,
    "Mile" to 0.000621371,
    "Yard" to 1.09361,
    "Foot" to 3.28084,
    "Inch" to 0.0254
)

val time = mapOf(
    "Nanosecond" to 6e+10,
    "Microsecond" to 6e+7,
    "Millisecond" to 6e+4,
    "Second" to 60.0,
    "Minute" to 1.0,
    "Hour" to 0.0167,
    "Day" to 0.000694,
    "Week" to 9.9206e-5,
    "Month" to 2.2831e-5,
    "Year" to 1.9026e-6,
    "Decade" to 1.9026e-7,
    "Century" to 1.9026e-8
)



val currency = mapOf(
    "Dollar" to 1.00,
    "INR" to 82.40,
    "Euro" to 1.03,
    "Dirham" to 3.67,
    "Kuwait_Dinar" to 0.31,
    "Russian_Ruble" to 62.15,
    "South_Korea_Won" to 1440.47,
    "Yen" to 148.68,
    "Australian_Dollar" to 1.61,
    "Bangladeshi_Taka" to 102.15
)

fun Conv_length(
    convertFrom: String,
    convertTo: String,
    amount: Double):Double{
    var amount_new : Double = amount* length[convertTo]!!/ length[convertFrom]!!
    val number3digits:Double = Math.round(amount_new * 1000.0) / 1000.0
    return number3digits
}

fun Conv_time(
    convertFrom: String,
    convertTo: String,
    amount: Double):Double{
    var amount_new : Double = amount* time[convertTo]!!/ time[convertFrom]!!
    val number3digits:Double = Math.round(amount_new * 1000.0) / 1000.0
    return number3digits
}

fun Conv_cur(
    convertFrom: String,
    convertTo: String,
    amount: Double):Double{
    var amount_new : Double = amount*currency[convertTo]!!/ currency[convertFrom]!!
    val number3digits:Double = Math.round(amount_new * 1000.0) / 1000.0
    return number3digits
}