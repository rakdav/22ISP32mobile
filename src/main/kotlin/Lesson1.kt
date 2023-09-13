import java.util.Random


fun main(args: Array<String>) {
//    print("Введите ваше имя:")
//    var name= readln()
//    println("Привет, $name")
//    print("Введите a:")
//    var a:Int = readln().toInt()
//    print("Введите b:")
//    var b:Int = readln().toInt()
//    var S=a+b
//    println("$a+$b=$S")
    var rand= Random()
    var arrDouble : DoubleArray
    var arrIntArray=IntArray(10,{rand.nextInt(100)})
    var arrStr: Array<String?>

    var array = Array(10,{i->(i*i).toString()})
    for(i in array)
    {
        print(i.toString()+" ")
    }
    println()
    for(i in arrIntArray)
    {
        print(i.toString()+" ")
    }

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
}