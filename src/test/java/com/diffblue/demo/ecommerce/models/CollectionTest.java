package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Collection;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CollectionTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getIdOutputZero() {

    // Arrange
    final Collection collection = new Collection();

    // Act and Assert result
    Assert.assertEquals(0, collection.getId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNameOutputNull() {

    // Arrange
    final Collection collection = new Collection();

    // Act and Assert result
    Assert.assertNull(collection.getName());
  }
}
