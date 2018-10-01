package com.vis.examples.dao

import java.util.ArrayList
import com.vis.examples.exceptions.EmployeeNotFoundException

class EmployeeDao {

	fun getEmployees(): ArrayList<EmployeeData> {

		var employee1000 = EmployeeData(firstName = "vishwas", lastName = "raiborde", designation = "developer", empID = 1000)
		var employee1001 = EmployeeData(firstName = "vishwas", lastName = "raiborde", designation = "developer", empID = 1001)
		var employee1002 = EmployeeData(firstName = "vishwas", lastName = "raiborde", designation = "developer", empID = 1002)
		var employee1003 = EmployeeData(firstName = "vishwas", lastName = "raiborde", designation = "developer", empID = 1003)
		var employee1004 = EmployeeData(firstName = "vishwas", lastName = "raiborde", designation = "developer", empID = 1004)

		val arrayOfEmployees: ArrayList<EmployeeData> = ArrayList<EmployeeData>()
		arrayOfEmployees.add(employee1000)
		arrayOfEmployees.add(employee1001)
		arrayOfEmployees.add(employee1002)
		arrayOfEmployees.add(employee1003)
		arrayOfEmployees.add(employee1004)

		return arrayOfEmployees
	}

	fun getEmployeesByID(empID: Int): EmployeeData?{

		var employee1000 = EmployeeData(firstName = "vishwas", lastName = "raiborde", designation = "developer", empID = 1000)
		var employee1001 = EmployeeData(firstName = "vishwas", lastName = "raiborde", designation = "developer", empID = 1001)
		var employee1002 = EmployeeData(firstName = "vishwas", lastName = "raiborde", designation = "developer", empID = 1002)
		var employee1003 = EmployeeData(firstName = "vishwas", lastName = "raiborde", designation = "developer", empID = 1003)
		var employee1004 = EmployeeData(firstName = "vishwas", lastName = "raiborde", designation = "developer", empID = 1004)

		val arrayOfEmployees: ArrayList<EmployeeData> = ArrayList<EmployeeData>()
		arrayOfEmployees.add(employee1000)
		arrayOfEmployees.add(employee1001)
		arrayOfEmployees.add(employee1002)
		arrayOfEmployees.add(employee1003)
		arrayOfEmployees.add(employee1004)


		arrayOfEmployees.forEach {
			if (it.empID == empID) {
				// smart cast to EmployeeData it is an implicit object provided with foreach
				return it
			} else {
				throw EmployeeNotFoundException("we just fired him sorry!!!")
			}
		}
		
		//why this 
		return null
	}

}