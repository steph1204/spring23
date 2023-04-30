package unit03

fun main() {
    val firstPlace: String
    val secondPlace: String
    val thirdPlace: String


    println("This program displays the first, second, and third")
    println("place runners in a race.")
    println("No ties, please.")


    print("Enter the first runner's name: ")
    val runner1: String = readln()
    print("Enter the first runner's time: ")
    val time1: Double = readln().toDouble()


    print("Enter the second runner's name: ")
    val runner2: String = readln()
    print("Enter the second runner's time: ")
    val time2: Double = readln().toDouble()


    print("Enter the third runner's name: ")
    val runner3: String = readln()
    print("Enter the third runner's time: ")
    val time3: Double = readln().toDouble()


    firstPlace = if (time1 < time2 && time1 < time3) {
        runner1
    } else if (time2 < time1 && time2 < time3) {
        runner2
    } else {
        runner3
    }


    secondPlace = if (time1 < time2 && time1 > time3 || time1 < time3 && time1 > time2) {
        runner1
    } else if (time2 < time1 && time2 > time3 || time2 < time3 && time2 > time1) {
        runner2
    } else {
        runner3
    }

    thirdPlace = if (time1 > time2 && time1 > time3) {
        runner1
    } else if (time2 > time1 && time2 > time3) {
        runner2
    } else {
        runner3
    }

    println("1st place: $firstPlace")
    println("2nd place: $secondPlace")
    println("3rd place: $thirdPlace")
}