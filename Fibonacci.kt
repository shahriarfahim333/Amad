fun main(args: Array<String>) {
    var n = 10
    var first = 0
    var second = 1
    var fibo = 0

    print("${first} ${second} ")
    for(i in 3 .. n){
        fibo = first + second
        first = second
        second = fibo
        print("${fibo} ")
    }
}