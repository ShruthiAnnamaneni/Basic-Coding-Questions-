object Problem8 {
 // 8. Write a program to print all numbers which are divisible by 11 from 250 to 550.
def main(args:Array[String]):Unit={
  val num=11
  for(i<-250 to 550){
    if(i%11==0){
      print(i+" ")
    }
  }
}

}
