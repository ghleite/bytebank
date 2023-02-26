open class Employee(
    val name: String,
    val cpf: String,
    open val salary: Double
) {

    open val bonification: Double
        get() {
            return salary * 0.1
        }

}