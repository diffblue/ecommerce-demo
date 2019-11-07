package com.diffblue.demo.ecommerce;

import com.diffblue.demo.ecommerce.InvalidCategoryException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class InvalidCategoryException_getMessageTest_1_Test {
  @Test
  public void getMessageTest() throws Exception {
    // Arrange
    InvalidCategoryException invalidCategoryException = new InvalidCategoryException(1, "aaaaa");

    // Act
    String actual = invalidCategoryException.getMessage();

    // Assert
    Assert.assertEquals("aaaaa", actual);
    String toStringResult = invalidCategoryException.toString();
    Throwable[] suppressed = invalidCategoryException.getSuppressed();
    String message = invalidCategoryException.getMessage();
    Throwable cause = invalidCategoryException.getCause();
    int status = invalidCategoryException.getStatus();
    Assert.assertEquals("com.diffblue.demo.ecommerce.InvalidCategoryException: aaaaa", toStringResult);
    Assert.assertEquals("aaaaa", invalidCategoryException.getLocalizedMessage());
    Assert.assertEquals(1, status);
    Assert.assertEquals(null, cause);
    Assert.assertEquals("aaaaa", message);
    Assert.assertEquals(0, suppressed.length);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
