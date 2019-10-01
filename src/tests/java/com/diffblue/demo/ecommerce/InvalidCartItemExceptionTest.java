package com.diffblue.demo.ecommerce;

import com.diffblue.demo.ecommerce.InvalidCartItemException;
import com.diffblue.demo.ecommerce.models.Collection;
import com.diffblue.demo.ecommerce.models.Product;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class InvalidCartItemExceptionTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getMessageOutputNotNull() {

    // Arrange
    final Product product = new Product();
    product.setSize("foo");
    final Collection collection = new Collection();
    collection.setName("foo");
    product.setCollection(collection);
    product.setName("foo");
    final InvalidCartItemException invalidCartItemException =
        new InvalidCartItemException(0, "foo", product);

    // Act and Assert result
    Assert.assertEquals("foo (foo - foo - foo)", invalidCartItemException.getMessage());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getStatusOutputZero() {

    // Arrange
    final Product product = new Product();
    product.setSize("foo");
    final Collection collection = new Collection();
    collection.setName("foo");
    product.setCollection(collection);
    product.setName("foo");
    final InvalidCartItemException invalidCartItemException =
        new InvalidCartItemException(0, "foo", product);

    // Act and Assert result
    Assert.assertEquals(0, invalidCartItemException.getStatus());
  }
}
