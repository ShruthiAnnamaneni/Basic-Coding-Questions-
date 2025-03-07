object AlternateEvenNumbers {
  //13. Write a program to print alternate even numbers from 20 to 140. Like (20,24,28...)
def main(args:Array[String]):Unit={
  for(i<-20 to 140 by 4){
    if(i%2==0){
      print(i+" ")

    }
  }
}
}
