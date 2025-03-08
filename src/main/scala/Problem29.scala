object Problem29 {
  //29. Write programs to print the following series. 0.5^2, 0.7^2,0.9^2....5.1^2
    def main(args:Array[String]):Unit={
      var start = 0.5
      val end = 5.3
      val increment = 0.2

      while (start <= end) {
        print(start+"^2,")
        start += increment
      }
    }

}
