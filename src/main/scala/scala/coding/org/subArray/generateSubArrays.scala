package scala.coding.org.subArray

object generateSubArrays {
  /**
    * This method generates the sum of sub Array
    *
    * @param a -> Given Array
    * @return -> Returns the sum of Array
    */
  def generateSubArrays(a: Array[Int]): Int = {
    val n = a.length
    var result = 0
    for (i <- 0 until n) {
      for (j <- i until n) {
        for (k <- i to j) {
          result += a(k) //generate sum of sub arrays
        }
      }
    }
    result
  }

  def main(args: Array[String]): Unit = {
    val a = Array(1, 2, 3, 4)
    val output = generateSubArrays(a)
    println(output)
  }
}
