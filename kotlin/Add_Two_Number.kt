package kotlin

class AddTwoNumber(a: Int, b: Int) {
    private var numberOne: Int = a;
    private var numberTwo: Int = b;

    fun addTwoNumber(): Int {
        return numberOne + numberTwo
    }
}

fun main() {
    val addNumber = AddTwoNumber(1, 2)
    println("Add two numbers:")
    println("${addNumber.addTwoNumber()}")
}