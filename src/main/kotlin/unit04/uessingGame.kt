package unit04

import java.util.Random

fun main(args: Array<String>) {

    val MAX_NUMBER = 10

    var guess: Int
    val randNum: Int

    val rand = Random()

    randNum = rand.nextInt(MAX_NUMBER)

    println("I'm thinking of a number.")
    print("Guess what it is: ")
    guess = readln().toInt()

    while (guess != randNum) {
        if (guess < randNum) {
            println("No, that's too low.")
        } else if (guess > randNum) {
            println("Sorry, that's too high.")
        }
        print("Guess again: ")
        guess = readln().toInt()
    }

    println("Congratulations! You guessed it!")
    println("I was thinking of the number $randNum.")
}