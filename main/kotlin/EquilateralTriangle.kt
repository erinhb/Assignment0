import java.lang.Math.sqrt

class EquilateralTriangle(_name: String) : Triangle(_name) {

    var side = 0.0

    override fun setDimensions(_s: Double, d1: Double, d2: Double) {
        side = _s
    }

    override fun printDimensions() {
        println("name: $name, side: $side")
    }

    override fun getArea(): Double {
        var p = (side * 3)/2
        return (sqrt(p * (p-side) * (p-side) * (p-side)))
    }

}