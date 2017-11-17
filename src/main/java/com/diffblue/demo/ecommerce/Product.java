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

  @Column(name = "sku")
  @NotEmpty
  private String sku;


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
   * @param newId update id to this.
   */

  public void setId(int newId) {
    this.id = newId;
  }

  public BigDecimal getPrice() {
    return this.price;
  }

  /**
   * Update the price.
   * @param price new price.
   * @return future proof and consistent with other setters
   */

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getDescription() {
    return  this.description;
  }

  /**
   * Update the description.
   * @param description new description.
   */

  public void setDescription(String description) {
    this.description = description;
  }

  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }
  
  public Category getCategory() {
    return this.category;
  }

  /**
   * Update the product category.
   * @param category new category.
   */
  public void setCategory(Category category) {
    this.category = category;
  }


  public Collection getCollection() {
    return this.collection;
  }

  /**
   * Update the product collection.
   * @param collection new collection.
   */

  public void setCollection(Collection collection) {
    this.collection = collection;
  }

  public String getPhoto() {
    return photo;
  }

  public void setPhoto(String photo) {
    this.photo = photo;
  }

}
