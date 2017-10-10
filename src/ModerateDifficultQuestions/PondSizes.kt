package ModerateDifficultQuestions

/**
 * Created by Jason on 7/16/17.
 */

// You have an integer matrix representing a plot of land, where the value at that location represents the height
// above sea level. A value of zero indicates water. A pond is a region of water connected vertically, horizontally,
// or diagonally. The size of the pond is the total number of connected water cells. Write a method to compute the
// sizes of all ponds in the matrix

    val ponds = arrayListOf<Pond>()
    val pondNodes = arrayListOf<PondNode>()
    var pondCounter = 0

    fun computeSizesOfAllPonds(pond: List<List<Int>>): List<Pond> {
        // go box by box checking to see if any neibors are a pond (1). If they are then
        // add them to a queue. Once you check all neighbors then start checking the nodes in the
        // queue. Repeat the process of adding to the queue with these neigbors.
        // Mark all nodes as visited and apart of the same pond.


        return emptyList()
    }


    fun getNeighborsThatHavePond(pond: List<List<Int>>, location: Pair<Int, Int>, currentPondId: Int = 0): List<Pair<Int, Int>> {

        val pondId = if (currentPondId == 0) pondCounter + 1 else currentPondId
        val (x, y) = location
        val potentialPondNode = pond.getOrNull(x - 1)?.getOrNull(y + 1)
        if (potentialPondNode == 1) {
            createOrIgnorePondNode(x - 1, y + 1, pondId)
        }
        return listOf<Pair<Int, Int>>()
    }

    private fun createOrIgnorePondNode(x: Int, y: Int, pondId: Int) {
        if (pondNodes.any { it.location == Pair(x, y) }) return

        pondNodes.add(PondNode(pondId, true, Pair(x, y)))
        if (ponds.any { it.pondId == pondId }){
            val pond = ponds.first { it.pondId == pondId }
            pond.size += 1
        }
        else {
//            val pond = Pond(pondId, 1).pondNodes.add(PondNode(x,y))

        }
    }

    data class PondNode(val pondId: Int = 0, val visited: Boolean = false, val location: Pair<Int, Int>)

    data class Pond(val pondId: Int, var size: Int) {
        val pondNodes = arrayListOf<PondNode>()
    }

fun main(args: Array<String>) {
    val pond = listOf(listOf(1, 0, 0, 1, 1, 1,
            1, 1, 1, 1, 0, 0,
            1, 0, 0, 1, 0, 0,
            1, 0, 0, 0, 1, 1,
            1, 1, 1, 0, 1, 0,
            1, 1, 0, 1, 1, 0))

    println("Should print...: Actual: ${computeSizesOfAllPonds(pond)}")
}
