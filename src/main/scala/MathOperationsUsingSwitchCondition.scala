object MathOperationsUsingSwitchCondition {
 /* 6. Write a program to perform simple math based on the user inputs by using
  Switch condition.(+ , - , * , /)
  */
  def main(args: Array[String]): Unit = {
  var res=0
    println("Enter the first number: ")
    val num1 = scala.io.StdIn.readInt()

    println("Enter the second number: ")
    val num2 = scala.io.StdIn.readInt()

    println("Enter the operator (+, -, *, /): ")
    val operator = scala.io.StdIn.readLine()

    operator match {
      case "+" =>
         res=num1+num2
        println("Addition of 2 numbers is " +res)
      case "-" =>
        res=num1-num2
        println("Subtraction of 2 numbers is "+res)
      case "*" =>
        res=num1*num2
        println("Multiplication of 2 numbers is "+res)
      case "/" =>
        if (num2 != 0) {
          res=num1/num2
          println("Quotient of 2 numbers is "+res)
        } else {
          println("Error: Division by zero is not allowed!")
        }
      case _ =>
        println("Invalid operator. Please use +, -, *, or /.")
    }
  }

}

