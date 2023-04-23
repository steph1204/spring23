package unit03

fun main() {
    val bmi: Double

    println("This program will calculate your body mass index, or BMI.")

    print("Enter your weight, in pounds:  ")
    val weight: Double = readln().toDouble()

    print("Enter your height, in inches: ")
    val height: Double = readln().toDouble()

    bmi = weight * 703 / (height * height)

    println("Your body mass index (BMI) is $bmi")

    if (bmi < 18.5) {
        println("You are underweight.")
    } else if (bmi > 25) {
        println("You are overweight.")
    } else {
        println("Your weight is optimal.")
    }
}