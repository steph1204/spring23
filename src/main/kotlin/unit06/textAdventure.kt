package unit06

fun main() {
    val roomList = arrayOfNulls<Array<Any?>>(7)

    roomList[0] = arrayOf("You are in a bedroom with a bed and a closet. There are exits to the North and to the East.", 3, 1, null, null)

    roomList[1] = arrayOf("You are in the South Hall with paintings on the walls. There are exits to the North, East, and West.", 4, 2, null, 0)

    roomList[2] = arrayOf("You are in a dark, cold dining room with a large table. There are exits to the East and North.", 5, null, null, 1)

    roomList[3] = arrayOf("You enter another bedroom with an old dusty bed and a window. There are exits to the East and South.", null, 4, 0, null)

    roomList[4] = arrayOf("You're walking down the North Hall with portraits of people you don't recognize. There are exits in all four directions.", 6, 5, 1, 3)

    roomList[5] = arrayOf("You are in a kitchen with a stove, an old refrigerator, and ripped grocery bags. There are exits to the West and South.", null, null, 2, 4)

    roomList[6] = arrayOf("You step onto a balcony overlooking a garden. There are exits to the South.", null, null, 4, null)

    var currentRoom = 0
    val done = false

    while (!done) {

        println()
        println(roomList[currentRoom]?.get(0))

        print("What do you want to do? (n: North, e: East, s: South, w: West) ")

        val nextRoom: Int? = when (readlnOrNull()?.lowercase()) {
            "n" -> roomList[currentRoom]?.get(1) as Int?
            "e" -> roomList[currentRoom]?.get(2) as Int?
            "s" -> roomList[currentRoom]?.get(3) as Int?
            "w" -> roomList[currentRoom]?.get(4) as Int?
            else -> {
                println(">>>>> Invalid input. Please enter n, e, s, or w.")
                null
            }
        }

        if (nextRoom == null) {
            println(">>>>> You cannot go that way.")
        } else {
            currentRoom = nextRoom
        }
    }
}