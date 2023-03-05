class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val password: String
) : Employee (
    name = name,
    cpf = cpf,
    salary = salary
){

    override val bonification: Double get() = super.bonification + 100
}