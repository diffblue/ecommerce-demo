package com.diffblue.demo.ecommerce;

// Copyright 2016-2017 DiffBlue limited. All rights reserved.

import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Internal representation of the Products.
 * A product has:
 *   name - this cannot be null (i.e. a product must have a name)
 *   id   - this has the format PRODxxx where xxx is a number,
 *          this is for integration with other systems
 */

@Entity
@Table(name = "products")
public class Product {

  @Column(name = "name")
  @NotEmpty
  private String name;

  @Id
  @Column(name = "id")
  @NotEmpty
  private String id;

  @Column(name = "price")
  @NotEmpty
  private BigDecimal price;

  public String getName() {
    return this.name;
  }

  /**
   * Setter for name, ensure that the name is not blank.
   * @param newName update name to this.
   * @return success (true) or failure (false).
   */

  public boolean setName(String newName) {
    if (newName.isEmpty()) {
      return false;
    } else {
      this.name = newName;
      return true;
    }
  }

  public String getId() {
    return this.id;
  }

  /**
   * Update the ID, which must be PRODxxx (where x's are numbers)
   * @param newId update id to this.
   * @return success (true) or failure (false)
   */

  public boolean setId(String newId) {
    if (newId.length() != 7 ) {
      return false;
    } else {
      this.id = newId;
      return true;
    }
  }

  public BigDecimal getPrice() {
    return this.price;
  }

  /**
   * Update the price.
   * @param price new price.
   * @return future proof and consistent with other setters
   */

  public boolean setPrice(BigDecimal price) {
    this.price = price;
    return true;
  }

}
