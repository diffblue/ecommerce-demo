package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.AddressForm;
import com.diffblue.demo.ecommerce.forms.CustomerForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CustomerForm_setPhoneNumberTest_3_Test {
  @Test
  public void setPhoneNumberTest() throws Exception {
    // Arrange
    CustomerForm customerForm = new CustomerForm();
    String phoneNumber = "aaaaa";

    // Act
    customerForm.setPhoneNumber(phoneNumber);

    // Assert
    String toStringResult = customerForm.toString();
    String firstName = customerForm.getFirstName();
    AddressForm shippingAddress = customerForm.getShippingAddress();
    String email = customerForm.getEmail();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("aaaaa", customerForm.getPhoneNumber());
    Assert.assertEquals(null, email);
    Assert.assertEquals(null, shippingAddress);
    Assert.assertEquals(null, firstName);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
