data class restaurants(var name : String,var rating :Double,var costForOne :Int)
fun main(){
    val res1 =restaurants(name="LoD",rating=4.1, costForOne=200)
    val res2 =restaurants(name="Promise",rating=3.9, costForOne=150)
    val res3 =restaurants(name="Sugar King",rating=4.0, costForOne=250)
    val res4 =restaurants(name="Maco Bell",rating=4.3, costForOne=400)
    val res5 =restaurants(name="Hubway",rating=1.5, costForOne=200)

    var restaurantlist=mutableListOf(res1,res2,res3,res4,res5)

    for (res in restaurantlist){
        println(res)
    }
}