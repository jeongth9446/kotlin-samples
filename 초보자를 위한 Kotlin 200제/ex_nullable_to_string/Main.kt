package ex_nullabe_to_string

fun main(args: Array<String>) {
  val empty: Int? = null
  val str: String = empty.toString()
  println(str)
}
