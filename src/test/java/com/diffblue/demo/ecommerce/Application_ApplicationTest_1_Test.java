package com.diffblue.demo.ecommerce;

import com.diffblue.demo.ecommerce.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Application_ApplicationTest_1_Test {
  @Test
  public void ApplicationTest() throws Exception {
    // Arrange and Act
    Application application = new Application();

    // Assert
    Assert.assertNotNull(application.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
