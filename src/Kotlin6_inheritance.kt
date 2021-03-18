open class Person{

    var name: String? = null
    var age: Int? = null
    constructor(name:String, age:Int){
        this.name = name
        this.age = age
    }
    fun ms(show:String){
        println("I'm a $show")
    }

}
class Student(name: String, age: Int) : Person(name, age){

    fun msg(){
        println("I'm a student")
    }
}

fun main() {
    var p1 = Student("Ali",32)
    p1.msg()
    p1.ms("Ali")

}