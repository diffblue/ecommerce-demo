package com.diffblue.demo.ecommerce.controllers;

import com.diffblue.demo.ecommerce.controllers.CheckoutController;
import com.diffblue.demo.ecommerce.repositories.AddressRepository;
import com.diffblue.demo.ecommerce.repositories.OrderItemRepository;
import com.diffblue.demo.ecommerce.repositories.OrderRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class CheckoutController_CheckoutControllerTest_1_Test {
  @Test
  public void CheckoutControllerTest() throws Exception {
    // Arrange
    OrderRepository orderRepo = Whitebox.newInstance(OrderRepository.class);
    AddressRepository addressRepo = Whitebox.newInstance(AddressRepository.class);
    OrderItemRepository orderItemRepo = Whitebox.newInstance(OrderItemRepository.class);

    // Act
    CheckoutController checkoutController = new CheckoutController(orderRepo, addressRepo, orderItemRepo);

    // Assert
    Assert.assertNotNull(checkoutController.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
