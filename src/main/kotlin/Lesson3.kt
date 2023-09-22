import kotlin.math.sqrt

fun printStar():Unit{
    for (i in 1..60)
        print("*")
}
fun piramid()
{
    for(i in 1..10) {
        for (j in 1..i)
            print("*")
        println()
    }

}
fun main()
{
    printStar()
    piramid()
    println(Line(2.0,3.0,9.0,7.0)+Line(6.0,6.0,3.0,12.0)+
    Line(8.0,7.9,5.0,1.0))
    var line=fun(x1:Double,y1:Double,x2:Double,y2:Double):Double=
        sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))
    println(line(5.0,7.8,7.2,9.0))
}
fun Line(x1:Double,y1:Double,x2:Double,y2:Double)= sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));