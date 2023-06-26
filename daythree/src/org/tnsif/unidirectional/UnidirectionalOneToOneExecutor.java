package org.tnsif.unidirectional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class UnidirectionalOneToOneExecutor {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Customer c = new Customer();
		c.setCustomername("Niket");
		
		Address a = new Address();
		a.setPincode(401501);
		a.setCity("Boisar");
		a.setArea("Bhimnagar");
		
		c.setAddress(a);
		em.persist(c);
			
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();
		
		
	}

}
