class CheckingAccount(
    name: String,
    accountNumber: Int
) : Account(
    name = name,
    accountNumber = accountNumber
) {
    override fun withdraw(value: Double) {
        val valueWithTax = value + 0.1
        super.withdraw(valueWithTax)
    }
}