
fun main(){
    val gender = 'M'
    when(gender){
        'F'-> println("It's a Female")
        'M'-> println("It's a Male")
        else -> println("Unknown gender")
    }

    val person = "Mohacel"
    val friend =when(person){
        "Mohacel"->"It's my Friend"
        "Tushar"->"It's a Friend"
        else ->{"Unknown person"}
    }

    println(friend)

    val age = 24
    when{
        (age>18)-> println("Adult")
        (age==18)-> println("Congratulations")
        (age<18) -> println("Child")
    }

    when(age){
        in 13..19-> println("Teenager")
        in 0..12 -> println("Child")
        !in 20..45 -> println("old")
        else-> println("Adult")
    }
}