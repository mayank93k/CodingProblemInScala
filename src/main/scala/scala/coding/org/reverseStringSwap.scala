package scala.coding.org

/**
 * About: Get the reverse of String
 */
object reverseStringSwap {
  def main(args: Array[String]): Unit = {
    val a = "Mayank Avik Love"
    println("Input String: " + a)
    val b = reverseArray(a)
    println("Reverse String: " + b.mkString(""))
  }

  /**
   * This method gives the reverse string
   *
   * @param elem -> String element
   * @return
   */
  def reverseArray(elem: String): Array[Char] = {
    var start = 0
    var end = elem.length - 1
    val cs = elem.toCharArray
    while (start < end) {
      val swp = cs(start)
      cs(start) = cs(end)
      cs(end) = swp
      start += 1
      end -= 1
    }
    cs
  }
}
