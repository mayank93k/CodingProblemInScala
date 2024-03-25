package scala.coding.org

object reverseInteger {
  def main(args: Array[String]): Unit = {
    val a: Int = 34595
    reverseInt(a)
  }

  /**
   * How to reverse a array or list of Integer
   *
   * @param n -> elements in Array
   * @return
   */
  private def reverseInt(n: Int): Int = {
    var reverseNum: Int = 0
    var p = n
    while (p != 0) {
      val digit = p % 10
      reverseNum = reverseNum * 10 + digit
      p /= 10
    }
    println("Reversed of: " + n + " number is: " + reverseNum)
    reverseNum
  }
}
