 import java.util.Scanner
fun main(args: Array<String>) {
    var reader = Scanner(System.`in`)
    var mark:Int = reader.nextInt()

    if(mark>=80){
        println("oy 'A+' paise")
    }else if(mark>=70) {
        println("oy 'A' paise")
    }else if(mark>=60) {
        println("oy 'A-' paise")
    }else if(mark>=50) {
        println("oy 'B' paise")
    }else if(mark>=40) {
        println("oy 'C' paise")
    }else if(mark>=33) {
        println("oy 'D' paise")
    }else {
        println("tmi FAIL, ei next... ")
    }
}