fun main(){
    val names = arrayOf("Mohacel", "Reznu", "Asadu", "Adi")
    println(names.contentToString())

    names[0]="Mohacel Hosen"

    for(singleName in names){
        val userName = "Reznu"
        if(userName == singleName){
            println("$userName exist in  ${names.indexOf(userName)+1} position")
            break
        }
    }
}