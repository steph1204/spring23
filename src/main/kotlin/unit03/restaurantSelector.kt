package unit03

fun main() {

    var vegetarian = false
    var vegan = false
    var glutenFree = false

    println("This program will help you select a restaurant.")

    print("Is anyone in your party a vegetarian? (Enter yes or no): ")
    var response: String = readlnOrNull().orEmpty()
    if (response == "yes") vegetarian = true

    print("Is anyone in your party a vegan? (Enter yes or no): ")
    response = readlnOrNull().orEmpty()
    if (response == "yes") vegan = true

    print("Is anyone in your party gluten free? (Enter yes or no): ")
    response = readlnOrNull().orEmpty()
    if (response == "yes") glutenFree = true

    println("Here are your restaurant choices:")
    if (!vegetarian && !vegan && !glutenFree) println("Joe's Gourmet Burgers")
    if (!vegan && !glutenFree) println("Mama's Fine Italian")
    if (!vegan) println("Main Street Pizza")

    println("Corner Cafe")
    println("Chef's Kitchen")
}