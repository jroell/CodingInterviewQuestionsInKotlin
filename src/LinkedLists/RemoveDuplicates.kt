package LinkedLists

/**
 * Created by Jason 7/12/17.
 */

// Write code to remove duplicates from an unsorted linked list.

// FOLLOW UP
// How would you solve this problem if a temporary buffer is not allowed?

class Node<T>(val data: T) {
    var next: Node<T>? = null

    override fun toString(): String {
        return prettyPrint()
    }

    private fun prettyPrint(): String {
        if (next == null) {
            return "$data"
        } else {
            return "$data -> ${next?.prettyPrint()}"
        }
    }

    fun removeDuplicates(): Node<T>{

        return this
    }

    fun removeDuplicatesWithOutTempBuffer(): Node<T> {

        return this
    }
}



fun main(args: Array<String>) {
    val testNode = Node(1)
    testNode.next = Node(2)
    testNode.next?.next = Node(2)
    testNode.next?.next?.next = Node(4)
    testNode.next?.next?.next?.next = Node(5)

    println("Should print 1,2,4,5 (second 2 should be removed): ${testNode.removeDuplicates()}")
    println("Should print 1,2,4,5 (second 2 should be removed): ${testNode.removeDuplicatesWithOutTempBuffer()}")
}