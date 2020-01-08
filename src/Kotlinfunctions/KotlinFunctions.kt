package Kotlinfunctions
//one way of writing functions
fun main (){
    print("Max: ${max(10,20)}")
}


/*fun max(a:Int,b:Int):Int{
    return if (a>b) a else b
}*/

//shortest form Immediate assignment conversion of expression body
fun max(a:Int,b:Int):Int = if (a>b)a else b


