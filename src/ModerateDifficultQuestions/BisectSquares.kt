package ModerateDifficultQuestions

/**
 * Created by Jason on 7/16/17.
 */

// Given two squares on a two-dimensional plane, find a line that would cut these two squares in half. Assume that
// the top and the bottom sides of the square run parallel to the x-axis.

internal class MyPoint(var x: Double, var y: Double) : Any() {

    override fun toString(): String {
        return "($x, $y)"
    }

    fun getSlope(other: MyPoint): Double {
        return (other.y - this.y) / (other.x - this.x)
    }
}

internal class Square(bottomLeft: MyPoint, width: Double) : Any() {
    var points = arrayListOf<MyPoint>()

    val center: MyPoint
        get() {
            val x = (points[3].x + points[0].x) / 2
            val y = (points[1].y + points[0].y) / 2
            return MyPoint(x, y)
        }

    init {
        points.add(MyPoint(bottomLeft.x, bottomLeft.y))// bottom left
        points.add(MyPoint(bottomLeft.x, bottomLeft.y + width)) // top left
        points.add(MyPoint(bottomLeft.x + width, bottomLeft.y + width)) // top right
        points.add(MyPoint(bottomLeft.x + width, bottomLeft.y))         // bottom right
    }

    override fun toString(): String {
        return "[" + points[0] + ", " + points[1] + ", " + points[2] + ", " + points[3] + "]"
    }
}

internal object BisectSquares {
    private fun getCuttingLine(square1: Square, square2: Square): Array<MyPoint?> {
        val line = arrayOfNulls<MyPoint>(2)
        val center1 = square1.center
        val center2 = square2.center
        val slope = center1.getSlope(center2)

        //		System.out.println("Slope:" + slope);
        val b = center1.y - slope * center1.x
        //		System.out.println("Line: y = " + slope + "x + " + b);

        val left = Math.min(square1.points[0].x, square2.points[0].x)
        val right = Math.max(square1.points[0].x, square2.points[0].x)

        line[0] = MyPoint(left, getY(left, slope, b))
        line[1] = MyPoint(right, getY(right, slope, b))

        return line
    }

    fun getY(x: Double, slope: Double, b: Double): Double {
        return slope * x + b
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val square1 = Square(MyPoint(10.0, 10.0), 5.0)
        val square2 = Square(MyPoint(2.0, 7.0), 5.0)

        val line = getCuttingLine(square1, square2)
        println("Line from " + line[0] + " to " + line[1] + " will cut two squares into half.")

    }
}