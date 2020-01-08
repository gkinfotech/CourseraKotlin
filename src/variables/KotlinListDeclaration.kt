package variables

fun main (){

    //mutableListOf we can modify it
    val languages = mutableListOf<String>("kotlin")
    languages.add("Java")
    languages.add("Android")
    for (i in languages){
        println(i)
    }

    //immutable list we cant add any values to the list
    var list = listOf<String>("Java","Kotlin","Android")
    for (i in list){
        println(i)
    }
}