object EvenNumbersFrom700To900 {
  //10. Write a program to print all even numbers in range 700 to 900.
  def main(args:Array[String]):Unit={
    println("Even numbers in the range 700 to 900 are ")
    for(i<-700 to 900){
      if(i%2==0){
        println(i)
      }
    }
  }

}
