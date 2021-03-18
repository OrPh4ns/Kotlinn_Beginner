class Kotlin3_classes {

    var name:String?= null
    var age:Int? = 0
    constructor(){
    }

    constructor(name:String,age:Int){
        this.name = name
        this.age = age
    }

    fun getInfo() {
        println("Name is : ${this.name} and age is : ${this.age}")
    }

    fun SetInfo(name:String,age: Int){
        this.name = name
        this.age = age
    }


}