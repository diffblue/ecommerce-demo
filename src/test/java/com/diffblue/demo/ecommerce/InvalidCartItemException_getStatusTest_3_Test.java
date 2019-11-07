package com.diffblue.demo.ecommerce;

import com.diffblue.demo.ecommerce.InvalidCartItemException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class InvalidCartItemException_getStatusTest_3_Test {
  @Test
  public void getStatusTest() throws Exception {
    // Arrange
    InvalidCartItemException invalidCartItemException = Whitebox.newInstance(InvalidCartItemException.class);

    // Act
    int actual = invalidCartItemException.getStatus();

    // Assert
    Assert.assertEquals(0, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
