package LinkedLists

/**
 * Created by Jason 7/13/17.
 */

// Given a circular linked ist, implement an algorithm that return the node at the beginning of the loop.

// Definition
// Circular linked  list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to
// make a loop in the linked list.

// Example:
// Input: a -> b -> c -> d ->  e -> c [the same c as earlier]
// Output: c

fun <T> returnLoopPoint(input: Node<T>): T? {
    var loopNode: T? = null
    return loopNode
}

fun main(args: Array<String>) {
    val testNode = Node("M")
    testNode.next = Node("o")
    testNode.next?.next = Node("t")
    testNode.next?.next?.next = Node("t")
    testNode.next?.next?.next?.next = Node("o")
    testNode.next?.next?.next?.next?.next = Node("m")

    println("Should print [placeholder for loop node]: ${returnLoopPoint(testNode)}" )
}