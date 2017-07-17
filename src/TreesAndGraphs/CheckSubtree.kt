package TreesAndGraphs

/**
 * Created by Jason on 7/14/17.
 */

// T1 and T2 are two very large binary trees, with T1 much bigger than T2. Create an algorithm to determine if T2 is a
// subtree of T1.
// A tree T2 is a subtree of T1 if there exists a node n in T! such that the subtree of n is identical to T2. That
// is, if you cut off the tree at node n, the two trees would be identical.

fun isSubtree(T1: TreeNode<Int>, T2: TreeNode<Int>): Boolean {
    return false
}

fun main(args: Array<String>) {
    val treeNode = TreeNode(1)
    treeNode.left = TreeNode(1)
    treeNode.left.left = TreeNode(1)
    treeNode.left.left.left = TreeNode(1)
    treeNode.left.left.left.left = TreeNode(1)

    treeNode.right = TreeNode(1)
    treeNode.right.right = TreeNode(1)
    treeNode.right.right.right = TreeNode(1)
    treeNode.right.right.right.right = TreeNode(1)

    val treeNode2 = TreeNode(1)
    treeNode2.left = TreeNode(1)
    treeNode2.left.left = TreeNode(1)
    treeNode2.left.left.left = TreeNode(1)
    treeNode2.left.left.left.left = TreeNode(1)

    treeNode2.right = TreeNode(1)
    treeNode2.right.right = TreeNode(1)
    treeNode2.right.right.right = TreeNode(1)
    treeNode2.right.right.right.right = TreeNode(1)

    println("Should print true: ${isSubtree(treeNode, treeNode2)}")
    println("Should print false: ${isSubtree(treeNode, treeNode2)}")
}