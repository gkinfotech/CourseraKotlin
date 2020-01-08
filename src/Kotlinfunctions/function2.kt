package Kotlinfunctions

fun main(){
    displayMax(10,20)
}
//you can remove Unit and run that is also possible unit =>Void
fun displayMax(a:Int,b:Int):Unit{
    println("max:${max(a,b)}")
}