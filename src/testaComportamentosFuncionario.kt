fun testaComportamentosFuncionario() {
    println("Seja bem vindo ao Byte Bank")

    val john = Employee(
        name = "roberto",
        cpf = "111.111.111-11",
        salary = 1000.0
    )

    println("nome: ${john.name}")
    println("cpf: ${john.cpf}")
    println("salary: ${john.salary} ")
    println("bonfication: ${john.bonification}")

    val mary = Manager(
        name = "mary",
        cpf = "111.111.111-11",
        salary = 1000.0,
        password = "123456"
    )

    println("nome: ${mary.name}")
    println("cpf: ${mary.cpf}")
    println("salary: ${mary.salary} ")
    println("bonfication: ${john.bonification}")

    val calculadora = CalculadoraBonificacao()
    calculadora.register(john)
    calculadora.register(mary)

    println(calculadora.total)
}

fun validateBalance(balance: Double) {
    when(balance) {
        1.0 -> println("saldo é positivo")
        0.0 -> println("sem saldo")
        else -> {
            println("saldo é negativo")
        }
    }
}