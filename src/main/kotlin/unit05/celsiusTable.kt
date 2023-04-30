package unit05

fun celsius(fahrenheit: Double): Double {
    return 5.0 / 9.0 * (fahrenheit - 32.0)
}

fun main() {
    println("Fahrenheit\tCelsius")
    for (i in 0..20) {
        val celsiusValue = celsius(i.toDouble())
        println("$i\t\t${"%.2f".format(celsiusValue)}")
    }
}