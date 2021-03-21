import java.lang.reflect.Array
import java.util.*

fun main(){
names()
cities()
    numbers()
    name()
}
fun names(){
    var sirnamesArray= arrayOf("Omondi","Muturi","Mutuku","Wafula")
    println(Arrays.toString (sirnamesArray))
}
fun cities(){
    var cities = arrayOf("harare ", "mumbai ", "dodoma ", "jakarta ")
    for (cities in cities){
        println(cities.capitalize())
    }
}
fun numbers(){
    var numbersArray = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var sum= numbersArray[1].plus(numbersArray[4])
    println(sum)
    var index= numbersArray.indexOf(158)
    println(index)
    var accendingNumbers = numbersArray.sortedArray()
    println(Arrays.toString(accendingNumbers))
}
fun name(){
    var nameArrays= arrayOf("Caroline", "Chelugoi", "Salim",)
println(Arrays.toString(nameArrays))
}

