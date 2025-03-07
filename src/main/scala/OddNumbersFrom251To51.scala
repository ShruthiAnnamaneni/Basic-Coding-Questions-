object OddNumbersFrom251To51 {
 // 11. Write a program to print all odd numbers from 251 to 51. like (251,249,...51)
  def main(args:Array[String]):Unit={
    println("Odd numbers from 251 to 51 are")
    for(i<-251 to 51 by -1){
      if(i%2!=0){
        print(i+",")
      }
    }
  }

}
