package ModerateDifficultQuestions

/**
 * Created by Jason on 7/16/17.
 */

// Write a function to swap a number in place (that is, without temporary variables).

fun swapNumbersWithBitManipulation(x: Int, y: Int): Int {
    var x = x
    var y = y
    x = x xor y
    y = x xor y
    x = x xor y
    return x
}

fun swapNumbers(x: Int, y: Int): Int {
    var x = x
    var y = y
    x = y - x 
    y -= x
    x += y
    return x
}

fun main(args: Array<String>) {
    println("Should print 43, 73: Actual: ${swapNumbers(73, 43)}")
}