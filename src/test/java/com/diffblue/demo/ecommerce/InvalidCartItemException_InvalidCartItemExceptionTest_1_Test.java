package com.diffblue.demo.ecommerce;

import com.diffblue.demo.ecommerce.InvalidCartItemException;
import com.diffblue.demo.ecommerce.models.Category;
import com.diffblue.demo.ecommerce.models.Collection;
import com.diffblue.demo.ecommerce.models.Product;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class InvalidCartItemException_InvalidCartItemExceptionTest_1_Test {
  @Test
  public void InvalidCartItemExceptionTest() throws Exception {
    // Arrange
    int status = 1;
    String message = "aaaaa";
    Product product = new Product();

    // Act and Assert
    thrown.expect(NullPointerException.class);
    new InvalidCartItemException(status, message, product);
    int id = product.getId();
    String sku = product.getSku();
    String photo = product.getPhoto();
    String name = product.getName();
    String toStringResult = product.toString();
    String size = product.getSize();
    String description = product.getDescription();
    Category category = product.getCategory();
    Collection collection = product.getCollection();
    Assert.assertEquals(0, id);
    Assert.assertEquals(0.0, product.getPrice());
    Assert.assertEquals(null, collection);
    Assert.assertEquals(null, category);
    Assert.assertEquals(null, description);
    Assert.assertEquals(null, size);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, name);
    Assert.assertEquals(null, photo);
    Assert.assertEquals(null, sku);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
