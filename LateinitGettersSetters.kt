package com.deepesh.oops

import java.lang.IllegalArgumentException

fun main(){
    var myCar = Car()
    println(myCar.myBrand)

    myCar.maxSpeed = 350                        //getter
    println("Max speed is: ${myCar.maxSpeed}")  //setter

    myCar.myModel
}

class Car(){
    lateinit var owner: String

    val myBrand: String = "DODGE"
    get(){
        return field.toLowerCase()  //dodge
    }

    var maxSpeed: Int = 300
    get() = field
    set(value){
        field = if (value > 0) value else throw IllegalArgumentException("Speed should be greater than 0")
    }

    var myModel: String = "Challenger"  //getter is public
        private set                     //setter is private

}