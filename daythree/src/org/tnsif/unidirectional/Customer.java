package org.tnsif.unidirectional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

@Entity
@Table(name = "Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int custId;
	private String customername;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	public Customer(int custId, String customername, Address address) {
		super();
		this.custId = custId;
		this.customername = customername;
		this.address = address;
	}
	
	public Customer() {
		System.out.println("Unidirectional One to one relationship");
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", customername=" + customername + ", address=" + address + "]";
	}

}
