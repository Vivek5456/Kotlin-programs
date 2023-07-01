fun main(){
    //imutable list

    val listofstrings= listOf("Box","Chef","Tables")
    println(listofstrings)


    //mutable list

    val listofnew =mutableListOf("Box","Table","Chair")
    println(listofnew)
    listofnew.add("TV")
    listofnew.add(2, "Air Condtioner")
    println(listofnew)
    listofnew.removeAt(4)
    println(listofnew)

    val arr= arrayOf("Fan","Lights","Matress")

    listofnew.addAll(arr)
    println(listofnew)
}