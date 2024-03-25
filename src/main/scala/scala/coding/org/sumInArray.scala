package scala.coding.org

object sumInArray {
  def main(args: Array[String]): Unit = {
    val b: Array[Int] = Array(4, 1, 3, 5, 6, 7, 9)
    val c = 10
    SumArray(b, c)
  }

  /**
   * How do you find all pairs of an integer array whose sum is equal to a given number?
   *
   * @param a -> Elements in array
   * @param k -> Sum of pair of integer
   */
  /* def SumArray(a:Array[Int],k:Int): Unit ={
     for(i<-0 to a.length-1){
       for(j<- i+1 to a.length-1){
         var sum=a(i)+a(j)
         if(sum==k){
           println("The set of Integer is:"+a(i)+","+a(j)+" for key: "+k)
         }
       }
     }
   }*/
  private def SumArray(a: Array[Int], k: Int): Unit = {
    val b = a.sorted
    var start = 0
    var end = b.length - 1
    while (start < end) {
      if (b(start) + b(end) == k) {
        println("The set of Integer is:" + b(start) + "," + b(end) + " for key: " + k)
      }
      if (b(start) + b(end) < k) {
        start += 1
      } else {
        end -= 1
      }
    }
  }
}
