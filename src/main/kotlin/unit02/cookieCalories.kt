package unit02

fun main() {
    val COOKIES_PER_BAG = 40
    val SERVINGS_PER_BAG = 10
    val CALORIES_PER_SERVING = 300

    val COOKIES_PER_SERVING = COOKIES_PER_BAG / SERVINGS_PER_BAG

    val CALORIES_PER_COOKIE = CALORIES_PER_SERVING / COOKIES_PER_SERVING

    val cookiesEaten: Int
    val totalCalories: Int

    print("Enter the number of cookies eaten: 7 ")
    cookiesEaten = readln().toInt()

    totalCalories = (cookiesEaten * CALORIES_PER_COOKIE)

    print("Number of total calories consumed: $totalCalories ")
}