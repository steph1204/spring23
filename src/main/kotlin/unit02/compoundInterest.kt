package unit02

import kotlin.math.pow

fun main() {
    val amount: Double

    print("What is the original principal? ")
    val principal: Double = readln().toDouble()
    print("What is the annual interest rate? ")
    var rate: Double = readln().toDouble()
    print("How many times per year is interest compounded? ")
    val compounding: Double = readln().toDouble()
    print("For how many years will interest be compounded? ")
    val years: Double = readln().toDouble()

    rate /= 100.0

    amount = principal * (1 + rate / compounding).pow((compounding * years))

    println("After ${years.toInt()} years you will have $%.2f.".format(amount))
}
