package unit02

fun main() {
    val rows = 7
    val middleRow = rows / 2

    for (row in 1..rows) {
        val stars = if (row <= middleRow) 2 * row - 1 else 2 * (rows - row) + 1
        val spaces = middleRow - (stars / 2)
        repeat(spaces) { print(" ") }
        repeat(stars) { print("*") }
        println()
    }
}