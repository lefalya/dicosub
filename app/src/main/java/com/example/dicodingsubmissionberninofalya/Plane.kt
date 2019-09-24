package com.example.dicodingsubmissionberninofalya
import java.io.Serializable
data class Plane(
    var name: String = "",
    var shortDescription: String = "",
    var photo: Int = 0,
    var backgroundPhoto: Int = 0,
    var range : Int = 0,
    var seating : String = "",
    var length : Double = 0.0,
    var cabinlength : Double = 0.0,
    var fuselageDiameter : Double = 0.0,
    var cabinWidth : Double = 0.0,
    var wingspan : Double = 0.0,
    var height : Double = 0.0
) : Serializable