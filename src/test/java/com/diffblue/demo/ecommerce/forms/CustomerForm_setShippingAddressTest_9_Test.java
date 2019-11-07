package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.AddressForm;
import com.diffblue.demo.ecommerce.forms.CustomerForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class CustomerForm_setShippingAddressTest_9_Test {
  @Test
  public void setShippingAddressTest() throws Exception {
    // Arrange
    CustomerForm customerForm = new CustomerForm();
    AddressForm addressForm = new AddressForm();

    // Act
    customerForm.setShippingAddress(addressForm);

    // Assert
    String country = addressForm.getCountry();
    String toStringResult = addressForm.toString();
    String city = addressForm.getCity();
    String addressLine = addressForm.getAddressLine();
    String company = addressForm.getCompany();
    Assert.assertEquals(null, country);
    Assert.assertEquals(null, addressForm.getPostcode());
    Assert.assertEquals(null, company);
    Assert.assertEquals(null, addressLine);
    Assert.assertEquals(null, city);
    Assert.assertNotNull(toStringResult);
    String lastName = customerForm.getLastName();
    String toStringResult1 = customerForm.toString();
    String firstName = customerForm.getFirstName();
    AddressForm shippingAddress = customerForm.getShippingAddress();
    String email = customerForm.getEmail();
    Assert.assertEquals(null, lastName);
    Assert.assertEquals(null, customerForm.getPhoneNumber());
    Assert.assertEquals(null, email);
    Assert.assertSame(addressForm, shippingAddress);
    Assert.assertEquals(null, firstName);
    Assert.assertNotNull(toStringResult1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
