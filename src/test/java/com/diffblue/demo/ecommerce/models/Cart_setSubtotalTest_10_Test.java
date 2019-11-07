package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Cart;
import com.diffblue.demo.ecommerce.models.Product;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Cart_setSubtotalTest_10_Test {
//failed_pass   @Test
//  public void setSubtotalTest() throws Exception {
//    // Arrange
//    Cart cart = new Cart();
//    double subtotal = 1.0;
//
//    // Act
//    cart.setSubtotal(subtotal);
//
//    // Assert
//    String toStringResult = cart.toString();
//    double subtotal1 = cart.getSubtotal();
//    double tax = cart.getTax();
//    double total = cart.getTotal();
//    Map<Product, Integer> products = cart.getProducts();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(4.5, cart.getShipping());
//    Assert.assertTrue(products instanceof java.util.HashMap);
//    Assert.assertEquals(1.0, total);
//    Assert.assertEquals(0, products.size());
//    Assert.assertEquals(0.0, tax);
//    Assert.assertEquals(1.0, subtotal1);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
