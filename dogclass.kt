class Dog{
    var breed: String="German Shepherd"
    var color: String="Brown"
    var age:Int= 3

    fun eat(){
        println("${breed}s eat food")
    }

    fun bark(){
        println("${breed}s bark")
    }
}

fun main(){
    val dog1=Dog()

    dog1.breed="Labrador"
    dog1.color="Black"
    dog1.age=1

    println("The breed of the dog is ${dog1.breed} whose color is ${dog1.color} and is of ${dog1.age} years")


    dog1.eat()
    dog1.bark()
}


