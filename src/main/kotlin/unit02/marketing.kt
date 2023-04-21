package unit02

fun main() {
    print("How many friends do you have? ")
    val friendsCount: Int = readln().toInt()

    if (friendsCount > 500) {
        println("Adopt a Dog Today!")
    } else {
        println("Buy Cat Food At 20% Off")
    }
}