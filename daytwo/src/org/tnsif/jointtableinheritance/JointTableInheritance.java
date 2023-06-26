package org.tnsif.jointtableinheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JointTableInheritance {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em=factory.createEntityManager();
		em.getTransaction().begin();
		
		Vehicle v=new Vehicle();
		v.setVehicleNo(1234);
		v.setSpeed(50);
		v.setPrice(425452.15f);
		v.setType("Four Wheeler");
		em.persist(v);
		
		Vehicle v1=new Vehicle();
		v1.setVehicleNo(7896);
		v1.setSpeed(60);
		v1.setPrice(543252.15f);
		v1.setType("Four Wheeler");
		em.persist(v1);
		
		Car c = new Car();
		c.setBrandName("BMW");
		c.setPrice(8000000.0f);
		c.setSpeed(100);
		c.setType("Four Wheeler");
		c.setVehicleNo(8523);
		em.persist(c);
		
		em.getTransaction().commit();
		System.out.println("The data is added successfully");
		em.close();
		factory.close();
		
		

	}

}
