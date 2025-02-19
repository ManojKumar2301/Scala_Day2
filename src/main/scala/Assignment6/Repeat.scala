package Assignment6

def repeat(n: Int)(block: => Unit): Unit = {
  for (i <- 1 to n) {
    block
  }
}

object Repeat extends App {
  repeat(9) {
    println("Hii, Paddy")
  }
}
