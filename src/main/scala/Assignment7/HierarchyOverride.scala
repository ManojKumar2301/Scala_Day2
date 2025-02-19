package Assignment7

abstract class Animal {
  def speak(): String
  def sound(): String = "This animal says: "
}

class Dog extends Animal {
  override def speak(): String = {
    super.sound() + "Bow Bow"
  }
}

class Cat extends Animal {
  override def speak(): String = {
    super.sound() + "Meow Meow"
  }
}

object HierarchyOverride extends App {
  val dog = new Dog
  val cat = new Cat

  println(dog.speak())
  println(cat.speak())
}