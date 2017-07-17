package ArraysAndStrings

/**
 * Created by Jason 7/10/17.
 */

// Assume you have a method isSubstring which checks if one word is a substring of another. Given two strings, s1 and
// s2, write code to check if s2 is a rotation of s1 using only one call to isSubstring (e.g., "waterbottle" is a
// rotation of "erbottlewat").

fun isRotation(input1: String, input2: String): Boolean {
    var isRotation = false
    var joinedWords = input2 + input2
    isRotation = joinedWords.isSubstring(input1)

    return isRotation
}

fun String.isSubstring(input1: String): Boolean {
    var index: Int = this.indexOf(input1)
    return index > 0
}

fun main(args: Array<String>) {
    println("Should print true : ${isRotation("waterbottle", "erbottlewat")}")
    println("Should print false : ${isRotation("wterbottle", "erbottlewat")}")
}