object Problem28 {
  //28. Write programs to print the following series. 1,3, divisible by five, 7,9,
  //11,13, divisible by five,.....21,23, divisible by five
    def main(args:Array[String]):Unit={
      for(i<-1 to 25){
        if(i%2!=0 && i%5==0){
          print("divisible by five,")
        }
        else if(i%2!=0){
          print(i+",")
        }

      }
    }

}
