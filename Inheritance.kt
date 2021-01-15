package com.deepesh.oops

fun main(){
    var myCar = Cars("A3", "Audi")
    var myECar= ElectricCar("S","Tesla", 85.0)

    myCar.drive(200.0)
    myECar.drive(200.0)
    myECar.drive()
}


//parent/super class
open class Vehicle(){
    //properties
    //methods
}

//always use open for inheritance
open class Cars(val name: String, val brand: String){
    open var range: Double = 0.0

    fun extendRange(amount: Double){
        if (amount > 0){
            range += amount
        }
    }

    open fun drive(distance: Double){
        println("Drives total $distance")
    }
}

//sub class of cars
class ElectricCar(name: String, brand: String, batteryLife: Double): Cars(name, brand){

    override var range = batteryLife*6

    override fun drive(distance: Double) {
        println("Drives total $distance on Electricity")
    }

    fun drive(){
        println("Drives $range on Electric")
    }

}