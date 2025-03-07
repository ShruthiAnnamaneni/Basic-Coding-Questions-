object problem4 {
  /*
  4. Write a java program that performs the following tasks.
a. Store a number in a variable
b. If value is not in range (100-1000) prints wrong number else follows
the steps
c. Check even or odd
d. If even divide the number by 3 and print the remainder
e. If odd divide the number by 2 and print the remainder.
   */
def main(args: Array[String]):Unit={
  var num=125
  var rem=0
  if(num<100 || num>1000)
    {
      println("Wrong Number")
    }
  else if(num%2==0){
     rem=num%3
    println("Number is even and remainder is "+rem)
  }
  else{
    rem=num%2
    println("Number is odd and remainder is "+rem)
  }
}
}
