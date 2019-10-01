package com.diffblue.demo.ecommerce.controllers;

import com.diffblue.demo.ecommerce.controllers.CustomisedErrorController;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CustomisedErrorControllerTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void customExceptionInputNullNullOutputNotNull() {

    // Arrange
    final CustomisedErrorController customisedErrorController = new CustomisedErrorController(null);

    // Act and Assert result
    Assert.assertEquals("CustomisedException",
                        customisedErrorController.customException(null, null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getErrorPathOutputNotNull() {

    // Arrange
    final CustomisedErrorController customisedErrorController = new CustomisedErrorController(null);

    // Act and Assert result
    Assert.assertEquals("/error", customisedErrorController.getErrorPath());
  }
}
