package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Cart;
import com.diffblue.demo.ecommerce.models.Product;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Cart_setTotalTest_13_Test {
//failed_pass   @Test
//  public void setTotalTest() throws Exception {
//    // Arrange
//    Cart cart = new Cart();
//    double tax = 1.0;
//    double shipping = 1.0;
//
//    // Act
//    cart.setTotal(tax, shipping);
//
//    // Assert
//    String toStringResult = cart.toString();
//    double subtotal = cart.getSubtotal();
//    double tax1 = cart.getTax();
//    double total = cart.getTotal();
//    Map<Product, Integer> products = cart.getProducts();
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(4.5, cart.getShipping());
//    Assert.assertTrue(products instanceof java.util.HashMap);
//    Assert.assertEquals(2.0, total);
//    Assert.assertEquals(0, products.size());
//    Assert.assertEquals(0.0, tax1);
//    Assert.assertEquals(0.0, subtotal);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
