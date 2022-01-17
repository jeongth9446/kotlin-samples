package ex_suspending_functions

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


suspend fun simple(): List<Int> {
    delay(1000)
    return listOf(1, 2, 3)
}

fun main() = runBlocking<Unit> {
    simple().forEach { value -> println(value) }
}