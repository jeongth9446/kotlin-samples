package ex_abstract_class

import java.beans.PropertyEditor

//단순히 학생, 교수, 직원 클래스를 하나의 타입으로 묶어주는 클래스
abstract class Person {
    abstract fun getSalary(): Int
}


//학생 클래스, tuition는 한 학기 등록금
class Student(private val tuition: Int) : Person() {
    //학생은 등록금을 납부하므로 salary를 음수처리
    override fun getSalary() = -tuition
}

//교수 클래스, classCount는 진행하는 수업의 수
class Professor(private val classCount: Int):Person() {
    override fun getSalary() = classCount * 200
}

//학교 직원 클래스. initial은 초봉(반기), years는 경력(년)
class Employee(private val initial: Int, private val years: Int): Person() {
    override fun getSalary() = initial * (1.0 + years/10.0).toInt()
}

//구성원으로부터 학교의 재정을 구한다.
fun getFinance(vararg persons: Person):Int {
    var i = 0
    var finance = 0
    while(i < persons.size) {
        finance -= persons[i].getSalary()
        i += 1
    }
    return finance
}

fun main(args: Array<String>) {
    val finance = getFinance(Student(330), Student(330), Professor(1),Professor(2), Employee(1300, 2))
    println("학교 재정: $finance 만원")
}