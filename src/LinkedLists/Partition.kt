package LinkedLists

/**
 * Created by Jason 7/12/17.
 */

// Write code to partition a linked list around a value x, such that all nodes less than x come before all nodes
// greater than or equal to x. If x is contained within the list, the values of x only need to be after the elements
// less than x >see below). The partition element x can appear anywhere in the "right partition"; it does not need
// to appear between the left and right partitions.

// Example:
// Input: 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [partition = 5]
// Output: 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8

fun <T> partition(input: Node<T>): Node<T> {

    return input
}

fun main(args: Array<String>) {
    val testNode = Node(3)
    testNode.next = Node(5)
    testNode.next?.next = Node(8)
    testNode.next?.next?.next = Node(5)
    testNode.next?.next?.next?.next = Node(10)
    testNode.next?.next?.next?.next?.next = Node(2)
    testNode.next?.next?.next?.next?.next?.next = Node(1)

    println("Should print 3 -> 1 -> 2 -> 10 -> 5 -> 5 -> 8 : ${partition(testNode)}")
}