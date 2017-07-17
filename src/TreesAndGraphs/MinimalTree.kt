package TreesAndGraphs

/**
 * Created by Jason 7/14/17.
 */

// Given a sorted (increasing order) array with unique integer elements, write an algorithm to create a binary
// search tree with minimal height.

class TreeNode<T>(var data: T? = null) {
    var left = TreeNode<T>()
    var right = TreeNode<T>()
}

fun createBstMinimalHeight(input: Array<Int>): TreeNode<Int> {
    var headTreeNode = TreeNode<Int>()
    return headTreeNode
}

fun main(args: Array<String>) {
    var sortedArray = arrayOf(4,3,5,2,7,6,9,8).sortedArray()
    println("Should print minimum BST: ${createBstMinimalHeight(sortedArray)}")
}



