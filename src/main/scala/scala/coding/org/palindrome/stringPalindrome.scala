package scala.coding.org.palindrome

object stringPalindrome {
  /**
    * This method checks given string is palindrome or not
    *
    * @param s -> Given String
    * @return -> Returns the palindrome string
    */
  def stringPalindrome(s: String): Unit = {
    val a = s.toCharArray
    var n = a.length - 1
    var start = 0
    while (start < n) {
      val temp = a(start)
      a(start) = a(n)
      a(n) = temp
      start += 1
      n -= 1
    }
    val x = s.mkString("")
    val y = a.mkString("")
    if (x == y) {
      println("string is palindrome")
    } else {
      println("string is not a palindrome")
    }
  }

  def main(args: Array[String]): Unit = {
    val s = "abcbad"
    stringPalindrome(s)
  }
}
