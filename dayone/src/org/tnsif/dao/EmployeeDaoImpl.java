package org.tnsif.dao;

import javax.persistence.EntityManager;

import org.tnsif.entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	private EntityManager em;
	
	public EmployeeDaoImpl() 
	{
		em = JPAUtil.getEntityManager();		
	}

	//create or add
	@Override
	public void addEmployeee(Employee emp) {
		em.persist(emp);
		
	}

	//Retrive
	@Override
	public Employee getEmployee(int id) {
		
		Employee emp = em.find(Employee.class, id);		
		return emp;
	}

	//update
	@Override
	public void updateEmployee(Employee emp) {
		em.merge(emp);
		
		
	}

	//delete
	@Override
	public void deleteEmployee(Employee emp) {
		em.remove(emp);
	}

	@Override
	public void beginTransaction() {
		
		em.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}

}
