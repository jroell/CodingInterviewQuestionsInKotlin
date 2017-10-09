package ModerateDifficultQuestions

/**
 * Created by Jason on 7/16/17.
 */

// You have an integer matrix representing a plot of land, where the value at that location represents the height
// above sea level. A value of zero indicates water. A pond is a region of water connected vertically, horizontally,
// or diagonally. The size of the pond is the total number of connected water cells. Write a method to compute the
// sizes of all ponds in the matrix

fun computeSizesOfAllPonds(pond: Array<Array<Int>>): List<Pair<String, Int>> {

    return emptyList()
}

fun main(args: Array<String>) {
    val pond = arrayOf(arrayOf( 1,0,0,1,1,1,
                                1,1,1,1,0,0,
                                1,0,0,1,0,0,
                                1,0,0,0,1,1,
                                1,1,1,0,1,0,
                                1,1,0,1,1,0)

    println("Should print...: Actual: ${computeSizesOfAllPonds(pond)}")
}