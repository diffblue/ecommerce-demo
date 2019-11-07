package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.AddressForm;
import com.diffblue.demo.ecommerce.forms.CustomerForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CustomerForm_setLastNameTest_5_Test {
  @Test
  public void setLastNameTest() throws Exception {
    // Arrange
    CustomerForm customerForm = new CustomerForm();
    String lastName = "aaaaa";

    // Act
    customerForm.setLastName(lastName);

    // Assert
    String lastName1 = customerForm.getLastName();
    String toStringResult = customerForm.toString();
    String firstName = customerForm.getFirstName();
    AddressForm shippingAddress = customerForm.getShippingAddress();
    String email = customerForm.getEmail();
    Assert.assertEquals("aaaaa", lastName1);
    Assert.assertEquals(null, customerForm.getPhoneNumber());
    Assert.assertEquals(null, email);
    Assert.assertEquals(null, shippingAddress);
    Assert.assertEquals(null, firstName);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
