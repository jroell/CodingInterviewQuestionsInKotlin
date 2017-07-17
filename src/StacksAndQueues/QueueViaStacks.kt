package StacksAndQueues

import java.util.*

/**
 * Created by Jason 7/13/17.
 */

// Implement a MyQueue class which implements a queue using two stacks.

class MyQueue() {
    var stack1 = Stack<Int>()
    var stack2 = Stack<Int>()

    fun enqueue(input: Int) {
        while (stack2.isNotEmpty()){
            stack1.push(stack2.pop())
        }

        stack1.push(input)
    }

    fun dequeue(): Int {
        while (stack1.isNotEmpty()){
            stack2.push(stack1.pop())
        }

        return stack2.pop()
    }
}

fun main(args: Array<String>) {
    var queueFromStacks = MyQueue()
    queueFromStacks.enqueue(1)
    queueFromStacks.enqueue(2)
    queueFromStacks.enqueue(3)
    queueFromStacks.enqueue(4)
    queueFromStacks.enqueue(5)
    queueFromStacks.enqueue(6)

    println("Should print 1: ${queueFromStacks.dequeue()}")
}