package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Category;
import com.diffblue.demo.ecommerce.models.Collection;
import com.diffblue.demo.ecommerce.models.Product;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class Product_equalsTest_4_Test {
  @Test
  public void equalsTest() throws Exception {
    // Arrange
    Product product = new Product();
    String obj = "aaaaa";

    // Act and Assert
    thrown.expect(ClassCastException.class);
    product.equals(obj);
    String sku = product.getSku();
    String photo = product.getPhoto();
    String name = product.getName();
    String toStringResult = product.toString();
    String size = product.getSize();
    String description = product.getDescription();
    Category category = product.getCategory();
    Collection collection = product.getCollection();
    Assert.assertEquals(null, sku);
    Assert.assertEquals(0.0, product.getPrice());
    Assert.assertEquals(null, collection);
    Assert.assertEquals(null, category);
    Assert.assertEquals(null, description);
    Assert.assertEquals(null, size);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, name);
    Assert.assertEquals(null, photo);
  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
