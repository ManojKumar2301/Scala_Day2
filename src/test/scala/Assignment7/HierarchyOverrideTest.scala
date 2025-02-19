package Assignment7

import org.scalatest.funsuite.AnyFunSuite

class HierarchyOverrideTest extends AnyFunSuite {

  test("Dog should say 'Bow Bow'") {
    val dog = new Dog
    assert(dog.speak() == "This animal says: Bow Bow")
  }

  test("Cat should say 'Meow Meow'") {
    val cat = new Cat
    assert(cat.speak() == "This animal says: Meow Meow")
  }
}
