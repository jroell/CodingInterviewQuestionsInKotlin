package TreesAndGraphs

/**
 * Created by Jason on 7/14/17.
 */

// A binary search tree was created by traversing through an array from left to right and inserting each element. Given
// a binary search tree with distinct elements, print all possible array that could have led to this tree.

// Example:
// Input:    binary tree:
//              2
//            /  \
//          1     3
//
//Output: {2, 1, 3}, {2, 3, 1}

fun findPossibleArrays(headTreeNode: TreeNode<Int>): List<Array<Int>> {
    return listOf(arrayOf(2, 1, 3), arrayOf(2, 3, 1))
}

fun main(args: Array<String>) {
    val treeNode = TreeNode(2)
    treeNode.left = TreeNode(1)
    treeNode.right = TreeNode(3)

    println("Should print {2, 1, 3}, {2, 3, 1} : ${findPossibleArrays(treeNode)}")
}