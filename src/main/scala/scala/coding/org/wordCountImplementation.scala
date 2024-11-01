package scala.coding.org

/**
 * About: Find the word count in a string
 */
object wordCountImplementation {
  def main(args: Array[String]): Unit = {
    val s = "Hey Hey Hey How are you"
    var count = 1
    val arr = s.split(" ")
    val n = arr.length - 1
    for (i <- 0 to n) {
      for (j <- i + 1 to n) {
        if (arr(i).equals(arr(j)) && arr(i) != "0") {
          count += 1
          arr(j) = "0"
        }
      }
      if (arr(i) != "0" && count >= 1) {
        println(arr(i) + " -> " + count)
        count = 1
      }
    }
  }
}
