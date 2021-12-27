fun main(args: Array<String>) {
    val score = 88

    /*
    if (score >= 90) {
        println('A')
    }
    else {
        if(score >= 80) {
            println('B')
        } else {
            if(score >= 70) {
                println('C')
            }
            else {
                println('F')
            }
        }
    }
    */
    if(score >= 90)         println('A')
    else if(score >= 80)    println('B')
    else if(score >= 70)    println('C')
    else                    println('F')


}