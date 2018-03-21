package com.diffblue.demo.tdd.models;

// Copyright 2016-2018 DiffBlue limited. All rights reserved.

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Internal representation of the Products. A product has: name - this cannot be
 * null (i.e. a product must have a name) id - this has the format PRODxxx where
 * xxx is a number, this is for integration with other systems
 */

@Entity
@Table(name = "products")
public class Product {

	@Column(name = "name")
	@NotEmpty
	private String name;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotEmpty
	private int id;

	@Column(name = "price")
	@NotEmpty
	private double price;

	@Column(name = "description")
	@NotEmpty
	private String description;

	public String getName() {
		return this.name;
	}

	/**
	 * Setter for name, ensure that the name is not blank.
	 * 
	 * @param newName
	 *            update name to this.
	 */

	public void setName(String newName) {
		if (!newName.isEmpty()) {
			this.name = newName;
		}
	}

	public int getId() {
		return this.id;
	}

	/**
	 * Update the ID, which must be PRODxxx (where x's are numbers)
	 * 
	 * @param newId
	 *            update id to this.
	 */

	public void setId(int newId) {
		this.id = newId;
	}

	public double getPrice() {
		return this.price;
	}

	/**
	 * Update the price.
	 * 
	 * @param price
	 *            new price.
	 * @return future proof and consistent with other setters
	 */

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 * Update the description.
	 * 
	 * @param description
	 *            new description.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		return id;
	}

	/**
	 * Update the product collection.
	 * 
	 * @param obj
	 *            new collection.
	 * @return future proof and consistent with other setters
	 */
	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj == null) {
			return result;
		}
		Product other = (Product) obj;
		return (this.id == other.id);
	}

}
