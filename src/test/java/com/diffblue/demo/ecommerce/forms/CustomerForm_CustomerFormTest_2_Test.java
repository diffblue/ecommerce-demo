package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.AddressForm;
import com.diffblue.demo.ecommerce.forms.CustomerForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CustomerForm_CustomerFormTest_2_Test {
  @Test
  public void CustomerFormTest() throws Exception {
    // Arrange and Act
    CustomerForm customerForm = new CustomerForm();

    // Assert
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
