package org.tnsif.singletableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SingleTableInheritanceExecutor {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create Employee 1
		Employee emp=new Employee();
		emp.setEmpName("Niket Kamble");
		emp.setSalary(30000.0f);
		em.persist(emp);
		
		//create Employee 2
		Employee emp1=new Employee();
		emp1.setEmpName("Pratik Shinde");
		emp1.setSalary(40000.0f);
		em.persist(emp1);
				
		//create Manager 1
		Manager m=new Manager();
		m.setEmpName("Prabal Nair");
		m.setSalary(70000.0f);
		m.setDeptName("Human Resource");
		em.persist(m);
				
		em.getTransaction().commit();
		System.out.println("Data is added successfully");
		em.close();
		factory.close();
		
	}

}
