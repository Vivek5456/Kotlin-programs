import kotlin.math.max  //for max function
fun main(){
    iAmFunction()
    println(timesTwo(5))
    println(timesThree(45))
    println(maxl(152,26))
}
fun iAmFunction():Unit{
    println("I am a new Function")
}

fun timesTwo(x:Int):Int{
    val output = x*2
    return output
}

fun timesThree(x:Int):Int{
    return x*3
}

fun maxl(a:Int,b :Int):Int{
    return max(a,b)
}