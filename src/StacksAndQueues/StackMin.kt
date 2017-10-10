package StacksAndQueues

import java.util.*

/**
 * Created by Jason 7/13/17.
 */

// Implement a stack which, in addition to enqueue and poop, has a function min which returns the minimum element. Push,
// dequeue, and min should all operate in O(1) time.

class StackMin() : Stack<Int>() {
    var head: Int? = null
    var minStack: Stack<Int> = Stack() // add to this when new value is lower than top value

    fun min(): Int {
        return minStack.pop()
    }

    override fun push(input: Int): Int {
        if (minStack.empty() || input < minStack.pop()) {
            minStack.push(input)
            super.push(input)
        } else {
            super.push(input)
        }

        return input
    }

    override fun pop(): Int {
        if (super.peek() == minStack.peek()){
            minStack.pop()
        }

        return super.pop()
    }
}

fun main(args: Array<String>) {
    var minStack = StackMin()
    minStack.push(4)
    minStack.push(2)
    minStack.push(5)

    println("Should print 2: ${minStack.min()}")
}