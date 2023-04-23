package unit03

fun main() {

    print("Enter the number for a month: ")
    val month: Int = readln().toInt()

    print("Enter the number for a day: ")
    val day: Int = readln().toInt()

    print("Enter a two-digit year: ")
    val year: Int = readln().toInt()

    if (month * day == year) {
        println("That date is magic!")
    } else {
        println("Sorry, that's just a regular date... not magic.")
    }
}

