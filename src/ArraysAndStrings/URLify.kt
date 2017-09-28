package ArraysAndStrings

/**
 * Created by Jason 7/10/17.
 */

// Write a method to replace all spaces in a string with '%20'.

fun URLify(input: String): String {
    return input.replace(" ", "%20")
}

fun main(args: Array<String>) {
    val input = "Mr John Smith"
    println("Should print Mr%20John%20Smith: ${URLify(input)}")
}

