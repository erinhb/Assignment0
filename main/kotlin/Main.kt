import java.util.*

fun main(args: Array<String>) {

    val shape1 : Shape = Square("square")
    val shape2 : Shape = Circle("circle")
    val shape3 : Shape = Triangle("triangle")
    val shape4 : Shape = EquilateralTriangle("equlateral triangle")

    //square
    var reader = Scanner(System.`in`)
    println("Enter length for square")
    val length: Double = reader.nextDouble()

    println("Enter height for square")
    reader = Scanner(System.`in`)
    val height = reader.nextDouble()
    shape1.setDimensions(length, height, 0.0)


    //circle
    reader = Scanner(System.`in`)
    println("Enter radius for circle")
    val radius = reader.nextDouble()
    shape2.setDimensions(radius, 0.0, 0.0)


    //triangle
    reader = Scanner(System.`in`)
    println("Enter side 1 for triangle")
    val side1 = reader.nextDouble()

    reader = Scanner(System.`in`)
    println("Enter side 1 for triangle")
    val side2 = reader.nextDouble()

    reader = Scanner(System.`in`)
    println("Enter side 1 for triangle")
    val side3 = reader.nextDouble()
    shape3.setDimensions(side1, side2, side3)


    //equilateral triangle
    reader = Scanner(System.`in`)
    println("Enter side for equilateral triangle")
    val side = reader.nextDouble()
    shape4.setDimensions(side, 0.0, 0.0)


    //print all info
    shape1.printDimensions()
    val area1 = shape1.getArea()
    println("Area $area1")

    shape2.printDimensions()
    val area2 = shape2.getArea()
    println("Area $area2")

    shape3.printDimensions()
    val area3 = shape3.getArea()
    println("Area $area3")

    shape4.printDimensions()
    val area4 = shape4.getArea()
    println("Area $area4")

}