package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Collection_getNameTest_2_Test {
  @Test
  public void getNameTest() throws Exception {
    // Arrange
    Collection collection = new Collection();

    // Act
    String actual = collection.getName();

    // Assert
    Assert.assertEquals(null, actual);
    int id = collection.getId();
    String name = collection.getName();
    Assert.assertEquals(0, id);
    Assert.assertNotNull(collection.toString());
    Assert.assertEquals(null, name);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
