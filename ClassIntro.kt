package com.deepesh.oops

//Main Function Initiated
fun main(){
    //3 types of creating classes

    //first
    Person("Deepesh", "Sengar")

    //second
    //var x = Person()   --Error--
    var x = Person2() // as Person2 inputs are already assigned

    //third
    var y = Person2(lastName = "Singh")

}

//Class Person created
class Person(firstName: String, lastName: String){

    //anything inside init is going to run first
    init {
        println("Person Created with name: $firstName $lastName")
    }
}

//Class Person2 with string initializer
class Person2(firstName: String = "Vaibhav", lastName: String= "Bedua"){

    //anything inside init is going to run first
    init {
        println("Person Created with name: $firstName $lastName")
    }
}