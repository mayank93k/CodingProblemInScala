package scala.coding.org

object reverseString {
  def main(args: Array[String]): Unit = {
    val a = "Mayank Avik Love"
    reverseString(a)
  }

  /**
   * This method is used to reverse a string of characters
   *
   * @param n -> String
   */
  private def reverseString(n: String): String = {
    var reverse: String = ""
    val p = n
    var i = p.length - 1
    while (i >= 0) {
      reverse = reverse + p.charAt(i)
      i -= 1
    }
    println("Reverse of String: " + n + " is -> " + reverse)
    reverse
  }
}
