package ArraysAndStrings

/**
 * Created by Jason 7/10/17.
 */

// Write a method to replace all spaces in a string with '%20'. You may assume that the string has sufficient space
// at the end to hold the additional characters, you are given the "true" length of the string. (Note: If
// implementing in Java, please use a character array so that you can perform this operation in place.)

fun URLify(input: String, realLength: Int): String {
//    val spaceCount = 0
//    val i = 0
//
//    for (letter in input){
//        if (letter == ' '){
//            continue
//        }
//    }
//
//    var index = realLength + spaceCount * 2
//    if (realLength < input.length) {
//        input[realLength] = '\0'
//    }
//
//    for ()
    return input
}

fun main(args: Array<String>) {
    val input = "Mr John Smith    "
    val realLength = 13
    println("Should print Mr%20John%20Smith: ${URLify(input, realLength)}")
}

