import java.lang.Math.sqrt

open class Triangle(_name: String) : Shape(_name) {

    var side1 = 0.0
    var side2 = 0.0
    var side3 = 0.0

    override fun setDimensions(s1: Double, s2: Double, s3: Double){
        side1 = s1
        side2 = s2
        side3 = s3
    }

    override fun printDimensions() {
        println("name: $name, side1: $side1, side2: $side2, side3: $side3")
    }

    override fun getArea(): Double {
        var p = (side1 + side2 + side3)/2
        return (sqrt(p * (p-side1) * (p-side2) * (p-side3)))
    }

}