package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.AddressForm;
import com.diffblue.demo.ecommerce.forms.CustomerForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CustomerForm_getFirstNameTest_11_Test {
  @Test
  public void getFirstNameTest() throws Exception {
    // Arrange
    CustomerForm customerForm = new CustomerForm();

    // Act
    String actual = customerForm.getFirstName();

    // Assert
    Assert.assertEquals(null, actual);
    String lastName = customerForm.getLastName();
    String toStringResult = customerForm.toString();
    String firstName = customerForm.getFirstName();
    AddressForm shippingAddress = customerForm.getShippingAddress();
    String email = customerForm.getEmail();
    Assert.assertEquals(null, lastName);
    Assert.assertEquals(null, customerForm.getPhoneNumber());
    Assert.assertEquals(null, email);
    Assert.assertEquals(null, shippingAddress);
    Assert.assertEquals(null, firstName);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
