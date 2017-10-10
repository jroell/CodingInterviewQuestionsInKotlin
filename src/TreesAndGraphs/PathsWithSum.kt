package TreesAndGraphs

/**
 * Created by Jason on 7/14/17.
 */

// You are given a binary tree in which each node contains an integer value (which might be positive or negative).
// Design an algorithm to count the number of paths that sum to a given value. The path does not need to start or end
// at the root or a leaf, but it must go downwards (traveling only from parent nodes to child nodes).

fun countPathsThatAreEqualToSum(headTreeNode: TreeNode<Int>, sum: Int): Int {
    return 0
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

    println("Should print [some number]: ${countPathsThatAreEqualToSum(treeNode, 12)}")
}
