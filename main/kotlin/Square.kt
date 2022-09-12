class Square(_name: String) : Shape(_name) {

    var length = 0.0
    var height = 0.0

    override fun setDimensions(_l: Double, _h: Double, d2: Double) {
        length = _l
        height = _h
    }

    override fun printDimensions() {
        println("name: $name, length: $length, height: $height")
    }

    override fun getArea(): Double {
        return (length * height)
    }
}