package ArraysAndStrings

/**
 * Created by Jason 7/10/17.
 */

// Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

fun isUnique(input: String): Boolean {
    val booleanMapOfCharactersSeen = BooleanArray(256)
    for (character in input){
        if (booleanMapOfCharactersSeen[character.toInt()]){
            return false
        }
        else {
            booleanMapOfCharactersSeen[character.toInt()] = true
        }
    }

    return true
}

fun main(args: Array<String>) {
    println("Should print true: ${isUnique("abcdefgh")}")
    println("Should print false: ${isUnique("abcdedafgh")}")
}