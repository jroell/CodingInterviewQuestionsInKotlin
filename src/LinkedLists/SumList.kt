package LinkedLists

/**
 * Created by Jason 7/12/17.
 */

// You have two numbers represented by a linked list, where each node contains a single digit. The digits are stored
// in reverse order, such that the 1's digit is at the head of the list. Write a function that adds the two numbers
// and returns the sum as a linked list.

// Example:
// Input: (7 -> 1 -> 6) + (5 -> 9 -> 2). That is, 617 + 295.
// Output: 2 -> 1 -> 9. That is, 912.

// Follow Up:
// Suppose the digits are stored in forward order. Repeat the above problem.

// Example:
// Input: (6 -> 1 -> 7) + (2 -> 9 -> 5). That is, 617 + 295.
// Output: 9 -> 1 -> 2. That is, 912.

fun <T> sumList(input: Node<T>, input2: Node<T>): Node<T> {

    return input
}

fun main(args: Array<String>) {
    val testNode = Node(7)
    testNode.next = Node(1)
    testNode.next?.next = Node(6)

    val testNode2 = Node(5)
    testNode2.next = Node(9)
    testNode2.next?.next = Node(2)

    val testNode3 = Node(7)
    testNode3.next = Node(1)
    testNode3.next?.next = Node(6)

    val testNode4 = Node(5)
    testNode4.next = Node(9)
    testNode4.next?.next = Node(2)

    println("Should print 2 -> 1 -> 9. That is, 912. : ${sumList(testNode, testNode2 )}")
    println("Should print 9 -> 1 -> 2. That is, 912. : ${sumList(testNode3, testNode4)}")
}