package com.diffblue.demo.ecommerce.controllers;

import com.diffblue.demo.ecommerce.controllers.CustomisedErrorController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;

public class CustomisedErrorController_getErrorPathTest_1_Test {
  @Test
  public void getErrorPathTest() throws Exception {
    // Arrange
    CustomisedErrorController customisedErrorController = new CustomisedErrorController(new DefaultErrorAttributes());

    // Act
    String actual = customisedErrorController.getErrorPath();

    // Assert
    Assert.assertEquals("/error", actual);
    String toStringResult = customisedErrorController.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("/error", customisedErrorController.getErrorPath());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
