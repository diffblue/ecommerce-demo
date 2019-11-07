package com.diffblue.demo.ecommerce.controllers;

import com.diffblue.demo.ecommerce.controllers.GlobalExceptionHandler;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GlobalExceptionHandler_defaultExceptionHandlerTest_1_Test {
  @Test
  public void defaultExceptionHandlerTest() throws Exception {
    // Arrange
    GlobalExceptionHandler globalExceptionHandler = new GlobalExceptionHandler();
    Exception exception = new Exception();

    // Act
    String actual = globalExceptionHandler.defaultExceptionHandler(exception);

    // Assert
    Assert.assertEquals("redirect:/exception", actual);
    String toStringResult = exception.toString();
    Throwable[] suppressed = exception.getSuppressed();
    String message = exception.getMessage();
    Throwable cause = exception.getCause();
    Assert.assertEquals("java.lang.Exception", toStringResult);
    Assert.assertEquals(null, exception.getLocalizedMessage());
    Assert.assertEquals(null, cause);
    Assert.assertEquals(null, message);
    Assert.assertEquals(0, suppressed.length);
    Assert.assertNotNull(globalExceptionHandler.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
