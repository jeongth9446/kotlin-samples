fun main(args: Array<String>) {
    var isRight: Boolean = (10 + 70) > (3*25)
    println(isRight)

    isRight = false
    println(isRight)

    isRight = 30 == (10+20)
    println(isRight)

    isRight = 0.00001f == 0.0005f*0.0002f //수학적으로는 true지만, 실수 연산이기 때문에 정확하게 비교할 수가 없다.
    println(isRight)

    isRight = 3.0*5 + 2.7 <= 16
    println(isRight)

}