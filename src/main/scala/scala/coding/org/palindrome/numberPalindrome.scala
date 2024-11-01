package scala.coding.org.palindrome

import java.util.Scanner

object numberPalindrome {
  def main(args: Array[String]): Unit = {
    val scanner = new Scanner(System.in)
    println("Enter the number to check palindrome: \n")
    val a = scanner.nextInt()
    val palin = numberPalindrome(a)
    if (palin == a) {
      println("Number is palindrome")
    } else {
      println("Number is not a palindrome")
    }
  }

  /**
   * This method checks given number is palindrome or not
   *
   * @param a -> Given array
   * @return -> Returns the palindrome number
   */
  private def numberPalindrome(a: Int): Int = {
    var reverse_num = 0
    var p = a
    while (p != 0) {
      val digit = p % 10
      reverse_num = reverse_num * 10 + digit
      p /= 10
    }
    reverse_num
  }
}
