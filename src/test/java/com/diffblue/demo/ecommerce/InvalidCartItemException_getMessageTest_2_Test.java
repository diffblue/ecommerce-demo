package com.diffblue.demo.ecommerce;

import com.diffblue.demo.ecommerce.InvalidCartItemException;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class InvalidCartItemException_getMessageTest_2_Test {
  @Test
  public void getMessageTest() throws Exception {
    // Arrange
    InvalidCartItemException invalidCartItemException = Whitebox.newInstance(InvalidCartItemException.class);

    // Act
    String actual = invalidCartItemException.getMessage();

    // Assert
    Assert.assertEquals(null, actual);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
