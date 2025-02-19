package Assignment5

import org.scalatest.funsuite.AnyFunSuite

class Assignment5Test extends AnyFunSuite {

  test("computeArea should calculate the area of a circle correctly") {
    val computedArea = Assignment5.computeArea(3.5)
    val expectedArea = Math.PI * 3.5 * 3.5
    assert(math.abs(computedArea - expectedArea) < 0.0001)
  }

  test("List should be sorted in descending order") {
    val sortedList = Assignment5.numbers.sortWith((a, b) => a > b)
    val expected = List(92, 80, 52, 43, 21, 19, 5, -5)
    assert(sortedList == expected)
  }

  test("makeAdder should return a function that adds x to its argument") {
    val add15 = Assignment5.makeAdder(15)
    assert(add15(10) == 25)
    assert(add15(0) == 15)
    assert(add15(-5) == 10)

    val addNegative = Assignment5.makeAdder(-5)
    assert(addNegative(5) == 0)
    assert(addNegative(-5) == -10)
  }
}

