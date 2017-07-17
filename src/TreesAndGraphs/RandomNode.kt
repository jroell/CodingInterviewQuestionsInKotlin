package TreesAndGraphs

/**
 * Created by Jason on 7/14/17.
 */

// You are implementing a binary tree class from scratch which, in addition to insert, find and delete, has a method
// getRandomNode() which returns a random node from the tree. All nodes should be equally likely to be chosen. Design
// and implement an algorithm for get RandomNode.

fun <T> TreeNode<T>.getRandomNode(): TreeNode<T> {
    return this
}

fun main(args: Array<String>) {
    val treeNode = TreeNode(1)
    treeNode.left = TreeNode(1)
    treeNode.left.left = TreeNode(1)
    treeNode.left.left.left = TreeNode(1)
    treeNode.left.left.left.left = TreeNode(1)

    treeNode.left = TreeNode(1)
    treeNode.left.right = TreeNode(1)
    treeNode.left.right.right = TreeNode(1)
    treeNode.left.right.right.right = TreeNode(1)

    treeNode.right = TreeNode(1)
    treeNode.right.right = TreeNode(1)
    treeNode.right.right.right = TreeNode(1)
    treeNode.right.right.right.right = TreeNode(1)

    treeNode.right = TreeNode(1)
    treeNode.right.left = TreeNode(1)
    treeNode.right.left.left = TreeNode(1)
    treeNode.right.left.left.left = TreeNode(1)

    // print multiple times to see if indeed a random node is being chosen
    println("Should print a random node from tree: ${treeNode.getRandomNode()}")
    println("Should print a random node from tree: ${treeNode.getRandomNode()}")
    println("Should print a random node from tree: ${treeNode.getRandomNode()}")
    println("Should print a random node from tree: ${treeNode.getRandomNode()}")
    println("Should print a random node from tree: ${treeNode.getRandomNode()}")
}