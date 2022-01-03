fun main(args: Array<String>) {
    val a = readLine()!!.split(" ").map {it.toInt()}

    var s = 0

    for(i in a) {
        s += i;
    }
    println(s)
}