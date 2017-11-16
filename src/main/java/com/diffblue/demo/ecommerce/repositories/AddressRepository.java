package com.diffblue.demo.ecommerce.repositories;

// Copyright 2016-2017 DiffBlue limited. All rights reserved.

import com.diffblue.demo.ecommerce.models.Address;
import org.springframework.data.repository.Repository;

public interface AddressRepository extends Repository<Address, Integer> {

  /**
   * Adds new entry to the orders table.
   */
  Address save(Address order);
}
