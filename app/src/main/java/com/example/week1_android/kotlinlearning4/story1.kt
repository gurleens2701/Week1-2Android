package com.example.week1_android.kotlinlearning4;

// package com.microsoft.myapplication;
// Paste in Kotlin file and it will give you an option to convert
object Story1 {
    // this part makes code very difficult to understand due to if statements
    fun printEmployeeSalary(employee: Employee) {
        if (employee.employeeType == "Contractor") {
            println("Contractor Salary: $100,000")
        } else if (employee.employeeType == "Full Time") {
            println("Full Time Salary: $150,000")
        } else if (employee.employeeType == "Intern") {
            println("Intern Salary: $50,000")
        }
    }

    fun printHelloWorld() {
        for (i in 1..5) {
            println("Hello World$i") // concatenation
        }
    }

    fun calculate(input1: Int, input2: Int): Int { // returninng int trasnferring to a variabl
        return input1 + input2
    }

    fun calculate2(a: Int, b: Int) {
        println(a + b)
    }
}


// blue print of data which represents an employee with employee data
open class Employee(// data
    private var employeeName: String, // full-time, intern, contractor
    var employeeType: String, private var employeeId: Int
) {
    // parameter / argument
    init {
        employeeName = employeeName
    }

    // toString() -> method
    override fun toString(): String {
        return "Employee Name: $employeeName\nEmployee First Character: $employeeType\nEmployee ID: $employeeId"
    }
}

internal class Contractor(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    private var salary = "$100,000"
    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
}

// Intern & Full-time
internal class Intern(employeeName: String, employeeType: String, employeeId: Int) :
    Employee(employeeName, employeeType, employeeId) {
    private var salary = "$50,000"
    override fun toString(): String {
        return """${super.toString()}
 Salary = $salary"""
    }
}

class FullTime extends Employee {

    val salary = "$150,000"

    fun FullTime(employeeName: String?, employeeType: String?, employeeId: Int) {
        super(employeeName, employeeType, employeeId)
    }

    fun toString(): String? {
        return super.toString() + "\n Salary = " + salary
    }
