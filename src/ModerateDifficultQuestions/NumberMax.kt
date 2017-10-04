package ModerateDifficultQuestions

/**
 * Created by Jason on 7/16/17.
 */

// Write a method that finds the maximum of two numbers. You should not use if-else or any other comparison operator.

fun max(var1: Int, var2: Int): Int {
    val diff = var1 - var2
    // bit shift right the 'diff' variable by 31 (ints are 32 bits so this leaves the last bit.
    // AND it with 1 to ease all other bits)
    // this leaves us with the sign bit, which is 0 if positive and 1 if negative
    val sign = diff shr 31 and 0x1
    return var1 - sign * diff
}

fun main(args: Array<String>) {
    println("Should return 7: Actual: ${max(3,7)}")
}


//************ More Explanation **************************

// The idea is to check if the value of c is negative.
// In virtually all modern computers, numbers are stored
// in a format called two's complement in which the
// highest bit of the number is 0 if the number is positive
// and 1 if the number is negative. Moreover, most ints
// are 32 bits.  (c >> 31) shifts the number down 31 bits,
// leaving the highest bit of the number in the spot for
// the lowest bit. The next step of taking this number and
// ANDing it with 1 (whose binary representation is 0
// everywhere except the last bit) erases all the higher
// bits and just gives you the lowest bit. Since the lowest
// bit of  c >> 31 is the highest bit of c, this reads the
// highest bit of c as either 0 or 1. Since the highest bit
// is 1 if c is 1, this is a way of checking whether c is
// negative (1) or positive (0). Combining this reasoning
// with the above, k is 1 if a < b and is 0 otherwise.
//
// The final step is to do this:
//
// int max = a - k * c;
// If a < b, then k == 1 and k * c = c = a - b, and so
//
// a - k * c = a - (a - b) = a - a + b = b
// Which is the correct max, since a < b. Otherwise, if a >= b, then k == 0 and
//
// a - k * c = a - 0 = a
// Which is also the correct max.

