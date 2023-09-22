import kotlin.random.Random
fun main()
{
    val numbers1=arrayOf(1,3,5,5)
    val number2=Array(10) { 5 }
    for (i in numbers1.indices)
        println(numbers1[i].toString()+" ")
    for (i in numbers1)
    {
        print("$i ")
    }
    println()
    println(10 in number2)
    println(10 !in number2)
    var rand= Random
    var number3=Array(10) {rand.nextDouble()}
    for (i in number3.indices)
        print(String.format("%.2f ",number3[i]))
}