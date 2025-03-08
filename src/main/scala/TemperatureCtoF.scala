object TemperatureCtoF {
  def main(args: Array[String]):Unit={
    //2. Write a program to covert temperature from degree C to F. (Input 80C)
    //(80°C × 9/5) + 32 = 176°F

    val temp_in_C=80
    var temp_in_F=(temp_in_C*9/5)+32
    print(temp_in_C+" C converted to "+temp_in_F+" F")
  }

}
