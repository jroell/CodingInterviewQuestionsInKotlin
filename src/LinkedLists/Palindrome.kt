package LinkedLists

/**
 * Created by Jason 7/13/17.
 */

// Implement a function to check if if a linked list is a palindrome

fun <T> isPalindrome(input: Node<T>): Boolean {

    return false
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

    println("Should print true : ${isPalindrome(testNode)}")
    println("Should print false : ${isPalindrome(testNode2)}")
}