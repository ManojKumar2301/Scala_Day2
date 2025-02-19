package Assignment7

import org.scalatest.funsuite.AnyFunSuite

class ZooTest extends AnyFunSuite {

  test("Zoo should add animals correctly") {
    val zoo = new Zoo()
    val lion = new Animals("Lion")
    val elephant = new Animals("Elephant")
    val tiger = new Animals("Tiger")

    zoo.addAnimal(lion)
    zoo.addAnimal(elephant)
    zoo.addAnimal(tiger)

    assert(zoo.listAnimals() == List("Lion", "Elephant", "Tiger"))
  }

  test("Zoo should return an empty list when no animals are added") {
    val zoo = new Zoo()
    assert(zoo.listAnimals().isEmpty)
  }
}

