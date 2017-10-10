package TreesAndGraphs

/**
 * Created by Jason on 7/14/17.
 */

// Implement a function to check if a binary tree is a binary search tree.

fun isBST(headTreeNode: TreeNode<Int>): Boolean{
    return false
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

    println("Should print false: ${createLinkedListsFromTreeLevels(treeNode)}")
    println("Should print true: ${createLinkedListsFromTreeLevels(treeNode)}")
}