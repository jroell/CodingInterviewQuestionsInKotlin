package ModerateDifficultQuestions

import org.testng.annotations.Test

/**
 * Created by Jason on 7/16/17.
 */

// Given any integer, print an English phrase that describes the integer (e.g., "One Thousand, Two Hundred Thirty
// Four").

class EnglishNumber {
    companion object {
        val numberToEnglishMap = mapOf(1 to "one", 2 to "two", 3 to "three", 4 to "four", 5 to "five",
                6 to "six", 7 to "seven", 8 to "eight", 9 to "nine", 10 to "ten", 11 to "eleven", 12 to "twelve",
                13 to "thirteen", 20 to "twenty", 30 to "thirty", 40 to "forty", 50 to "fifty", 60 to "sixty",
                70 to "seventy", 80 to "eighty", 90 to "ninety", 100 to "hundred")
    }

}

fun Int.toEnglish(): String {
    val listOfChars = this.toString().reversed().toCharArray()
    var segment = ""
    var count = 0
    var segmentCount = 0
    val builder = arrayListOf<String>()
    var innerBuilder = ""
    for ((i, c) in listOfChars.withIndex()) {
        segment += c
        count += 1
        if (count > 2 || listOfChars.lastIndex == i) {
            segmentCount += 1

            val unReversedSegment = segment.reversed()
            builder.add(addTensPosition(segmentCount))


            when {
                unReversedSegment.length == 3 -> {
                    innerBuilder += EnglishNumber.numberToEnglishMap[unReversedSegment[0].toString().toInt()] + " " +
                            EnglishNumber.numberToEnglishMap[100] + " "
                    innerBuilder += EnglishNumber.numberToEnglishMap[(unReversedSegment[1].toString() + "0").toInt()] +
                            " "
                    innerBuilder += EnglishNumber.numberToEnglishMap[(unReversedSegment[2].toString()).toInt()] + " "
                    builder.add(innerBuilder)
                }
                unReversedSegment.length == 2 -> {
                    innerBuilder += EnglishNumber.numberToEnglishMap[(unReversedSegment[0].toString() + "0").toInt()] +
                            " "
                    innerBuilder += EnglishNumber.numberToEnglishMap[(unReversedSegment[1].toString()).toInt()] + " "
                    builder.add(innerBuilder)

                }
                else -> {
                    innerBuilder += EnglishNumber.numberToEnglishMap[(unReversedSegment[0].toString()).toInt()] + " "
                    builder.add(innerBuilder)
                }

            }

            innerBuilder = ""
            segment = ""
            count = 0
        }

    }

    return builder.reversed().joinToString(separator = "") { it }.trim()
}

private fun addTensPosition(segmentCount: Int) =
        when (segmentCount) {
            1 -> ""
            2 -> "thousand, "
            3 -> "million, "
            4 -> "billion, "
            else -> ""
        }

fun main(args: Array<String>) {
    println("Should print 'four': Actual: '${4.toEnglish()}'")
    println("Should print 'seventy four': Actual '${74.toEnglish()}'")
    println("Should print 'seven hundred thirty four': Actual: '${734.toEnglish()}'")
    println("Should print 'one thousand, two hundred thirty four': Actual: '${1234.toEnglish()}'")
    println("Should print 'Two Billion, One Hundred Forty Seven Million, " +
            "Four Hundred Eighty Three Thousand, Six Hundred Fourty Two" +
            "': Actual: ${2147483642.toEnglish()}")
}

