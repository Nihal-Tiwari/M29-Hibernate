package org.tnsif.dao;

import org.tnsif.entities.Employee;

public interface EmployeeDao {
	
	//User defined method for CRUD operation
	
	void addEmployeee(Employee emp);//create
	Employee getEmployee(int id);//retrive
	void updateEmployee(Employee emp);//update
	void deleteEmployee(Employee emp);//delete
	
	//JPA transaction
	void beginTransaction();//begin
	void commitTransaction();//close

}
