package ArraysAndStrings

/**
 * Created by Jason 7/10/17.
 */

// Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase
// that is the same forward and backwards. A permutation is a rearrangement of letters. The palindrome does not need
// to be limited to just dictionary words.

// Example:

// Input:   Tact Coa
// Output:  True  (permutations: "taco cat", "atco cta", etc. )

fun isPermutationOfAPalindrome(input: String): Boolean {
    val dictionary = mutableMapOf<Char, Int>()
    for (letter in input){
        if (dictionary.contains(letter)){
            val temp = dictionary.getValue(letter)
            dictionary.put(letter, temp + 1)
        } else {
            dictionary.put(letter, 1)
        }
    }

    val numberOfOdds = dictionary.filter { it.value % 2 == 0 }.count()
    return numberOfOdds < 2
}

fun main(args: Array<String>) {
    val permutationOfPalindrome = "Tact Coa"
    val notPermutationOfPalindrom = "This is not a permutation of a palindrome"

    println("should print true: ${isPermutationOfAPalindrome(permutationOfPalindrome)}")
    println("should print false: ${isPermutationOfAPalindrome(notPermutationOfPalindrom)}")
}