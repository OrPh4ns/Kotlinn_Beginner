fun main() {

    try {
        for (n in -10..5){
            print(10/n)
            print(", ")
        }

    }catch (ex:Exception){
        println()
        println("there is a problem")
        print(ex.message)
    }
}