package Assignment6

import org.scalatest.funsuite.AnyFunSuite

class RepeatTest extends AnyFunSuite {

  test("repeat should execute the block the correct number of times") {
    var counter = 0
    repeat(9) {
      counter += 1
    }
    assert(counter == 9)
  }

  test("repeat with zero times should not execute the block") {
    var counter = 0
    repeat(0) {
      counter += 1
    }
    assert(counter == 0)
  }

  test("repeat with one time should execute the block once") {
    var counter = 0
    repeat(1) {
      counter += 1
    }
    assert(counter == 1)
  }
}
