package com.deepesh.oops

interface Drivable{
    val maxSpeed: Double
    fun drive():String
    fun brake(){
        println("Brake")
    }
}