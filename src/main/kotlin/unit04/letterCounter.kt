package unit04

import java.util.*
import javax.swing.JOptionPane
import kotlin.system.exitProcess

fun main() {
    val output: String
    val strUpper: String
    val letter: Char
    var num = 0

    val str: String = JOptionPane.showInputDialog("Enter a string.") ?: ""

    strUpper = str.uppercase(Locale.getDefault())

    var input: String = JOptionPane.showInputDialog(
        "Enter a letter contained in " +
                "the string.") ?: ""

    input = input.uppercase(Locale.getDefault())

    letter = input[0]


    for (i in strUpper.indices) {
        if (strUpper[i] == letter)
            num++
    }

    output = String.format("The letter %s " +
            "appears %d times in " +
            "the string: %s\n",
        letter, num, str)

    JOptionPane.showMessageDialog(null, output)

    exitProcess(0)
}

