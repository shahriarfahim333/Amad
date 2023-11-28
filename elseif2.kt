import java.util.Scanner
fun main(args: Array<String>) {

    var reader = Scanner(System.`in`)
    var y: Int = reader.nextInt()
    var u: Int = reader.nextInt()
    var i: Int = reader.nextInt()

    if (y > u && y > i)
    {
        println("y is greater")

    } else if (u > y && u > i)
        println("u is greater")

    if (i > y && i > u){
        println("I is greater")
    }




}
