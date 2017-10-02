package ModerateDifficultQuestions

/**
 * Created by Jason on 7/16/17.
 */

// Write an algorithm which computes the number of trailing zeros in n factorial

fun numberOfZerosInFactorial(): Int {
 return 1
}

fun basicFactorial(input: Int): Long {
    if (input == 1) return 1

    return basicFactorial(input -1) * input
}

fun main(args: Array<String>) {
    println("Should return 120: Actual: ${basicFactorial(5)}")
}