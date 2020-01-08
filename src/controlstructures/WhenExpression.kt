package controlstructures

fun main (){
    println(getDescription(color.RED))
}

enum class color{
    BLUE,ORANGE,RED
}

fun getDescription(color1: color):String = when(color1){
    color.BLUE -> "cold"
    color.ORANGE -> "mild"
    color.RED -> "hot"
}