package com.deepesh.oops

fun main(){
    val user1= DataClass(1,"Deepesh")
    val name = user1.name
    println(name)           //Deepesh

    user1.id = 2
    //user1.name = ""   --Error-- due to (val)
}

// classes whose main purpose is to hold data. In such a class some standard functionality and utility functions are often mechanically derivable from the data.
data class DataClass(var id: Long, val name: String)