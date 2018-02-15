package com.diffblue.demo.ecommerce.repositories;

// Copyright 2016-2018 DiffBlue limited. All rights reserved.

import com.diffblue.demo.ecommerce.models.Order;
import org.springframework.data.repository.Repository;

public interface OrderRepository extends Repository<Order, Integer> {

  /**
   * Adds new entry to the orders table.
   */
  Order save(Order order);
}
