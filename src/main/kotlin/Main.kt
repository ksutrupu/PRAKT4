fun main(){
    println("Введите целые значения a и b: ")
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()

    if (a%b == 0) {
        println("a делится на b")
    }
    else{
        println("a не делится на b")
        println("Остаток: ${a%b}")
    }
    println("Частное: ${a/b}")
}