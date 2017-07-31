package ArraysAndStrings

/**
 * Created by Jason 7/10/17.
 */

// Given an image represented by an NxN matrix, where each pixel in teh image is 4 bytes, write a method to rotate
// the image by 90 degrees. Can you do this in place?

fun rotateMatrix(input: Array<IntArray>): Array<IntArray> {

    return input
}

fun Array<IntArray>.prettyPrint(){
    this.forEach {
        it.forEach {
            print("$it|")
        }
        println()
    }
}

fun main(args: Array<String>) {
    var matrix = arrayOf<IntArray>(arrayOf(1, 2, 3, 4).toIntArray(),
                                   arrayOf(1, 2, 3, 4).toIntArray(),
                                   arrayOf(1, 2, 3, 4).toIntArray(),
                                   arrayOf(1, 2, 3, 4).toIntArray())
    matrix.prettyPrint()
}