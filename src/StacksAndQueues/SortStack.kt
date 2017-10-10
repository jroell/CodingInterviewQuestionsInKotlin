package StacksAndQueues

import java.util.*

/**
 * Created by Jason 7/13/17.
 */

// Write a program to sort a stack such that the smallest items are on the top. You can use an additional temporary
// stack, but you may not copy the elements into any other data structure (such as an array).

fun sort(input: Stack<Int>): Stack<Int> {
    return input
}

fun main(args: Array<String>) {
    var sortedStack = Stack<Int>()
    sortedStack.push(4)
    sortedStack.push(2)
    sortedStack.push(5)

    println("Should print 2 -> 4 -> 5: ${sort(sortedStack)}")
}