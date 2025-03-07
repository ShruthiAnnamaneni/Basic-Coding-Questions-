object CountOfEvenNumbers {
  //12. Write a Program to print the count of the even numbers between the given range?
def main(args:Array[String]):Unit={
  println("Enter a number from which the range should start")
  val num1=scala.io.StdIn.readInt()
  println("Enter a number where the range should end")
  val num2=scala.io.StdIn.readInt()
  var count=0
  for(i<-num1 to num2){
    if(i%2==0){
      count+=1
    }
  }
  print("Count of even numbers between "+num1+" and "+num2+" is "+count)
}
}
