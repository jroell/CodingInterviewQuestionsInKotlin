package ArraysAndStrings

/**
 * Created by Jason 7/10/17.
 */

// There are three types of edits that can be performed on strings: insert a character, remove a character, or
// replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.

// Example:

// pale, ple    -> true
// pales, pale  -> true
// pale, bale   -> true
// pale, bake   -> false

fun isOneEditAway(firstWord: String, secondWord: String): Boolean {
		if (Math.abs(firstWord.length - secondWord.length) > 1) return false

		var diff = 0
		val longerWord: String
		val shorterWord: String
		var equalFlag = false
		when {
				firstWord.length > secondWord.length -> {
						longerWord = firstWord
						shorterWord = secondWord
				}
				secondWord.length > firstWord.length -> {
						longerWord = secondWord
						shorterWord = firstWord
				}
				else -> {
						equalFlag = true
						longerWord = secondWord
						shorterWord = firstWord
				}
		}
		var j = 0
		for (i in 0 until longerWord.length){
				if (j == shorterWord.length) break
				if (longerWord[i] == shorterWord[j]){
						j += 1
				}
				else {
						diff += 1
						if (diff > 1){
								break
						}
						if (equalFlag){
								j += 1
						}
				}
		}
		return diff <= 1
}

fun main(args: Array<String>) {
		println("Should return true: ${isOneEditAway("pale", "ple")}")
		println("Should return true: ${isOneEditAway("pales", "pale")}")
		println("Should return true: ${isOneEditAway("pale", "bale")}")
		println("Should return false: ${isOneEditAway("pale", "bake")}")
}