package com.vis.examples.loops

import java.util.ArrayList
import com.vis.examples.dao.EmployeeDao
import com.vis.examples.dao.EmployeeData

class KotlinLoops {

	fun getEmployeesWithForLoop() {
		var employeedao = EmployeeDao()
		var listOfEmployees: ArrayList<EmployeeData> = employeedao.getEmployees()

		for (employee in listOfEmployees) {
			println(employee)
		}
	}

	fun getEmployeesWhileLopp() {
		var employeedao = EmployeeDao()
		var listOfEmployees: ArrayList<EmployeeData> = employeedao.getEmployees()

		var i = 0;
		while (listOfEmployees.get(i) != null) {
			var emp = listOfEmployees.get(i);
			println(emp.toString())
			i++;
		}
	}

	fun getEmployeesWithDoWhileLoop() {
		var employeedao = EmployeeDao()
		var listOfEmployees: ArrayList<EmployeeData> = employeedao.getEmployees()

		var i = 0;
		do {
			var emp = listOfEmployees.get(i);
			println(emp.toString())
			i++
		} while (listOfEmployees.get(i) != null)
	}

	fun getEmployeesWithForEachLoop() {
		var employeedao = EmployeeDao()
		var listOfEmployees: ArrayList<EmployeeData> = employeedao.getEmployees()

		listOfEmployees.forEach {
			println(it.toString())
		}
	}

	fun getEmployeesWithForLoopWithIndices() {
		var employeedao = EmployeeDao()
		var listOfEmployees: ArrayList<EmployeeData> = employeedao.getEmployees()

		for (i in listOfEmployees.indices) {
			print(listOfEmployees[i])
		}
	}

}

fun main(args: Array<String>) {
	KotlinLoops().getEmployeesWithForEachLoop()
}