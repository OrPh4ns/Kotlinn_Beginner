open class Operation{
    open fun sum(a:Int, b:Int):Int{
        return a+b
    }
}

class Sub_Operration(): Operation() {
    override fun sum(a:Int, b:Int):Int{
        return a+b+5
}
}