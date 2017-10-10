package TreesAndGraphs

/**
 * Created by Jason on 7/14/17.
 */

// Design an algorithm and write code to find the first common ancestor of two nodes in a binary tree. Avoid storing
// additional nodes in a data structure. NOTE: This is not necessarily a binary search tree.

fun findFirstCommonAncestor(headTreeNode: TreeNode<String>, childNodeData1: String, childNodeData2: String): String {
    return ""
}

fun main(args: Array<String>) {
    val treeNode = TreeNode("Joe")
    treeNode.left = TreeNode("Jackie")
    treeNode.left.left = TreeNode("Allison")
    treeNode.left.left.left = TreeNode("Rob")
    treeNode.left.left.left.left = TreeNode("Susan")
    treeNode.left.right = TreeNode("Cindy")
    treeNode.left.right.right = TreeNode("Amanda")
    treeNode.left.right.right.right = TreeNode("Dan")

    treeNode.right = TreeNode("Scott")
    treeNode.right.right = TreeNode("Justin")
    treeNode.right.right.right = TreeNode("Linda")
    treeNode.right.right.right.right = TreeNode("Carol")

    treeNode.right = TreeNode("Sara")
    treeNode.right.left = TreeNode("Dustin")
    treeNode.right.left.left = TreeNode("Dominic")
    treeNode.right.left.left.left = TreeNode("Mark")

    println("Should print some name: ${findFirstCommonAncestor(treeNode, "Cindy", "Mark")}")
}