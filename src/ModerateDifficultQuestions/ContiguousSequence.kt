package ModerateDifficultQuestions

/**
 * Created by Jason on 7/16/17.
 */

// You are given an array of integers (both positive and negative). Find the contiguous sequence with the largest sum
// . Return the sum.

// Example:
// Input: 2, -8, 3, -2, 4, -10
// Output: 5 (i.e., {3, -2, 4})

fun findMaxSequence(input: List<Int>): Int {
    var localMax = 0
    var maxSoFar = 0
    for (number in input){
        localMax = Math.max(0, localMax + number)
        maxSoFar = Math.max(localMax, maxSoFar)
    }
    return maxSoFar
}

fun main(args: Array<String>) {
    var input = listOf(2, -8, 3, -2, 4, -10)
    println("should print 5: ${findMaxSequence(input)}")
}