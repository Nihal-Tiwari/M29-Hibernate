package org.tnsif.tableperclassinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TablePerClassInheritance {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		//create Citizen 1
		Citizen c=new Citizen();
		c.setAadharNo(25747445044732L);
		c.setCity("Boisar");
		c.setArea("Bhimnagar");
		em.persist(c);
		
		//create Citizen 2
		Citizen c1=new Citizen();
		c1.setAadharNo(25747445325732L);
		c1.setCity("Mumbai");
		c1.setArea("Bandra");
		em.persist(c1);
				
		//create Manager 1
		Person p=new Person();
		p.setAadharNo(72453243443L);
		p.setCity("Mumbai");
		p.setArea("Dadar");
		p.setContactNo(9854341354L);
		p.setName("Niket Kamble");
		em.persist(p);
				
		em.getTransaction().commit();
		System.out.println("Data is added successfully");
		em.close();
		factory.close();
		
	}

}

