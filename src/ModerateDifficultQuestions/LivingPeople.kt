package ModerateDifficultQuestions

/**
 * Created by Jason on 7/16/17.
 */

// Given a list of people with their birth and death years, implement a method to compute the year with the most
// number of people alive. You may assume that all people were born between 1900 and 2000 (inclusive). If a person
// was alive during any portion of that year, they should be included in that year's count. For example, Person
// (birth = 1908, death = 1909) is included in the counts for both 1908 and 1909.

fun computeMostAlive(birthYears: List<Int>, deathYears: List<Int>): Int {
    val events = (birthYears.map { Pair(it, "born") } +
            deathYears.map { Pair(it, "death") }).sortedBy { it.first }

    var count = 0
    var max = 0

    events.forEach {
        when (it.second) {
            "born" -> count += 1
            "death" -> count -= 1
        }
        if (count > max) max = count
    }

    return max
}

fun main(args: Array<String>) {
    val birthYears = listOf(1900, 1901, 1920, 1940, 1950)
    val deathYears = listOf(1908, 2000, 1929, 1959, 1985)
    println("Should print 3: Actual: ${computeMostAlive(birthYears, deathYears)}")
}