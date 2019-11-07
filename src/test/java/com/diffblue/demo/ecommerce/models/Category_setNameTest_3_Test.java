package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Category;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Category_setNameTest_3_Test {
  @Test
  public void setNameTest() throws Exception {
    // Arrange
    Category category = new Category();
    String newName = "aaaaa";

    // Act
    category.setName(newName);

    // Assert
    int id = category.getId();
    String name = category.getName();
    Assert.assertEquals(0, id);
    Assert.assertNotNull(category.toString());
    Assert.assertEquals("aaaaa", name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
