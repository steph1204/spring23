package unit04

fun main() {
    var numStars: Int

    print("Enter today's sales for store 1: ")
    val sales1: Double = readln().toDouble()

    print("Enter today's sales for store 2: ")
    val sales2: Double = readln().toDouble()

    print("Enter today's sales for store 3: ")
    val sales3: Double = readln().toDouble()

    print("Enter today's sales for store 4: ")
    val sales4: Double = readln().toDouble()

    print("Enter today's sales for store 5: ")
    val sales5: Double = readln().toDouble()

    println("\nSALES BAR CHART")

    var bar = ""
    numStars = (sales1 / 100).toInt()
    for (i in 0 until numStars) {
        bar += "*"
    }
    println(bar)

    bar = ""
    numStars = (sales2 / 100).toInt()
    for (i in 0 until numStars) {
        bar += "*"
    }
    println(bar)

    bar = ""
    numStars = (sales3 / 100).toInt()
    for (i in 0 until numStars) {
        bar += "*"
    }
    println(bar)

    bar = ""
    numStars = (sales4 / 100).toInt()
    for (i in 0 until numStars) {
        bar += "*"
    }
    println(bar)

    bar = ""
    numStars = (sales5 / 100).toInt()
    for (i in 0 until numStars) {
        bar += "*"
    }
    println(bar)
}