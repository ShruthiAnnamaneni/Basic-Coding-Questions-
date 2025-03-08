object Problem15 {
  //15. Print following series 2*3,3*4,4*5,......16*17 (Print in two ways – patter & multiplied value)
  def main(args:Array[String]):Unit={
    for(i<-2 to 16){
      print(i+"*"+(i+1)+",")
    }
    println()
    println("Multiplied values for above pattern are ")
    for(i<-2 to 16){
      print(i*(i+1)+",")
    }
  }
}
