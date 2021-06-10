// make a string with name we can use to refer to it
val ADD: String = "+"
val SUBTRACT = "-"
val MULTIPLY = "*"
val DIVIDE = "/"

val ERROR_MESSAGE = "An error has occurred."

//create two test operands to see if program works properly
val testOperandOne: Double = 5.0
val testOperandTwo: Double = 4.0

fun main(args: Array<String>) {
    val operatorSymbol = args[0]

    start(operatorSymbol)
}

fun start(operatorSymbol: String) {
    if (checkArguments(operatorSymbol)) {
       displayResult(
           evaluateBinomial(testOperandOne, testOperandTwo, operatorSymbol)
       )
    } else {
        displayResult(
            ERROR_MESSAGE
        )
    }

}

//single expression syntax for single line code snippets
fun displayResult(result: String) = System.out.println(result)

fun evaluateBinomial(opOne: Double, opTwo: Double, sym: String):String {
    return when (sym) {
        ADD -> (opOne + opTwo).toString()
        SUBTRACT -> (opOne - opTwo).toString()
        MULTIPLY -> (opOne * opTwo).toString()
        DIVIDE -> (opOne / opTwo).toString()

        else -> ERROR_MESSAGE
    }
}

//returns boolean based on if the operator matches constants
fun checkArguments(operatorSymbol: String): Boolean {
   return when (operatorSymbol) {
        ADD -> true
        SUBTRACT -> true
        MULTIPLY -> true
        DIVIDE -> true

       else -> false
    }
}