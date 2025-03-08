object Problem26 {
  //26. Write programs to print the following series.
  //1,even,3,even,5,even,.......35,even
    def main(args:Array[String]):Unit={
      for(i<-1 to 36){
        if(i%2==0){
          print("even,")
        }
        else{
          print(i+",")
        }
      }
    }
}
