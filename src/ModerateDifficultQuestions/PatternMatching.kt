package ModerateDifficultQuestions

/**
 * Created by Jason on 7/16/17.
 */

// You are given two strings, "pattern" and "value". The "pattern" string consists of just the letters a and b,
// describing a pattern within a string. For example, the string "catcatgocatgo" matches the pattern "aabab" (where cat
// is a and go is b). It also matches patterns like a, ab, and b. Write a method to determine if "value" matches
// "pattern."

fun isMatch(pattern: String, value: String): Boolean {
    if (pattern.isEmpty()) return value.isEmpty()

    val mainChar = pattern[0]
    val altChar = if (mainChar == 'a') 'b' else 'a'
    val size = value.length
    val numOfMain = pattern.count { it == mainChar }
    val numOfAlt = pattern.count { it == altChar }
    val indexOfFirstAltChar = pattern.indexOfFirst { it == altChar }
    val maxMainSize = size / numOfMain

    // for each possible mainChar length
    for (mainSize in 1 until maxMainSize) {
        val remainingLength = size - mainSize * numOfMain
        val potentialMainMatch = value.take(mainSize)
        // check size = mainPattern * numOfMain + altPattern * numOfAlt
        if (numOfAlt == 0 || remainingLength % numOfAlt == 0) {
            val altIndex = indexOfFirstAltChar * mainSize
            val altSize = if (numOfAlt == 0) 0 else remainingLength / numOfAlt
            val potentialAltMatch = if (numOfAlt == 0) "" else value.substring(altIndex, altIndex + altSize)
            val candidate = pattern.fold("") {
                a, c -> a + if (c == pattern[0]) potentialMainMatch else potentialAltMatch
            }

            if (candidate == value) return true
        }
    }

    return false
}

fun main(args: Array<String>) {
    val pattern = "aabab"
    val value = "catcatgocatgo"
    println("Should print true: Actual: ${isMatch(pattern, value)}")
}

