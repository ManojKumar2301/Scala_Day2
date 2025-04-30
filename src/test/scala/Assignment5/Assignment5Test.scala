package Assignment5

import org.fp.Assignment5
import org.fp.Assignment5.Assignment5.{computeArea, makeAdder}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class Assignment5Test extends AnyFlatSpec with Matchers {

  // Test for computeArea
  "computeArea" should "calculate the correct area for a circle" in {
    val radius = 3.5
    val expectedArea = Math.PI * radius * radius
    computeArea(radius) shouldEqual expectedArea
  }

  it should "calculate the correct area for a radius of 0" in {
    val radius = 0
    val expectedArea = 0
    computeArea(radius) shouldEqual expectedArea
  }

  it should "calculate the correct area for a radius of 1" in {
    val radius = 1
    val expectedArea = Math.PI
    computeArea(radius) shouldEqual expectedArea
  }

  // Test for sortWith (Sorting)
  "The list of numbers" should "be sorted in descending order" in {
    val numbers: List[Int] = List(52, 43, 21, 19, 5, 80, 92, -5)
    val expectedSortedList = List(92, 80, 52, 43, 21, 19, 5, -5)
    val res = numbers.sortWith((a, b) => a > b)
    res shouldEqual expectedSortedList
  }

  it should "sort a list with negative numbers" in {
    val numbers: List[Int] = List(-3, -1, -2, -5, -10)
    val expectedSortedList = List(-1, -2, -3, -5, -10)
    val res = numbers.sortWith((a, b) => a > b)
    res shouldEqual expectedSortedList
  }

  it should "sort an empty list correctly" in {
    val numbers: List[Int] = List()
    val expectedSortedList = List()
    val res = numbers.sortWith((a, b) => a > b)
    res shouldEqual expectedSortedList
  }

  // Test for makeAdder
  "makeAdder" should "create a function that adds 15 to a given number" in {
    val add15 = makeAdder(15)
    add15(10) shouldEqual 25
  }

  it should "create a function that adds 15 to 0" in {
    val add15 = makeAdder(15)
    add15(0) shouldEqual 15
  }

  it should "create a function that adds 15 to negative numbers" in {
    val add15 = makeAdder(15)
    add15(-10) shouldEqual 5
  }

  it should "create a function that adds 15 to 15" in {
    val add15 = makeAdder(15)
    add15(15) shouldEqual 30
  }

}
