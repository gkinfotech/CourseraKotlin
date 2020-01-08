package variables
fun main(){
    val name = "Kotlin"
    println("Hello!,$name")

    val question:String = "life, the universe,"+"and everything"
    println("$question")

    var answer = 0
    answer = 42
    println(answer)

    //local type inference
    val greetings = "Hi" //Strings we can do it another way val greetings:String = "hi"
    println(greetings)

    var number = 10
    println(number)


}
/*
variable has two types
1. val -> Read only Variables it like a final variable
2. var -> Mutable Variables


 */