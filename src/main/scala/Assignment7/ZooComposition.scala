package Assignment7

class Animals(val name: String) {
  def animalName: String = name
}

class Zoo {
  private var animals: List[Animals] = List()

  def addAnimal(animal: Animals): Unit = {
    animals = animals :+ animal
  }

  def listAnimals(): List[String] = {
    animals.map(_.animalName)
  }

  def printAnimals(): Unit = {
    animals.foreach(animal => println(animal.animalName))
  }
}

object ZooComposition extends App {
  val zoo = new Zoo()

  val lion = new Animals("Lion")
  val elephant = new Animals("Elephant")
  val tiger = new Animals("Tiger")

  zoo.addAnimal(lion)
  zoo.addAnimal(elephant)
  zoo.addAnimal(tiger)

  println("List of Animals in the Zoo:")
  zoo.printAnimals()
}

