package org.tnsif.tableperclassinheritance;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Person")
public class Person extends Citizen {
	
	private String name;
	private long contactNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	
	

}
