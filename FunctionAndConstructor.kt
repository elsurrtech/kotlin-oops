package com.deepesh.oops

fun main(){

    var name = PersonName("Deepesh", "Sengar", 21)
    name.stateHobby()   // Watch Friends on Netflix
    name.age = 21
    name.hobby = "Programming"
    name.stateHobby()   // Programming

}

class PersonName(firstName: String, lastName: String){  //firstName: String, lastName: String -> (Primary Constructor)

    //Member Variables - Properties
    var age: Int? = null
    var hobby: String = "Watch Friends on Netflix"
    var FIRST_NAME : String? = null

    //Initializer Block
    init {
        this.FIRST_NAME = firstName
        println("Person Name is $firstName $lastName and age is $age (Age is null here)")
    }

    //Secondary Constructor
    constructor(firstName: String, lastName: String, age:Int):
            this(firstName, lastName){ //firstName and lastName taken from primary constructor
        this.age = age  //(this.age) is line 16 age and (= age) is above age Int in constructor
        println("Person Name is $firstName $lastName and age is $age")
    }

    //Member functions - Methods
    fun stateHobby(){
        //firstName and lastName are not available here
        //that`s why we made FIRST_NAME
        println("$FIRST_NAME\'s hobby is $hobby")
    }
}