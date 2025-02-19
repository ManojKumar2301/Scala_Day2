package Assignment6

class Resource {
  def acquire(): Unit = {
    println("Resource acquired.")
  }

  def release(): Unit = {
    println("Resource released.")
  }
}

def using(resource: Resource)(block: Resource => Unit): Unit = {
  try {
    resource.acquire()
    block(resource)
  } finally {
    resource.release()
  }
}

object ResourceManagement extends App {
  val resource = new Resource()

  using(resource) { res =>
    println("Performing an operation with the resource.")
  }
}
