package ArraysAndStrings

/**
 * Created by Jason 7/10/17.
 */

// given an image represented by an NxN matrix, where each pixel in the image is 4 bytes, write a method to rotate
// the image by 90 degrees. Can you do this in place?

fun rotateMatrix(input: Array<IntArray>): Array<IntArray> {
		// what does it mean for a position to be rotated?
		val n = input.size
		var tmp: Int
		for (i in 0 until n / 2) {
				for (j in i until n - i - 1) {
						tmp = input[i][j] // store value
						input[i][j] = input[j][n - i - 1] // overwrite value
						input[j][n - i - 1] = input[n - i - 1][n - j - 1] // repeat
						input[n - i - 1][n - j - 1] = input[n - j - 1][i]
						input[n - j - 1][i] = tmp
				}
		}
		return input
}

fun Array<IntArray>.prettyPrint() {
		this.forEach {
				it.forEach {
						print("$it|")
				}
				println()
		}
}

fun main(args: Array<String>) {
		var matrix = arrayOf(arrayOf(1, 2, 3, 4).toIntArray(),
												 arrayOf(1, 2, 3, 4).toIntArray(),
												 arrayOf(1, 2, 3, 4).toIntArray(),
												 arrayOf(1, 2, 3, 4).toIntArray())
		matrix = rotateMatrix(matrix)
		matrix.prettyPrint()
}