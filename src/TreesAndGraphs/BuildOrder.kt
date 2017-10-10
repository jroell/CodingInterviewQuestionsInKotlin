package TreesAndGraphs

/**
 * Created by Jason on 7/14/17.
 */

// You are given a list of projects and a list of dependencies ( which is a list of pairs of projects, where the
// second project is dependent on the first project). All of a project's dependencies must be built before the
// project is. Find a build order that will allow the projects to be built. If there is no valid build order, return
// an error.

// Example:
// Input:
//      projects: a, b, c, d, e, f
//      dependencies: (a, d), (f,b), (b, d), (f, a), (d, c)
// Output: f, e, a, b, d, c

fun returnBuildOrder(projects: List<String>, dependencies: List<Pair<String, String>>): List<String> {
    return listOf()
}

fun main(args: Array<String>) {
    val projects = listOf("a", "b", "c", "d", "e", "f")
    val dependencies = listOf(Pair("a", "d"), Pair("f", "b"), Pair("b", "d"), Pair("f", "a"), Pair("d", "c"))

    println("Should print f, e, a, b, d, c: ${returnBuildOrder(projects, dependencies)}")
}