package unit04

fun main() {
    var maxNum: Int
    var total = 0

    print("Enter a positive nonzero number: ")
    maxNum = readln().toInt()

    while (maxNum <= 0) {
        print("Invalid. Enter a positive nonzero number: ")
        maxNum = readln().toInt()
    }

    var num = 1
    while (num <= maxNum) {

        total += num

        num++
    }

    println("The sum of all the integers from 1 through $maxNum is $total")
}