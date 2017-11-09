package com.diffblue.demo.ecommerce;

// Copyright 2016-2017 DiffBlue limited. All rights reserved.

import org.hibernate.validator.constraints.NotEmpty;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @NotEmpty
  private int id;

  @Column(name = "price")
  @NotEmpty
  private BigDecimal price;

  @Column(name = "description")
  @NotEmpty
  private String description;

  @ManyToOne
  @JoinColumn(name = "category_id")
  private Category category;

  @ManyToOne
  @JoinColumn(name = "collection_id")
  private Collection collection;

  @Column(name = "photo")
  @NotEmpty
  private String photo;

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

  public int getId() {
    return this.id;
  }

  /**
   * Update the ID, which must be PRODxxx (where x's are numbers)
   * @param newId update id to this.
   * @return success (true) or failure (false)
   */

  public boolean setId(int newId) {
    this.id = newId;
    return true;
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

  public String getDescription() {
    return  this.description;
  }

  /**
   * Update the description.
   * @param description new description.
   * @return future proof and consistent with other setters
   */

  public boolean setDescription(String description) {
    this.description = description;
    return true;
  }

  public Category getCategory() {
    return this.category;
  }

  /**
   * Update the product category.
   * @param category new category.
   * @return future proof and consistent with other setters
   */

  public boolean setCategory(Category category) {
    this.category = category;
    return true;
  }

  public Collection getCollection() {
    return this.collection;
  }

  /**
   * Update the product collection.
   * @param collection new collection.
   * @return future proof and consistent with other setters
   */

  public boolean setCollection(Collection collection) {
    this.collection = collection;
    return true;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }
}
