package loops
//for loop with range
//1..9 including upperbound(9)
/*
fun main(){
    for (i in 1..9){
        print(i)
    }
}*/
// output 123456789

//2. Iterating Over Range using until it will exclude the upperbound 9
/*fun main(){
    for (i in 1 until 9){
        print(i)
    }
}*/
//output 12345678
//3. simple example for in and not in
/*fun main(){
    println(isLetter('a'))
    print(isNotDigit('a'))
}

fun isLetter(c:Char) = c in 'a'..'z'|| c in 'A'..'Z'

fun isNotDigit(c:Char) = c !in '0'..'9'*/

//4. in as when condition

fun main(){
    println(recognize('0'))
}
fun recognize(c:Char)=when(c){
    in '0'..'9' -> "It`s a digit"
    in 'a'..'z', in 'A'..'Z' -> "Its a letter"
    else -> "I dont know"
}