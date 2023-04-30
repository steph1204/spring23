package unit05

fun main() {
    print("Enter the wholesale cost: ")
    val wholesaleCost = readln().toDouble()

    print("Enter the markup percentage: ")
    val markupPercentage = readln().toDouble()

    val retailPrice = calculateRetail(wholesaleCost, markupPercentage)

    println("The item's retail price is: $retailPrice")
}

fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
    val markupDecimal = markupPercentage / 100.0
    return wholesaleCost * (1 + markupDecimal)
}