package com.diffblue.demo.tdd.repositories;

// Copyright 2016-2018 DiffBlue limited. All rights reserved.

import com.diffblue.demo.tdd.models.Product;

import org.springframework.data.repository.Repository;


public interface ProductRepository extends Repository<Product, Integer> {

  /**
   * Provides access to the database for product information.
   * The following items are available:
   *  findName - returns all of the names of the products
   */
  
  Iterable<Product> findAll();

  /**
   * Provides access to a given product information from the database.
   */
  Product findById(int id);
}
