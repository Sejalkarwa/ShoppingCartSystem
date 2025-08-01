package io.sejal.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
// @Data  // no need to add manually getter and setter
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String password;
	private String address;
	private String contactNo;
	
	@OneToOne(mappedBy = "user" )
	private Cart cart;
	
	 public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getContactNo() {
	        return contactNo;
	    }

	    public void setContactNo(String contactNo) {
	        this.contactNo = contactNo;
	    }

	    public Cart getCart() {
	        return cart;
	    }

	    public void setCart(Cart cart) {
	        this.cart = cart;
	    }
	}
