fun main(args: Array<String>) {
    var ch: Char = 'A'
    println(ch)

    ch = '\uAC00'
    println(ch)

    ch = '한'
    println(ch.toInt()) //char.toInt() : 유니코드 값으로 변경

}