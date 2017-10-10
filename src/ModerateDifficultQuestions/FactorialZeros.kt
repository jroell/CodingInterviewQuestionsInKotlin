package ModerateDifficultQuestions

/**
 * Created by Jason on 7/16/17.
 */

// Write an algorithm which computes the number of trailing zeros in n factorial

internal object FactorialZeros {
    private fun factorsOf5(i: Int): Int {
        var input = i
        var count = 0
        while (input % 5 == 0) {
            ++count
            input /= 5
        }
        return count
    }

    private fun countFactZeros1(num: Int): Int {
        return (2..num).sumBy { factorsOf5(it) }
    }

    private fun countFactZeros2(num: Int): Int {
        var count = 0
        if (num < 0) {
            return -1
        }
        var i = 5
        while (num / i > 0) {
            count += num / i
            i *= 5
        }
        return count
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val num = 100
        println(countFactZeros1(num))
        println(countFactZeros2(num))
    }
}