package Assignment6

import org.scalatest.funsuite.AnyFunSuite

class ResourceManagementTest extends AnyFunSuite {
  class TestResource extends Resource {
    var isAcquired: Boolean = false
    var isReleased: Boolean = false

    override def acquire(): Unit = {
      isAcquired = true
      println("TestResource acquired.")
    }

    override def release(): Unit = {
      isReleased = true
      println("TestResource released.")
    }
  }

  test("using properly manages resource acquisition and release") {
    val resource = new TestResource
    using(resource) { res =>
      assert(resource.isAcquired, "Resource should be acquired before use.")
    }
    assert(resource.isReleased, "Resource should be released after use.")
  }
}

object ResourceManagement extends App {
  val resource = new Resource()

  using(resource) { res =>
    println("Performing an operation with the resource.")
  }
}
