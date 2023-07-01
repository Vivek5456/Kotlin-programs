import java.util.Arrays
import java.util.*

fun main(){

    var strArray: Array<String> = arrayOf("Welcome", "Kotlin","Programming")
    println(strArray.get(2))
    println(strArray[2])

    strArray[2]="Vivek"
    println(strArray[2])

    var a : Int = strArray.size
    println("Size of array is $a")

    println(Arrays.toString(strArray))


    val myArray = arrayOf<Int>(0, 2, 5, 8, 11,16,19,22,26)
    println(Arrays.toString(myArray))
    val sum = myArray[0] + myArray[1] + myArray[2] + myArray[3] + myArray[4] + myArray[5] + myArray[6] + myArray[7] + myArray[8]
    println(sum)
}