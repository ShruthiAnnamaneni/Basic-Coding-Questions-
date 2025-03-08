object SumOfEven382to582 {
  //16. Write a program to sum all even numbers between 382 and 582.
  def main(args:Array[String]):Unit={
    var sum=0
    for(i<-382 to 582){
      if(i%2==0){
        sum+=i
      }
    }
    print("sum of even numbers between 382 and 582 is "+sum)
  }

}
