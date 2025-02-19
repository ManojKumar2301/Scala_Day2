package Assignment5

object Assignment5 extends App {
    def computeArea(r: Double): Double = {
        Math.PI*r*r
    }
    println(s"Area of circle : ${computeArea(3.5)}")

    val numbers : List[Int] = List(52, 43, 21, 19, 5, 80, 92, -5)
    val res : List[Int] = numbers.sortWith((a, b) => a > b)

    println(res)

    def makeAdder(x:Int):Int => Int = {
        (y:Int) => x + y
    }

    val add15 = makeAdder(15)
    println(s"Adding 15 to 10 : ${add15(10)}")
    //println(add15(15))

}


