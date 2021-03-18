
// Normal Array
fun arr(){
    val nums = arrayOf(1, 2, 3, 4, 5)
    println(nums[0])

    for(i in nums){
        println(i)
    }
}

// ArrayList

fun arr1(n:Int){
    var arr = ArrayList<String>()
    arr.add("Ali")
    arr.add("Mohammed")
    arr.add("Goerge")

    print(arr[n])
    arr.removeAt(n)
}


fun hash(){
    var m = HashMap<Int,String>()
    m.put(1,"Ali")
    m.put(2,"Goerge")

    println(m.get(2))
    print(m.keys)
}
fun main() {
    //arr()
    //arr1(1)
    hash()
}