object problem31 {
  //31. Write a Loop inside other loop and observe the execution flow?
    def main(args:Array[String]):Unit={
      for(i<-1 to 5){
        for(j<-1 to i){
          print(j)
        }
        println()
      }
    }

}
