package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.AddressForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AddressForm_setCityTest_11_Test {
  @Test
  public void setCityTest() throws Exception {
    // Arrange
    AddressForm addressForm = new AddressForm();
    String city = "aaaaa";

    // Act
    addressForm.setCity(city);

    // Assert
    String country = addressForm.getCountry();
    String toStringResult = addressForm.toString();
    String city1 = addressForm.getCity();
    String addressLine = addressForm.getAddressLine();
    String company = addressForm.getCompany();
    Assert.assertEquals(null, country);
    Assert.assertEquals(null, addressForm.getPostcode());
    Assert.assertEquals(null, company);
    Assert.assertEquals(null, addressLine);
    Assert.assertEquals("aaaaa", city1);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
