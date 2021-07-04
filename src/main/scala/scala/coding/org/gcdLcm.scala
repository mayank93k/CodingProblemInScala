package main.scala.org.coding.questions.mayank

import scala.io.StdIn.readInt

/**
  * Implementation of GCD and LCM using user Input
  */
object gcdLcm {
  /**
    * This method gets the GCD
    *
    * @param a -> First element
    * @param b -> Second Element
    * @return -> Return the GCD
    */
  def gcd(a: Int, b: Int): Int = {
    if (b == 0) a
    else gcd(b, a % b)
  }

  /**
    * This method gets the LCM
    *
    * @param a -> First element
    * @param b -> Second Element
    * @return -> Return the LCM
    */
  def lcm(a: Int, b: Int): Int = {
    (a * b) / gcd(a, b)
  }

  def main(args: Array[String]): Unit = {
    println("Enter value of A")
    val a = readInt()
    println("Enter value of B")
    val b = readInt()
    println("GCD of " + a + " and " + b + " is " + gcd(a, b))
    println("LCM of " + a + " and " + b + " is " + lcm(a, b))
  }
}
