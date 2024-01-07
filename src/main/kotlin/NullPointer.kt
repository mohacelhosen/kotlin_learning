
fun main(){

    var fullName:String?= "Mohacel Hosen"

    println("Full name:: $fullName")
    println("Total Character:: "+fullName?.length)
    println("Upper Case:: "+fullName?.uppercase())
    println("Lower Case:: "+fullName?.lowercase())

    if (fullName != null) {
        println("Access 6th character:: "+fullName.getOrNull(5))
    }

    println("Access 16th character:: "+fullName?.getOrNull(15))

    println("Access 20th character:: "+fullName?.getOrNull(19))
}
