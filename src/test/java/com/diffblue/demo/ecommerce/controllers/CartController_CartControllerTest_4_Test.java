package com.diffblue.demo.ecommerce.controllers;

import com.diffblue.demo.ecommerce.controllers.CartController;
import com.diffblue.demo.ecommerce.repositories.ProductRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class CartController_CartControllerTest_4_Test {
  @Test
  public void CartControllerTest() throws Exception {
    // Arrange
    ProductRepository productRepo = Whitebox.newInstance(ProductRepository.class);

    // Act
    CartController cartController = new CartController(productRepo);

    // Assert
    Assert.assertNotNull(cartController.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
