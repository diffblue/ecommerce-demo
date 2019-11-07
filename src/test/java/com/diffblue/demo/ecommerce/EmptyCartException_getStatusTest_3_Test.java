package com.diffblue.demo.ecommerce;

import com.diffblue.demo.ecommerce.EmptyCartException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EmptyCartException_getStatusTest_3_Test {
  @Test
  public void getStatusTest() throws Exception {
    // Arrange
    EmptyCartException emptyCartException = new EmptyCartException(1, "aaaaa");

    // Act
    int actual = emptyCartException.getStatus();

    // Assert
    Assert.assertEquals(1, actual);
    String toStringResult = emptyCartException.toString();
    Throwable[] suppressed = emptyCartException.getSuppressed();
    String message = emptyCartException.getMessage();
    Throwable cause = emptyCartException.getCause();
    int status = emptyCartException.getStatus();
    Assert.assertEquals("com.diffblue.demo.ecommerce.EmptyCartException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", emptyCartException.getLocalizedMessage());
    Assert.assertEquals(1, status);
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
