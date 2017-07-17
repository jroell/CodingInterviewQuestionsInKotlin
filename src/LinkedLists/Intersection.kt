package LinkedLists

/**
 * Created by Jason 7/13/17.
 */

// Given two singly linked lists, determine if the two lists intersect. Return the intersection node. Note that the
// intersection is defined based on reference, not value. That is, if the kth node of the first linked list is the
// exact same node (by reference) as the jth node of hte second linked list, then they are intersecting.

fun <T> returnIntersection(input1: Node<T>, input2: Node<T>): T {

    return input1.data
}

fun main(args: Array<String>) {
    val testNode = Node("M")
    testNode.next = Node("o")
    testNode.next?.next = Node("t")
    testNode.next?.next?.next = Node("t")
    testNode.next?.next?.next?.next = Node("o")
    testNode.next?.next?.next?.next?.next = Node("m")

    val testNode2 = Node("j")
    testNode2.next = Node("o")
    testNode2.next?.next = Node("t")
    testNode2.next?.next?.next = Node("t")
    testNode2.next?.next?.next?.next = Node("o")
    testNode.next?.next?.next?.next?.next = Node("m")

    println("Should print the intersection of the lists ('o'): ${returnIntersection(testNode, testNode2)}")
}