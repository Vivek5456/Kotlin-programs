fun main(){
    //divide two no.s
    var a:Int=10
    var b:Int=2
    if (b==0){
        println("Division cannot be performed.")
    }
    else{
        println(a/b)
    }

    //greater of two no.s

    var c:Int=10
    var d:Int=20

    if(c>d){
        println("$c is greater than $d")
    }
    else{
        println("$d is greater than $c")
    }

    //print maxvalue

    val x =50
    val y=60
    var maxvalue:Int

    if(x>y){
        maxvalue=x
    }
    else{
        maxvalue=y
    }
    println(maxvalue)


    //nested if else
    val num=2
    when(num){
        0-> println("Zero")
        1-> println("One")
        2-> println("Two")
        else->println("None of the above")
    }

    //nested if else
    val number=0
    when {
        number > 0 -> println("Positive")
        number < 0 -> println("Negative")
        else -> println("Zero")
    }


    //if else with logical OR operator
    val g= 0
    if(g>0 || g<0){
        println("It is a non-zero integer")
    }
    else{
        println("The integer is zero")
    }

    //if else with logical AND operator

    val h=6
    if(h>0 && h<=5){
        println("The value of the integer is between 0-5")

    }
    else{
        println("The value of the integer is not between 0-5")
    }


    //if else with nested if and logical IN operator

    val i= 5

    when(i){
        in 1..10-> println("Between 1 to 10")
        in 11..20-> println("Between 11 to 20")
        else ->println("None")
    }

    //if else along with strings operations
    val O: String="Internshala"
    var o: Int=O.length
    val P: String="Trainings"
    var p: Int=P.length


    if(o==p){
        println("Length is same")
    }
    else{
        println("Length is different")
    }
}