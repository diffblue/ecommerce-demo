package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.AddressForm;
import com.diffblue.demo.ecommerce.forms.CustomerForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CustomerForm_getShippingAddressTest_4_Test {
  @Test
  public void getShippingAddressTest() throws Exception {
    // Arrange
    CustomerForm customerForm = new CustomerForm();

    // Act
    AddressForm actual = customerForm.getShippingAddress();

    // Assert
    Assert.assertEquals(null, actual);
    String toStringResult = customerForm.toString();
    String firstName = customerForm.getFirstName();
    AddressForm shippingAddress = customerForm.getShippingAddress();
    String email = customerForm.getEmail();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals(null, customerForm.getPhoneNumber());
    Assert.assertEquals(null, email);
    Assert.assertEquals(null, shippingAddress);
    Assert.assertEquals(null, firstName);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
