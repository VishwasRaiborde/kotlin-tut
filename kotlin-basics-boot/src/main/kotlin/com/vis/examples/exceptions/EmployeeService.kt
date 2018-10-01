package com.vis.examples.exceptions

import com.vis.examples.dao.*;

class EmployeeService {

	var employeeDao = EmployeeDao();

	//EmployeeData? this "?" indicates that the return type can be null 
	fun getEmployeeById(empId: Int): EmployeeData? {
		try {
			return employeeDao.getEmployeesByID(empId)
		} catch (e: EmployeeNotFoundException) {
			return null
		}
	}
}
