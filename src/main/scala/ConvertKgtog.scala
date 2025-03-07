object ConvertKgtog {
  def main(args: Array[String]):Unit={
  //  1. Write a program to convert kg to g. (Input 56kg print in grams)

    val weight_in_kg = 56
    val weight_in_g=weight_in_kg*1000
    print(weight_in_kg+" kg converted to "+weight_in_g +" grams")
  }

}
