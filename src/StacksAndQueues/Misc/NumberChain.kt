package StacksAndQueues.Misc

import java.util.Collections.*

/**
 * Created by Jason on 7/28/17.
 */

// You start with the integers from one to 100, inclusive, and you want to organize them into a chain. The only rules
// for building this chain are that you can only use each number once and that each number must be adjacent in the chain to one of its factors or multiples. For example, you might build the chain:
//
// 4, 12, 24, 6, 60, 30, 10, 100, 25, 5, 1, 97
//
// You have no numbers left to place after 97, leaving you with a finished chain of length 12.
//
// What is the longest chain you can build?
//
// Extra credit: What if you started with more numbers, e.g., one through 1,000?

fun longestNumberChainBetween(range: Int): MutableList<Int> {
    var currentChain = mutableListOf<Int>()
    var longestChain = mutableListOf<Int>()
    var numbers = (1..100).toMutableList()
    var factorsTable = mutableListOf<Pair<Int, MutableList<Int>>>()
    // use numbers with fewest factors first in order to have more so that when that factor is used other numbers
    // will still have factors
    // generate a table that has the factors of numbers from 100 downto 1
    for (x in 100 downTo 1) {
        val factors: MutableList<Int> = findFactorsFor(x)
        factorsTable.add(Pair(x, factors))
    }

    val sortedNumbersByFactors = factorsTable.sortedBy { it.second.size }.toMutableList()
    for (x in sortedNumbersByFactors) {
        // add number to chain
        currentChain.add(x.first)
        // remove number that is used
        var clone = mutableListOf<Pair<Int, MutableList<Int>>>()
        copy(sortedNumbersByFactors, clone)
        val factorToAdd = x.second.first()
        x.second.remove(factorToAdd)
        currentChain.add(factorToAdd)
        clone = clone.filter { it.second.size != 0 }.sortedBy { it.second.size }.toMutableList()
        while (clone.isNotEmpty()) {
            var numberWithLowestFactors = clone.first()
            currentChain.add(numberWithLowestFactors.first)
        }
    }
    return longestChain
}


// go through each number and try to start a chain, go as far as you can and then use the next available number,
// repeat until end,
// next start with the next number
// repeat until all numbers have been used first

fun findFactorsFor(x: Int): MutableList<Int> = (1..x / 2).filter { x % it == 0 }.toMutableList()

fun main(args: Array<String>) {
    val longestChainOfNumbers = longestNumberChainBetween(100)
    longestChainOfNumbers.forEach { println(it) }
}
