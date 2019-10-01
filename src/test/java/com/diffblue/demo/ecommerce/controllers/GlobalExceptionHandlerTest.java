package com.diffblue.demo.ecommerce.controllers;

import com.diffblue.demo.ecommerce.controllers.GlobalExceptionHandler;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class GlobalExceptionHandlerTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void defaultExceptionHandlerInputNotNullOutputNotNull() throws Exception {

    // Arrange
    final GlobalExceptionHandler globalExceptionHandler = new GlobalExceptionHandler();
    final Exception exception = new Exception();

    // Act and Assert result
    Assert.assertEquals("redirect:/exception",
                        globalExceptionHandler.defaultExceptionHandler(exception));
  }
}
