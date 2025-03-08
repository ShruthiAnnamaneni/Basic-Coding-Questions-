object Problem22 {
  // 22. Write programs to print the following series. 100,200,300........10000
  def main(args:Array[String]):Unit={
    var num=0
    for(i<-1 to 100){
      num+=100
      print(num+",")
    }
  }
}
