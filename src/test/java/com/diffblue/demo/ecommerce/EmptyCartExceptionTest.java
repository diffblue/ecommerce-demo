package com.diffblue.demo.ecommerce;

import com.diffblue.demo.ecommerce.EmptyCartException;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class EmptyCartExceptionTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getMessageOutputNotNull() {

    // Arrange
    final EmptyCartException emptyCartException = new EmptyCartException(0, "foo");

    // Act and Assert result
    Assert.assertEquals("foo", emptyCartException.getMessage());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getStatusOutputZero() {

    // Arrange
    final EmptyCartException emptyCartException = new EmptyCartException(0, "foo");

    // Act and Assert result
    Assert.assertEquals(0, emptyCartException.getStatus());
  }
}
