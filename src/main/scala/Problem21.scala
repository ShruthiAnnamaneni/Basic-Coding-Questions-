object Problem21 {
  //21. Write a program to print the series : 10@9,9@8,8@7.......-5@-6
  def main(args:Array[String]):Unit={
    for(i<-10 to -5 by -1){
      print(i+"@"+(i-1)+",")
    }
  }

}
