object PrintAandBalternatively100times {
  //20. Write a program to print A, B alternatively for 100 times. Ex: (A, B, A, B, A,B...)
  def main(args:Array[String]):Unit={
    for(i<-1 to 100){
      if(i%2!=0){
        print("A,")
      }
      else{
        print("B,")
      }
    }
  }
}
