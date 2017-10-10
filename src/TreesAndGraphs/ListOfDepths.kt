package TreesAndGraphs

import java.util.*

/**
 * Created by Jason 7/14/17.
 */

// Given a binary tree, design an algorithm which creates a linked list of all the nodes at each depth (e.g., if
// you, have a tree with depth D, you'll have D linked lists).

fun createLinkedListsFromTreeLevels(TreeHead: TreeNode<Int>): List<LinkedList<Int>> {
    val listOfLinkedLists = mutableListOf<LinkedList<Int>>()
    return listOfLinkedLists
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

    println("Should print 5 linked lists: ${createLinkedListsFromTreeLevels(treeNode)}")
}