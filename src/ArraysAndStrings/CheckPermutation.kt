package ArraysAndStrings

/**
 * Created by Jason 7/10/17.
 */

// Given two strings, write a method to decide if one is a permutation of the other.

fun isPermutation(word1: String, word2: String): Boolean {
    if (word1.length != word2.length) return false
    val letters = IntArray(128)
    for (letter in word1) {
        letters[letter.toInt()]++
    }

    for (letter in word2) {
        letters[letter.toInt()]--
        if (letters[letter.toInt()] < 0) {
            return false
        }
    }

    return true
}

fun main(args: Array<String>) {
    val word1 = "asdf"
    val word2 = "fdas"
    val word3 = "zxcv"

    println("Should print true: ${isPermutation(word1, word2)}")
    println("Should print false: ${isPermutation(word1, word3)}")
}