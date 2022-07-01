package rsk

import org.omg.CORBA.Object

fun main(args: Array<String>) {

    val ints = listOf(1, 2, 3, 4, 5)

    val smallInts = ints.filter { it < 5 }
    //for (i: Int in smallInts) println(i)

    val squaredInts = ints.map { it * it }
    //for (i in squaredInts) println(i)

    val smallSquaredInts = ints
                            .filter { it < 5 }
                            .map { it * it }

    //for(i in smallSquaredInts) println(i)
    val meetings = listOf(MeetingA(1,"Board Meeting"), MeetingA(2,"Committee Meeting"))
    val people = listOf(Person("Sam"),Person("Alex"))
//    var titles = meetings
//        .filter {it -> it.title.startsWith("C")}
//        .map{it -> it.title}
//
//    for(i in titles) println(i)

}

class MeetingA(val id:Int,val title:String){

}

class Person(val name:String){

}


//    var program = Program()
//    var total = 0
//   // program.fibonacci(8)
////    program.fibonacci(8,object : Process{
////        override fun execute(value: Int) {
////            println(value)
////        }
////
////    })
////    program.fibonacci(8){n -> println(n)}
////    program.fibonacci(8) {println(it)}
////    program.fibonacci(8,::println)
//    program.fibonacci(8) {it -> total += it}
//    println(total)

//
//interface Process{
//    fun execute(value:Int)
//}
//
//class Program{
//
//
//    fun fibonacci(limit:Int,action: (Int) -> Unit){
//        var prev = 0
//        var prevprev = 0
//        var current = 1
//
//        for(i:Int in 1..limit){
//            action(current)
//
//            var temp = current
//            prevprev = prev
//            prev = temp
//            current = prev + prevprev
//        }
//    }
//
//
//    fun fibonacci(limit:Int,action:Process){
//        var prev = 0
//        var prevprev = 0
//        var current = 1
//
//        for(i:Int in 1..limit){
//            action.execute(current)
//
//            var temp = current
//            prevprev = prev
//            prev = temp
//            current = prev + prevprev
//        }
//    }
//}