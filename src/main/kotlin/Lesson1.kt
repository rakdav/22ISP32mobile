import java.util.Random


fun main(args: Array<String>) {
//    print("Введите ваше имя:")
//    var name= readln()
//    println("Привет, $name")
//    print("Введите a:")
//    var a = readln().toInt()
//    print("Введите b:")
//    var b = readln().toInt()
//    var S=a+b
//    println("$a+$b=$S")
//    print("Введите номер дня недели:")
//    val n= readln().toInt()
//    when(n)
//    {
//        1 -> println("Понедельник")
//        2 -> println("Вторник")
//        3->println("Среда")
//        4->println("Четверг")
//        5->println("Пятница")
//        6->println("Суббота")
//        7->println("Воскресенье")
//        else -> println("Нет такого дня")
//    }
    for (i in 1 until 10) {
        print(i.toString() + " ")
    }
    println()
    val r=1..8
    println(5 in r)
    println(12 !in r)

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
//    println("Program arguments: ${args.joinToString()}")
}