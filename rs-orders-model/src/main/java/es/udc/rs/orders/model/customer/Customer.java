package es.udc.rs.orders.model.customer;

import java.util.Calendar;

public class Customer {

    private Long customerId;
    private String name;
    private String dni;
    private String address;
    private Calendar creationDate;
    private String email;
    

	public Customer(String name, String dni, String address, String email) {
		super();
		this.name = name;
		this.dni = dni;
		this.address = address;
		this.email = email;
	}


	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Calendar getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Calendar creationDate) {
		this.creationDate = creationDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}