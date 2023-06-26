//Program to demonstarte on CRUD using JPA with hibernate
package org.tnsif.client;

import org.tnsif.entities.*;
import org.tnsif.services.*;

public class Client {

	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeServiceImpl();
		Employee emp = new Employee();
		
		//create
		/*emp.setId(102);
		emp.setName("Parbal Nair");
		service.createEmployeee(emp);
		
		System.out.println("The Data is added Sucessfully");*/
		
		//update
		
		/*emp = service.retriveEmployee(101);
		emp.setName("Niket K");
		service.updateEmployee(emp);
		
		System.out.println("The Data is updated Sucessfully");*/
		
		//delete
		
		/*emp = service.retriveEmployee(101);
		service.removeEmployee(emp);
		System.out.println("The Data is deleted Sucessfully");*/
		
		//retrive
		
		emp = service.retriveEmployee(102);
		System.out.println("Employee Id : " + emp.getId());
		System.out.println("Employee Name : " + emp.getName());
		
		
		
		

	}

}
