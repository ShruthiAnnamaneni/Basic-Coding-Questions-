object PrintAlphabets {
  //17. Write a Program to print the all alphabets by using character Variable?
    def main(args: Array[String]): Unit = {

      println("Uppercase Alphabets:")
      for (ch <- 'A' to 'Z') {
        print(ch + " ")
      }
      println()
      println("Lowercase Alphabets:")
      for (ch <- 'a' to 'z') {
        print(ch + " ")
      }
    }

}
