object Problem25 {
  //25. Write programs to print the following series. 5*4,5*3,5*2,......5*(-12)
  //(Print in two ways – patter & multiplied value)
    def main(args:Array[String]):Unit={
      for(i<-4 to -12 by -1){
        print("5*"+i+",")
      }
      println()
      println("Multiplied pattern is ")
      for(i<-4 to -12 by -1){
        print(5*i+",")
      }
    }
}
