
fun main(){
    var number1 = 13
    val number2 = 3
    println("$number1 + $number2 = ${number1 + number2}")
    println("$number1 - $number2 = ${number1 - number2}")
    println("$number1 * $number2 = ${number1 * number2}")
    println("$number1 / $number2 = ${number1 / number2}")
    println("$number1 % $number2 = ${number1 % number2}")


    println("Number1:: $number1")
    println("Number1:: ${++number1}")
    println("Number1:: ${number1++}")
    println("Number1:: $number1")

    println("Number1:: $number1")
    println("Number1:: ${--number1}")
    println("Number1:: ${number1--}")
    println("Number1:: $number1")

    println((50.toString()+50).toInt()+50)

    val result1 = if (number1>number2){
        "$number1 is greater than $number2"
    }else{
        "$number2 is greater than $number1"
    }

    val result2 = if(number1>number2)("$number1 is greater than $number2")else ("$number2 is greater than $number1")

    println(result1)
    println(result2)
}