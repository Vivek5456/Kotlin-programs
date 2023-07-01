open class Animals(var legs: Int, var color:String){
    fun eat(){
        println("I eat food")
    }

    fun sleep(){
        println("I sleep")
    }
}

class Dogs(legs:Int, color:String):Animals(legs,color){
    fun bark(){
        println("I bark")
    }

}

class Cats(legs: Int,color: String):Animals(legs,color){
    fun purr(){
        println("I purr ")
    }
}

fun main(){
    val dog1=Dogs(legs=4,color="Brown")
    dog1.bark()
    dog1.eat()
    dog1.sleep()

    val cat1=Cats(legs = 4, color = "White")
    cat1.purr()
    cat1.eat()
    cat1.sleep()
}