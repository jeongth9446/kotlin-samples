package ex_const

const val hello = "Hello " + "world!"

object Foo {
    const val bar = "bar"
}

fun main(args: Array<String>) {
    println(hello)
    println(Foo.bar)
    println(hello)
    println(Foo.bar)
}