package ArraysAndStrings

/**
 * Created by Jason 7/10/17.
 */

// Implement a method to perform basic string compression using the counts of repeated characters. For example, the
// string aabcccccaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original
// string, your method should return the original string. You can assume the string has only uppercase and lowercase
// letters (a-z).

fun compressString(input: String): String {
    // go through and check if prev == current
    // if true add to count
    // if false and count is greater than 1, append count plus char to builder
    // once iterator reaches end check do appropriate append
    var count = 1
    var prev = input.first()
    var builder = ""
    for ((i, letter) in input.withIndex()) {
        if (i == 0) continue
        when (letter) {
            prev -> {
                count += 1
                builder = checkEnd(i, input, builder, count, letter)
            }
            else -> {
                builder = build(builder, count, prev)
                prev = letter
                count = 1
                builder = checkEnd(i, input, builder, count, letter)
            }
        }
    }

    return builder
}

private fun checkEnd(i: Int, input: String, builder: String, count: Int, letter: Char): String {
    var builder1 = builder
    if (i == input.lastIndex) {
        builder1 = build(builder1, count, letter)
    }
    return builder1
}

private fun build(builder: String, count: Int, prev: Char): String {
    var builder1 = builder
    builder1 += if (count > 1) {
        "$count$prev"
    } else {
        "$prev"
    }
    return builder1
}

fun main(args: Array<String>) {
    val test1 = "aabcccccaa"
    val test2 = "abaabbbcdddeffg"
    val test3 = "abcdefgh"

    println("Should print 2ab5c2a. Actual:${compressString(test1)}")
    println("Should print ab2a3bc3de2fg. Actual:${compressString(test2)}")
    println("Should print abcdefgh. Actual:${compressString(test3)}")
}