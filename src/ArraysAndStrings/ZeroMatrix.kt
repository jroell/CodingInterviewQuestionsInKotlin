package ArraysAndStrings

/**
 * Created by Jason 7/10/17.
 */

// Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.

fun zeroOutMatrix(input: Array<Array<Int>>): Array<Array<Int>> {
    var rowsWithZero = mutableSetOf<Int>()
    var columnsWithZero = mutableSetOf<Int>()
    for ((i, row) in input.withIndex()){
        for ((j, column) in row.withIndex()){
            if (column == 0){
                rowsWithZero.add(i)
                columnsWithZero.add(j)
            }
        }
    }

    var fullSet = rowsWithZero + columnsWithZero
    for ((i, row) in input.withIndex()){

        for ((j, column) in row.withIndex()){
            if (fullSet.contains(i) || fullSet.contains(j)){

            }
        }
    }

    return input
}

fun Array<Array<Int>>.prettyPrint(){
    for (cells in this) {
        for (cell in cells) {
            print(cell.toString() + "|")
        }
        println("")
    }
}

fun main(args: Array<String>) {
    var matrix = arrayOf(arrayOf(1,3,4,4), arrayOf(1,4,4,0), arrayOf(0, 1,3,4), arrayOf(1,3,4,5))
    println("Should print zero'd out matrix: ${matrix.prettyPrint()}")
    println("Should print zero'd out matrix: ${zeroOutMatrix(matrix).prettyPrint()}")
}