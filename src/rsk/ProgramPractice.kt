package rsk

fun main(args: Array<String>) {
    var mike = Human()
    mike.getHuman("Mike",object:Gender{
        override fun getGender(): String {
            return "Male"
        }
    })
}

interface Gender{
    fun getGender():String
}

class Human{

    fun getHuman(name:String,gender:Gender){
        println("Name: $name")
        var g = gender.getGender()
        println("Gender: $g")
    }



}
