package com.diffblue.demo.ecommerce.repositories;

// Copyright 2016-2017 DiffBlue limited. All rights reserved.

import com.diffblue.demo.ecommerce.models.OrderItem;
import org.springframework.data.repository.Repository;

public interface OrderItemRepository extends Repository<OrderItem, Integer> {

  /**
   * Adds new entry to the order items table.
   */
  OrderItem save(OrderItem order);
}
