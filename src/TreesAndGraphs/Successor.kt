package TreesAndGraphs

/**
 * Created by Jason on 7/14/17.
 */

// Write an algorithm to find the "next" node (i.e., in-order successor) of a given node in a binary search tree. You
// may assume that each node has a link to its parent

fun returnSuccessor(headTreeNode: TreeNode<Int>): Int {
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

    println("Should print 4: ${createLinkedListsFromTreeLevels(treeNode)}")
    println("Should print 5: ${createLinkedListsFromTreeLevels(treeNode)}")
}