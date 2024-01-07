
fun main(){
    val nameList= ArrayList<String>(listOf("Mohacel", "Asadu", "Adi"))
    println(nameList.toString())
    nameList.add("Reznu")
    println(nameList)

    val (firstPerson, secondPerson, _, fourthPerson) = nameList
    println(firstPerson)
    println(fourthPerson)
}