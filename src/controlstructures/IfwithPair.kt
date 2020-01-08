package controlstructures

fun main(){
    println(updateWeather(22))
}
enum class Color{
    BLUE,RED,ORANGE
}

fun updateWeather(degrees:Int): String {
    val (description:String,color:Color) =
        if (degrees <10){
            Pair("Cold", Color.BLUE)
        }else if (degrees < 25){
            Pair("mild",Color.ORANGE)
        }else{
            Pair("hot",Color.RED)
        }
    return color.toString() //description


}