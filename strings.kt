fun main(){
    val s="Hello Welcome to my World"
    //string functions - length, get()
    val length: Int=s.length
    val ind:Char =s.get(6)
    val sub = s.subSequence(0,8)

    //$__ is a string template
    println("length of string is $length")
    println("char after getting is $ind")
    println("Substring is $sub")
}