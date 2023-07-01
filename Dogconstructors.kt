class Dog(var breed:String, var color:String, var age:Int){
    fun eat(){
        println("${breed}s eat food")
    }

    fun bark(){
        println("${breed}s bark")
    }
}

fun main(){
    val dog1=Dog(breed="Labrador",color="Brown",age=3)
    dog1.eat()
    dog1.bark()

    val dog2=Dog(breed="German Shepherd", color= "Black",age=2)
    dog2.eat()
    dog2.bark()
}