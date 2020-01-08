package loops
//Iterating Over Map
fun main(){
    val map = mapOf(1 to "One",2 to "two", 3 to "Three")
    for ((key,value) in map){
        println("$key = $value")
    }
}