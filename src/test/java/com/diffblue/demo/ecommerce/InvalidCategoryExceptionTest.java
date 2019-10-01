package com.diffblue.demo.ecommerce;

import com.diffblue.demo.ecommerce.InvalidCategoryException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class InvalidCategoryExceptionTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getMessageOutputNotNull() {

    // Arrange
    final InvalidCategoryException invalidCategoryException =
        new InvalidCategoryException(0, "foo");

    // Act and Assert result
    Assert.assertEquals("foo", invalidCategoryException.getMessage());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getStatusOutputZero() {

    // Arrange
    final InvalidCategoryException invalidCategoryException =
        new InvalidCategoryException(0, "foo");

    // Act and Assert result
    Assert.assertEquals(0, invalidCategoryException.getStatus());
  }
}
