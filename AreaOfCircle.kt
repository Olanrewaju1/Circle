import kotlin.math.PI

// App to calculate the radius of a circle
fun main(){
    print("Input the value of radius: ")
    val radius = readln().toDouble()
    val areaOfCircle = PI * radius * radius
    println("The area of the cicle of radius $radius is $areaOfCircle")

}