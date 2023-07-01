fun main(){
    // for loop

    for (i in 1..10){
        println(i)
    }

    //while loop

    var i=1
    while(i<=10){
        println(i)
        i++
    }

    // Do-while loop

    i=1
    do{
        println(i)
        i++
    }while(i<=10)


    //for loop used to traverse through array

    val a= arrayOf('a','b','c','d','e')

    for (j in 0 until a.size-1){
        println("${a[j]}")
    }

    //print sum of first 100 natural no.s

    var count=0
    for (b in 0 ..100){
        count+=b
    }
    println("Sum of first 100 natural no.s is : $count")

    //iteration in for loop
    for (d in 0..10 step 2){
        println(d)
    }

    //print in descending order
    for (c in 10 downTo 0){
        println(c)
    }
}