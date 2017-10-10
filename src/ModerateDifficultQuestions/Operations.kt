package ModerateDifficultQuestions

/**
 * Created by Jason on 7/16/17.
 */

// Write methods to implement the multiply, subtract, and divide operations for integers. The results of all of these
// are integers. Use only the add operator.

internal object Operations {
    @JvmStatic
    fun main(args: Array<String>) {
        println(negate(10))
        println(subtract(10, 5))
        println(multiply(5, 6))
        println(divide(13, -3))
    }

    fun subtract(o1: Int, o2: Int): Int {
        return o1 + negate(o2)
    }

    fun multiply(o1: Int, o2: Int): Int {
        var a = abs(o1)
        val b = abs(o2)

        if (a > b) {
            return multiply(o2, o1)
        }

        if ((o1 < 0) xor (o2 < 0)) {
            a = negate(a)
        }

        var product = 0
        var i = b
        while (i > 0) {
            product += a
            i = subtract(i, 1)
        }

        return product
    }

    private fun divide(o1: Int, o2: Int): Int {
        if (o2 == 0) {
            throw java.lang.ArithmeticException("Division by Zero")
        }
        val abs1 = abs(o1)
        val abs2 = abs(o2)

        var count = 0
        var product = 0
        while (product + abs2 <= abs1) {
            count++
            product += abs2
        }

        return if (o1 < 0 && o2 < 0 || o1 > 0 && o2 > 0) {
            count
        } else {
            negate(count)
        }
    }

    private fun abs(num: Int): Int {
        return if (num < 0) {
            negate(num)
        } else num
    }

    private fun negate(num: Int): Int {
        var num = num
        var neg = 0
        val incrementOrDecrement = if (num < 0) 1 else -1
        while (num != 0) {
            num += incrementOrDecrement
            neg += incrementOrDecrement
        }
        return neg
    }

}