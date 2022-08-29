fun addition(n1 : Int, n2 : Int):Int{
    return n1+n2
}

fun addSingleLine(n1:Int, n2:Int) = n1+n2

fun main(){
    var names = arrayOf("Aditya", "Mayuri","Shruti","Pallavi","Vaishali")
    for (name in names){
        println(name)
    }

    var numbers = arrayOf(12,31,1,21,3,135)
    for(eachNumber in numbers){
        println(eachNumber)
    }
    //int [] numbers = {1,2,1,1}
}

fun main1() {
    var result1 = addSingleLine(11, 12)
    println("The result of addition is :$result1")

    println("20 + 40 = ${addSingleLine(20, 40)}")

    var data = 100
    println("data $data + 1 = ${data + 1}")
    println("Kotlin Day 1")
    //Type Inference
    var i: Int = 10       //to define a variable
    val j: Int = 20        //to define a constant

    var l: Long = 10.toLong()

    var num = 0b1011
    println("num is : $num")

    i++
    //j++
    println("The value of i is :" + i)
    println("The value of j is : $j")    //string templates

    var name: String = "Aishwarya Phatak"
    var companyName: String = "Bitcode Technologies"

    println("$name works with $companyName")
}

fun main2() {
    //Data Types
    var k: Int = 100
    var studentName: String = "Mayuri"
    var d: Double = 21.21
    var f: Float = 23.31F

    println("$k  --   $studentName    -- $d  -- $f")


    var result = addition(10, 10)
    println("The result of addition is : $result")
}