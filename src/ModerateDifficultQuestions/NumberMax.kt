package ModerateDifficultQuestions

/**
 * Created by Jason on 7/16/17.
 */

// Write a method that finds the maximum of two numbers. You should not use if-else or any other comparison operator.

fun max(input1: Int, input2:Int) = Math.max(input1, input2)

fun main(args: Array<String>) {
    println("Should return 3: Actual: ${max(3,1)}")
}