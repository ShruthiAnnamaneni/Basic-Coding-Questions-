object FindAverage {
  //18. Write a program to find the average of 24,26,28,.....100.

  def main(args:Array[String]):Unit={
    var sum=0
    var count=0

    for(i<-24 to 100){
      sum+=i
      count+=1
    }
    print("Average of 24,26,28,.......100 is "+sum/count)
  }

}
