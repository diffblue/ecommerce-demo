package com.diffblue.demo.ecommerce;

// Copyright 2016-2017 DiffBlue limited. All rights reserved.

import org.hibernate.validator.constraints.NotEmpty;

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

  public String getName() {
    return this.name;
  }

  public String getId() {
    return this.id;
  }

  /**
   * Set the name of the product which cannot be blank.
   * @param newName is the name to be used for the product
   * @return success (true) or error (false)
   */

  public boolean setName(String newName) {
    if (newName.length() > 0) {
      this.name = newName;
      return true;
    } else {
      // Names cannot be blank
      return false;
    }
  }

  /**
   * Set the id of the product (for integration with other systems).
   * @param newId the desired id
   * @return success (true) or error (false)
   */

  public boolean setId(String newId) {
    if (newId.length() == 7 ) {
      this.id = newId;
      return true;
    } else {
      // Id's are constrained to 7 characters:
      // It is required that they are of the format PRODxxx
      return false;
    }
  }

}
