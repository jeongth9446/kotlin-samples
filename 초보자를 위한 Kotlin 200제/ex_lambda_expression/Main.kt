package ex_lambda_expression

fun main(args: Array<String>) {
    var instantFunc: (Int) -> Unit
    instantFunc = { number: Int ->
        println("Hello $number")
    }

    instantFunc(33)
    instantFunc.invoke(33)
}