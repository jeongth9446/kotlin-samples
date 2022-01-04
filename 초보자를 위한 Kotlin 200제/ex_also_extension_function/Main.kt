package ex_also_extension_function

class Person {
  var name: String = ""
  var age: Int = 0
  var money: Int = 0
  
  override fun to String() = "$name $age $money"
}

fun main(args: Array<String>) {
  println(
    Person().also { person: Person ->
      person.name = "Alan"
      person.money = 70
    }
  )
}
    
