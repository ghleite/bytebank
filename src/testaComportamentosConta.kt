fun testaComportamentosConta() {
    val joaoAccount = Account("Joao", 1234)
    joaoAccount.deposit(10.0)
    println(joaoAccount.balance)

    joaoAccount.deposit(100.0)
    println(joaoAccount.balance)

    joaoAccount.withdraw(50.0)
    println(joaoAccount.balance)

    val mariaAccount = Account("Maria", 1111)
    joaoAccount.transfer(20.0, mariaAccount)

    println(joaoAccount.balance)
    println(mariaAccount.balance)
}