package com.diffblue.demo.ecommerce;

// Copyright 2016-2017 DiffBlue limited. All rights reserved.

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

public interface ProductRepository extends Repository<Product, Integer> {

  /**
   * Provides access to the database for product information.
   * The following items are available:
   *  findName - returns all of the names of the products
   */
  
  Iterable<Product> findAll();

}
