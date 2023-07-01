interface MyInterface{
    fun hello()

    fun greeting()= println("Hello There")
}

interface NewInterface{
    fun NewMethod()
}
class CallMe: MyInterface,NewInterface{
    override fun hello() {
        println("Function Hello is called here")
    }

    override fun greeting() {
        println("Greeting function is called here")

    }

    override fun NewMethod() {
        println("NewMethod function is called here")
    }
}

fun main(){
    val a= CallMe()

    a.hello()
    a.greeting()
    a.NewMethod()
}