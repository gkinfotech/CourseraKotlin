package controlstructures

// Checking Values

fun main(){
    print(respondToInput("y"))
}

fun respondToInput(input:String) = when(input){
    "y","yes" -> "I am very glad you agree"
    "n","no" -> "Sorry to hear that"
    else -> "I dont understand you"
}