package LinkedLists

import org.testng.annotations.Test
import java.util.*

/**
 * Created by Jason 7/12/17.
 */

// Implement an algorithm to find the kth to last element of a singly linked  list.

fun <T> returnKthToLast(input: Node<T>, kthToLast: Int): T {

    return input.data
}

fun main(args: Array<String>) {
    val testNode = Node(1)
    testNode.next = Node(2)
    testNode.next?.next = Node(2)
    testNode.next?.next?.next = Node(4)
    testNode.next?.next?.next?.next = Node(5)

    println("Should print 4 when 2 is input (4 is second last item): ${returnKthToLast(testNode, 2)}")
}

