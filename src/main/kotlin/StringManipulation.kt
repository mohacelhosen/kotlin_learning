// String template
fun main(){
    val fname = "Mohacel"
    val lname = "Hosen"
    val fullName = "$fname $lname"

    val user = """
        name: %s,
        age: %d,
        status: single
    """.trimIndent()

    println(user.format(fullName,24))


    val cat1 = "Tommy"
    val cat2 = "Jerry"
    val cat3 = "Tommy"
    val cat4 = String("Tommy".toCharArray())

    println("$cat1 == $cat2  check content(==)::  ${cat1==cat2}")
    println("$cat1 == $cat3 ::  ${cat1==cat3}")
    println("$cat1 == $cat4 ::  ${cat1==cat4}")

    println("--------------------------------------------")
    println("$cat1 (${System.identityHashCode(cat1)}) === $cat2 (${System.identityHashCode(cat2)})  check content & Reference(===)::  ${cat1===cat2}")
    println("$cat1 (${System.identityHashCode(cat1)}) === $cat3 (${System.identityHashCode(cat3)}) ::  ${cat1===cat3} ")
    println("$cat1 (${System.identityHashCode(cat1)}) === $cat4 (${System.identityHashCode(cat4)}) ::  ${cat1===cat4}")
    println("--------------------------------------------")

    //proxy for the memory address
    println("Memory address of cat1: ${System.identityHashCode(cat1)}")
    println("Memory address of cat2: ${System.identityHashCode(cat2)}")
    println("Memory address of cat3: ${System.identityHashCode(cat3)}")
    println("Memory address of cat4: ${System.identityHashCode(cat4)}")
    println("--------------------------------------------")

    println(cat1.equals(cat4))
}