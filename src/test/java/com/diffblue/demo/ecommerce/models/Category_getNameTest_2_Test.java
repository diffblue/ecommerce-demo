package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Category;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Category_getNameTest_2_Test {
  @Test
  public void getNameTest() throws Exception {
    // Arrange
    Category category = new Category();

    // Act
    String actual = category.getName();

    // Assert
    Assert.assertEquals(null, actual);
    int id = category.getId();
    String name = category.getName();
    Assert.assertEquals(0, id);
    Assert.assertNotNull(category.toString());
    Assert.assertEquals(null, name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
