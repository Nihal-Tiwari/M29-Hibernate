package org.tnsif.services;

import org.tnsif.entities.Employee;

public interface EmployeeService {
	
	void createEmployeee(Employee emp);//create
	Employee retriveEmployee(int id);//retrive
	void updateEmployee(Employee emp);//update
	void removeEmployee(Employee emp);//delete

}
