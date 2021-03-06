package LinkedLists

/**
 * Created by Jason 7/12/17.
 */

// Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node, not necessarily
// the exact middle) of a singly linked list, given only access to that node.

// EXAMPLE
// Input: the node c from the linked list a -> b -> c -> d -> e -> f

fun <T> DeleteMiddleNode(input: Node<T>): Node<T> {
    // ave a runner that moves 2 spaces everytime the index moves 1
    // when runner gets to the end of the linked list then index will be at the middle element
    var runner = input
    var slow = input
    var prev = input
    var count = 0
    while (runner.next != null){
        runner = runner.next!!
        if(count % 2 != 0){
            prev = slow
            slow = slow.next!!
        }
    }

    prev.next = slow.next

    return input
}

fun main(args: Array<String>) {
    val testNode = Node(1)
    testNode.next = Node(2)
    testNode.next?.next = Node(3)
    testNode.next?.next?.next = Node(4)
    testNode.next?.next?.next?.next = Node(5)

    println("Should print 1,2,4,5 (3 should be removed): ${DeleteMiddleNode(testNode)}")
}