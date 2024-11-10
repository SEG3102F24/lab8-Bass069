package seg3x02.employeeGql.resolvers


data class CreateEmployeeInput(
    val firstName: String,
    val lastName: String,
    val position: String,
    val salary: Double
)
