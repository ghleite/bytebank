fun main() {
    println("Seja bem vindo ao Byte Bank")

    for(i in 1..3) {
        val titular = "Joe $i"
        val accountNumber = 1234 + i
        var balance = 0.0 + i
        balance += 100.0

        println("titular: $titular")
        println("numero da conta: $accountNumber")
        println("saldo: $balance")

        validateBalance(balance)
    }

    for(i in 5 downTo 1 step 2) {
        println(i)
    }


}

fun validateBalance(balance: Double) {
    when {
        balance > 0.0 -> println("saldo é positivo")
        balance == 0.0 -> println("sem saldo")
        else -> println("saldo é negativo")
    }
}
