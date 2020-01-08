package controlstructures
//checking conditions: when without args
fun main(){
    print(updateWeather1(22))
}

enum class color2{
    BLUE,ORANGE,RED
}

fun updateWeather1(degress:Int): Pair<String, color2> {
    val(description,colors)= when{
        degress< 5 -> "cold" to color2.BLUE
        degress< 23 -> "Mild" to color2.ORANGE
        else -> "hot" to color2.RED
    }
    return Pair(description,colors)

}