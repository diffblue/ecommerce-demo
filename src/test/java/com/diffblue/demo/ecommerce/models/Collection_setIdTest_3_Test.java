package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Collection_setIdTest_3_Test {
  @Test
  public void setIdTest() throws Exception {
    // Arrange
    Collection collection = new Collection();
    int newId = 1;

    // Act
    collection.setId(newId);

    // Assert
    int id = collection.getId();
    String name = collection.getName();
    Assert.assertEquals(1, id);
    Assert.assertNotNull(collection.toString());
    Assert.assertEquals(null, name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
