package Kotlinfunctions
//function with default Values
fun main(){
    displaySeparator('*',5)
    displaySeparator(size = 3,character = '#')
}

fun displaySeparator(character:Char='*',size:Int){
    repeat(size){
        print(character)
    }
}