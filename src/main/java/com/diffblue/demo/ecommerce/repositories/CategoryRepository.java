package com.diffblue.demo.ecommerce.repositories;

// Copyright 2016-2018 Diffblue Limited. All rights reserved.

import com.diffblue.demo.ecommerce.models.Category;
import org.springframework.data.repository.Repository;


public interface CategoryRepository extends Repository<Category, Integer> {

  /**
   * Provides access to a given category from the database.
   */
  Category findById(int id);

  Category findByName(String name);
}
