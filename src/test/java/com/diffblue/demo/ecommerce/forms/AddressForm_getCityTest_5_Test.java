package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.AddressForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AddressForm_getCityTest_5_Test {
  @Test
  public void getCityTest() throws Exception {
    // Arrange
    AddressForm addressForm = new AddressForm();

    // Act
    String actual = addressForm.getCity();

    // Assert
    Assert.assertEquals(null, actual);
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
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
