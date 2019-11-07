package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Collection;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Collection_CollectionTest_5_Test {
  @Test
  public void CollectionTest() throws Exception {
    // Arrange and Act
    Collection collection = new Collection();

    // Assert
    String name = collection.getName();
    Assert.assertEquals(null, name);
    Assert.assertNotNull(collection.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
