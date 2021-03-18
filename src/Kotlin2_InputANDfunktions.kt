



    fun add(x:Int, y: Int){
        print(x+y)
    }

    fun input_add(){
        print("Enter n1 >> ")
        var a1 = readLine()!!.toInt()
        print("Enter n2 >>")
        var a2 = readLine()!!.toInt()
        var sum = a1 + a2
        print("Summ is >> "+sum)
    }

    fun for_loop(){
        for (n in 1..5){
            println("Numer ist > > $n")
        }
    }

    fun while_loop(){
        var n = 5
        while(n>0){
            println(n)
            n--
        }
    }
    
    fun main(args:Array<String>){

        println()
        print("Enter Num 1 > ")
        var num1 = readLine()?.toInt()
        print("Enter Num 2 > ")
        var num2 = readLine()?.toInt()
        print("Addition is >> "+num1+num2)


        //add(5,6)
        //input_add()
        for_loop()
        //while_loop()
        //arr()
    }
