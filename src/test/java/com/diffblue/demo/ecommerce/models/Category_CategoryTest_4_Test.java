package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Category;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Category_CategoryTest_4_Test {
  @Test
  public void CategoryTest() throws Exception {
    // Arrange and Act
    Category category = new Category();

    // Assert
    int id = category.getId();
    String name = category.getName();
    Assert.assertEquals(0, id);
    Assert.assertNotNull(category.toString());
    Assert.assertEquals(null, name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
