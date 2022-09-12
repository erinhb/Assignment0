class Circle(_name: String) : Shape(_name) {

    var radius = 0.0

    override fun setDimensions(_r: Double, d1: Double, d2: Double) {
        radius = _r
    }

    override fun printDimensions() {
        println("name: $name, radius: $radius")
    }

    override fun getArea(): Double {
        return (3.14 * radius * radius)
    }

}