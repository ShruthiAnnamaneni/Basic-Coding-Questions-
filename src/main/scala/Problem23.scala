object Problem23 {
  //23. Write programs to print the following series. 5^2, 7^2,9^2.....25^2
    def main(args:Array[String]):Unit={
      for(i<-5 to 25){
        if(i%2!=0){
          print(i+"^2, ")
        }
      }
    }

}
