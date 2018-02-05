package com.diffblue.demo.ecommerce.models;

// Copyright 2016-2018 DiffBlue limited. All rights reserved.

import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * Internal representation of Product Collections.
 * A category has:
 *   id - unique auto-generated number
 *   name - unique not null category name
 */

@Entity
@Table(name = "collections")
public class Collection {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @NotEmpty
  private int id;

  @Column(name = "name")
  @NotEmpty
  private String name;

  @OneToMany(mappedBy = "collection")
  private List<Product> products;


  public int getId() {
    return this.id;
  }

  /**
   * Update category id
   * @param newId update id to this.
   */

  public void setId(int newId) {
    this.id = newId;
  }

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

}
