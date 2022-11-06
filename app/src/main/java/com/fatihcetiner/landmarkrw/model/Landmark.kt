package com.fatihcetiner.landmarkrw.model

import java.io.Serializable

class Landmark(
    val name : String,
    val country: String,
    val image: Int
) : Serializable{
}