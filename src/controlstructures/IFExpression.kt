package controlstructures

fun main(){

  println("max:${maxOftwoNumbers(10,20)}")
}

fun maxOftwoNumbers(a:Int,b:Int):Int{
    /*val max:Int
    if (a>b){
        max = a
    } else {
        max = b
    }
    return max*/
  val max = if (a>b) a else b
  return max
}