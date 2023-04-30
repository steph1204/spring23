package unit04

fun main(){

    var starting: Double
    var increase: Double
    var days: Int

    print("Enter the starting number organisms: ")
    starting = readln().toDouble()

    while (starting < 2) {
        print("Invalid. Must be at least 2. Re-enter: ")
        starting = readln().toDouble()
    }

    print("Enter the daily increase: ")
    increase = readln().toDouble()

    while (increase < 0) {
        print("Invalid. Enter a non-negative number: ")
        increase = readln().toDouble()
    }

    print("Enter the number of days the organisms will multiply: ")
    days = readln().toInt()

    while (days < 1) {
        print("Invalid. Enter 1 or more: ")
        days = readln().toInt()
    }

    var organisms: Double = starting
    println("Day\t\tOrganisms")
    println("-----------------------------")

    for (i in 1..days) {
        println("$i\t\t$organisms")
        organisms += (organisms * increase)
    }
}