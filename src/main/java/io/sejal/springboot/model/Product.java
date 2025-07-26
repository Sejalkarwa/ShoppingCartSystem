package io.sejal.springboot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Product {
@Id
private long id;
private String name;
private String description;
private double price;
private int stock;

public Long getId() {
	return id;
}
}
