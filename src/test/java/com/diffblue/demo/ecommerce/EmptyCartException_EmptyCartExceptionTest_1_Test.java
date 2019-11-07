package com.diffblue.demo.ecommerce;

import com.diffblue.demo.ecommerce.EmptyCartException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class EmptyCartException_EmptyCartExceptionTest_1_Test {
  @Test
  public void EmptyCartExceptionTest() throws Exception {
    // Arrange
    int status = 1;
    String message = "aaaaa";

    // Act
    EmptyCartException emptyCartException = new EmptyCartException(status, message);

    // Assert
    Throwable[] suppressed = emptyCartException.getSuppressed();
    String message1 = emptyCartException.getMessage();
    Throwable cause = emptyCartException.getCause();
    int status1 = emptyCartException.getStatus();
    Assert.assertEquals(0, suppressed.length);
    Assert.assertEquals("aaaaa", emptyCartException.getLocalizedMessage());
    Assert.assertEquals(1, status1);
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
