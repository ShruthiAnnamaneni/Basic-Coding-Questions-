object SumOfNosFrom56to153 {
  //9. Write a program to sum all the numbers from 56 to 153.
  def main(args:Array[String]):Unit={
    var sum=0
    for(i<-56 to 153){
      sum+=i
    }
    print("Sum of numbers from 56 to 153 is "+sum)
  }

}
