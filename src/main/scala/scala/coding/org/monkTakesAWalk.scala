package main.scala.org.coding.questions.mayank

/**
  * Problem:
  * Today, Monk went for a walk in a garden. There are many trees in the garden and each tree has an English alphabet on it.
  * While Monk was walking, he noticed that all trees with vowels on it are not in good state. He decided to take care of them.
  * So, he asked you to tell him the count of such trees in the garden.
  * Note : The following letters are vowels: 'A', 'E', 'I', 'O', 'U' ,'a','e','i','o' and 'u'.
  */
class monkTakesAWalk {

  def linear(a: Array[Char]): Unit = {
    var count = 0
    for (i <- 0 to a.length - 1) {
      if (a(i) == 'A' || a(i) == 'a' || a(i) == 'E' || a(i) == 'e' || a(i) == 'I' || a(i) == 'i' || a(i) == 'O' || a(i) == 'o' || a(i) == 'U' || a(i) == 'u') {
        count += 1
      }
    }
    println("Count of trees with vowel letter on it: " + count)
  }
}

object monkTakesAWalk {
  def main(args: Array[String]): Unit = {
    val arr: String = "nBBZLaosnm"
    val monk = new monkTakesAWalk
    monk.linear(arr.toCharArray)
  }
}
