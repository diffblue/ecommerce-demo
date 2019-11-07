package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Cart;
import com.diffblue.demo.ecommerce.models.Category;
import com.diffblue.demo.ecommerce.models.Collection;
import com.diffblue.demo.ecommerce.models.Product;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Cart_updateProductQuantityTest_9_Test {
//failed_pass   @Test
//  public void updateProductQuantityTest() throws Exception {
//    // Arrange
//    Cart cart = new Cart();
//    Product product = new Product();
//    int newQty = 1;
//    String size = "aaaaa";
//
//    // Act
//    cart.updateProductQuantity(product, newQty, size);
//
//    // Assert
//    int id = product.getId();
//    String sku = product.getSku();
//    String photo = product.getPhoto();
//    String name = product.getName();
//    String toStringResult = product.toString();
//    String size1 = product.getSize();
//    String description = product.getDescription();
//    Category category = product.getCategory();
//    Collection collection = product.getCollection();
//    Assert.assertEquals(0, id);
//    Assert.assertEquals(0.0, product.getPrice());
//    Assert.assertEquals(null, collection);
//    Assert.assertEquals(null, category);
//    Assert.assertEquals(null, description);
//    Assert.assertEquals("aaaaa", size1);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, name);
//    Assert.assertEquals(null, photo);
//    Assert.assertEquals(null, sku);
//    String toStringResult1 = cart.toString();
//    double subtotal = cart.getSubtotal();
//    double tax = cart.getTax();
//    double total = cart.getTotal();
//    Map<Product, Integer> products = cart.getProducts();
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals(4.5, cart.getShipping());
//    Assert.assertTrue(products instanceof java.util.HashMap);
//    Assert.assertEquals(0.0, total);
//    Assert.assertEquals(0, products.size());
//    Assert.assertEquals(0.0, tax);
//    Assert.assertEquals(0.0, subtotal);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
