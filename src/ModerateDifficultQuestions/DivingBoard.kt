package ModerateDifficultQuestions

/**
 * Created by Jason on 7/16/17.
 */

// You are building a diving board by placing a bunch of planks of wood end-to-end. There are two types of planks,
// one of length "shorter" and one of length "longer". You must use exactly K planks of wood. Write a method to
// generate all possible lengths for the diving board.

fun buildDivingBoards(shorterPlank: Plank, longerPlank: Plank, numberOfBoards: Int): List<Board> {
    val planks = MutableList(numberOfBoards, { Plank(shorterPlank.length) })
    val listOfBoardSizes = arrayListOf<Board>()
    listOfBoardSizes.add(Board(planks.sumBy { it.length }))
    for(i in 0 until numberOfBoards){
        planks[i] = Plank(longerPlank.length)
        listOfBoardSizes.add(Board(planks.sumBy { it.length }))
    }
    return listOfBoardSizes
}

data class Plank(val length: Int)

data class Board(val length: Int)

fun main(args: Array<String>) {
    val amountOfPlanks = 10
    val lengthsOfDivingBoard = buildDivingBoards(Plank(5),Plank(10), amountOfPlanks)
    println("Should print 50, 55, 60...100")
    lengthsOfDivingBoard.forEach { println(it) }
}