package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.AddressForm;
import com.diffblue.demo.ecommerce.forms.CustomerForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CustomerForm_setEmailTest_1_Test {
  @Test
  public void setEmailTest() throws Exception {
    // Arrange
    CustomerForm customerForm = new CustomerForm();
    String email = "aaaaa";

    // Act
    customerForm.setEmail(email);

    // Assert
    String lastName = customerForm.getLastName();
    String toStringResult = customerForm.toString();
    String firstName = customerForm.getFirstName();
    AddressForm shippingAddress = customerForm.getShippingAddress();
    String email1 = customerForm.getEmail();
    Assert.assertEquals(null, lastName);
    Assert.assertEquals(null, customerForm.getPhoneNumber());
    Assert.assertEquals("aaaaa", email1);
    Assert.assertEquals(null, shippingAddress);
    Assert.assertEquals(null, firstName);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
