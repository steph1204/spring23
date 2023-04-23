package unit02

import java.util.*

//Stephanie Hernandez // String Manipulator // 04-22-23

fun main() {

    print("Enter the name of your favorite city: ")
    val city: String = readln() // To hold user input

    println("Number of characters: ${city.length}")

    println(city.uppercase(Locale.getDefault()))

    println(city.lowercase(Locale.getDefault()))

    println(city[0])


}
    


