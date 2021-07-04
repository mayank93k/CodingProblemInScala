package main.scala.org.coding.questions.mayank

/**
  * About: Check weather given year is a leap year or not
  */
object leapYear {
  /**
    * This method gives a given year is a leap year or not
    *
    * @param year -> Year
    * @return -> Return true if its is leap year or else false
    */
  def yearLeap(year: Int): Boolean = {
    if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          true
        } else {
          false
        }
      } else {
        true
      }
    }
    else {
      false
    }
  }

  def main(args: Array[String]): Unit = {
    //  println("Enter the year to check, Year is leap year or normal year")
    // val year = readInt()
    val year = 2008
    println("The year " + year + " is a leap year: " + yearLeap(year))
  }
}
