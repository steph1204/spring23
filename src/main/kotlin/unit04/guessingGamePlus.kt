package unit04

import kotlin.random.Random
fun main() {
    val MAX_NUMBER = 10

    var guess: Int
    val randNum: Int

    val rand = Random

    randNum = rand.nextInt(MAX_NUMBER)

    println("I'm thinking of a number.")
    print("Guess what it is: ")
    guess = readln().toInt()


    var count: Int = 1

    while (guess != randNum) {
        if (guess < randNum) {
            println("No, that's too low.")
        } else if (guess > randNum) {
            println("Sorry, that's too high.")
        }

        print("Guess again: ")
        guess = readln().toInt()

        count++
    }

    println("Congratulations! You guessed it!")
    println("I was thinking of the number $randNum.")
    println("You got it right in $count guesses.")
}