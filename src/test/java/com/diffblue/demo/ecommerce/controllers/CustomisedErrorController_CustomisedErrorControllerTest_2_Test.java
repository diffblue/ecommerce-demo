package com.diffblue.demo.ecommerce.controllers;

import com.diffblue.demo.ecommerce.controllers.CustomisedErrorController;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;

public class CustomisedErrorController_CustomisedErrorControllerTest_2_Test {
  @Test
  public void CustomisedErrorControllerTest() throws Exception {
    // Arrange
    DefaultErrorAttributes defaultErrorAttributes = new DefaultErrorAttributes();

    // Act
    CustomisedErrorController customisedErrorController = new CustomisedErrorController(defaultErrorAttributes);

    // Assert
    String toStringResult = customisedErrorController.toString();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("/error", customisedErrorController.getErrorPath());
    String toStringResult1 = defaultErrorAttributes.toString();
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals(-2147483648, defaultErrorAttributes.getOrder());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
