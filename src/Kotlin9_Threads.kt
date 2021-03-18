class Threads: Thread(){
    override fun run() {
        var count = 0
        while (count <= 10){
            Thread.sleep(1500)
            println(count)
            count++
        }
        print("The End ./")
    }
}

fun main() {
    var t1 = Threads()
    t1.start()

}