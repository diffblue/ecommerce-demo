package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Cart;
import com.diffblue.demo.ecommerce.models.Product;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Cart_setTaxTest_2_Test {
//failed_pass   @Test
//  public void setTaxTest() throws Exception {
//    // Arrange
//    Cart cart = new Cart();
//    double tax = 1.0;
//
//    // Act
//    cart.setTax(tax);
//
//    // Assert
//    double subtotal = cart.getSubtotal();
//    double tax1 = cart.getTax();
//    double total = cart.getTotal();
//    Map<Product, Integer> products = cart.getProducts();
//    Assert.assertEquals(0.0, subtotal);
//    Assert.assertEquals(4.5, cart.getShipping());
//    Assert.assertTrue(products instanceof java.util.HashMap);
//    Assert.assertEquals(0.0, total);
//    Assert.assertEquals(0, products.size());
//    Assert.assertEquals(1.0, tax1);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
