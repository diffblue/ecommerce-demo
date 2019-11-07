package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Category;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Category_setIdTest_1_Test {
  @Test
  public void setIdTest() throws Exception {
    // Arrange
    Category category = new Category();
    int newId = 1;

    // Act
    category.setId(newId);

    // Assert
    int id = category.getId();
    String name = category.getName();
    Assert.assertEquals(1, id);
    Assert.assertNotNull(category.toString());
    Assert.assertEquals(null, name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
