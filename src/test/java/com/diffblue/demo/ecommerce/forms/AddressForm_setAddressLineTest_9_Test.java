package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.AddressForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AddressForm_setAddressLineTest_9_Test {
  @Test
  public void setAddressLineTest() throws Exception {
    // Arrange
    AddressForm addressForm = new AddressForm();
    String addressLine = "aaaaa";

    // Act
    addressForm.setAddressLine(addressLine);

    // Assert
    String country = addressForm.getCountry();
    String toStringResult = addressForm.toString();
    String city = addressForm.getCity();
    String addressLine1 = addressForm.getAddressLine();
    String company = addressForm.getCompany();
    Assert.assertEquals(null, country);
    Assert.assertEquals(null, addressForm.getPostcode());
    Assert.assertEquals(null, company);
    Assert.assertEquals("aaaaa", addressLine1);
    Assert.assertEquals(null, city);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
