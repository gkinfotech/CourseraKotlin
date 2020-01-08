package loops

//Iterating with step function
//i in 9 downTo 1 step 2 means from 9 to 1 with increment 2
fun main(){
    for (i in 9 downTo 1 step 2){
        println(i)
    }

    for (ch in "abc"){
        println(ch+1)
    }

    //write a for loop to print 0..9
    for (c in '0' until '9'){
        println(c)
    }

}
