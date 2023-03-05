fun main() {
    val josephAccount = SavingAccount("joseph", 12345)
    val saraAccount = CheckingAccount("sara", 12346)

    println("Joseph Account balance = ${josephAccount.balance}")
    println("Sara Account balance = ${saraAccount.balance}")

    josephAccount.withdraw(20.0)
    saraAccount.withdraw(10.0)

    println("Joseph Account balance = ${josephAccount.balance}")
    println("Sara Account balance = ${saraAccount.balance}")

    josephAccount.transfer(100.0, saraAccount)

    println("Joseph Account balance = ${josephAccount.balance}")
    println("Sara Account balance = ${saraAccount.balance}")
}


