open class Account(var name: String, var accountNumber: Int) {

    var balance = 0.0
        private set

    fun deposit(value: Double) {
        this.balance += value
    }

    open fun withdraw(value: Double) {
        this.balance -= value
    }

    fun transfer(value: Double, destiny: Account): Boolean{
        if(this.balance >= value) {
            this.balance -= value
            destiny.balance += value
            return true
        } else {
            return false
        }
    }
}