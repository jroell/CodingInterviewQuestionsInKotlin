package ModerateDifficultQuestions

/**
 * Created by Jason on 7/16/17.
 */

// Design an algorithm to find all pairs of integers within an array which sum to a specified value.

fun findPairsWithSum(arr: Array<Int>, sum: Int): List<Pair<Int, Int>> {

    // is there another number that I can add to that equals the sum
    // we know that if we have a set made up of the difference between our number and the sum
    // then we know all the numbers we are looking for
    // we should then iterate the original array and ask if 'it' is in that set

    val setOfPossibleAdds: Set<Int> = createSetOfDifferenceBetweenKandIt(arr, sum)
    return arr.filter { setOfPossibleAdds.contains(it) }.map { Pair(it, sum - it) }
}

private fun createSetOfDifferenceBetweenKandIt(arr: Array<Int>, sum: Int): Set<Int> {
    return arr.map { sum - it }.toHashSet()
}

fun main(args: Array<String>) {
    val sumTarget = 8
    val arr = arrayOf(1,2,4,9,7,6,8)
    println("Should print [(1, 7), (2, 6), (4, 4), (7, 1), (6, 2)]: Actual: ${findPairsWithSum(arr, sumTarget)}")
}
