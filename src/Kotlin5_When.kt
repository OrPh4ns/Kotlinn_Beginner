fun main() {

    var age:Int = 10

    when(age){
        2->{ println("Falsch")}
        5->{
            println("$age is currect ..")}
        else->{
            println("False")}
    }

    if(age==5){
        print("Age is $age")
    }else if(age>5){
        print("age is bigger then 5")
    }

}