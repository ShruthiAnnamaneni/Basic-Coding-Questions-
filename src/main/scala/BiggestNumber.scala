object BiggestNumber {

  def main(args:Array[String]):Unit= {
// 3. Declare and initialize 3 three variable and print the biggest number.
    val a = 10
    val b = 15
    val c = 30
      if (a > b & a > c) {
        print("the largest number is "+a)
      }
      else if (b > a & b >c) {
        print("the largest number is "+b)
      }
      else{
        print ("the largest number is "+ c)
      }
  }
}
