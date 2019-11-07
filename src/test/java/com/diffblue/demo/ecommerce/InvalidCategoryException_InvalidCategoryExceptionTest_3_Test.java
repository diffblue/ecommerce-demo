package com.diffblue.demo.ecommerce;

import com.diffblue.demo.ecommerce.InvalidCategoryException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InvalidCategoryException_InvalidCategoryExceptionTest_3_Test {
  @Test
  public void InvalidCategoryExceptionTest() throws Exception {
    // Arrange
    int status = 1;
    String message = "aaaaa";

    // Act
    InvalidCategoryException invalidCategoryException = new InvalidCategoryException(status, message);

    // Assert
    String toStringResult = invalidCategoryException.toString();
    Throwable[] suppressed = invalidCategoryException.getSuppressed();
    String message1 = invalidCategoryException.getMessage();
    Throwable cause = invalidCategoryException.getCause();
    int status1 = invalidCategoryException.getStatus();
    Assert.assertEquals("com.diffblue.demo.ecommerce.InvalidCategoryException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", invalidCategoryException.getLocalizedMessage());
    Assert.assertEquals(1, status1);
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message1);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
