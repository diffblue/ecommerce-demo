package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Collection_setNameTest_4_Test {
  @Test
  public void setNameTest() throws Exception {
    // Arrange
    Collection collection = new Collection();
    String newName = "aaaaa";

    // Act
    collection.setName(newName);

    // Assert
    String name = collection.getName();
    Assert.assertEquals("aaaaa", name);
    Assert.assertNotNull(collection.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
