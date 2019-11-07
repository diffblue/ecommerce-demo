package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.AddressForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AddressForm_setPostcodeTest_1_Test {
  @Test
  public void setPostcodeTest() throws Exception {
    // Arrange
    AddressForm addressForm = new AddressForm();
    String postcode = "aaaaa";

    // Act
    addressForm.setPostcode(postcode);

    // Assert
    String country = addressForm.getCountry();
    String toStringResult = addressForm.toString();
    String city = addressForm.getCity();
    String addressLine = addressForm.getAddressLine();
    String company = addressForm.getCompany();
    Assert.assertEquals(null, country);
    Assert.assertEquals("aaaaa", addressForm.getPostcode());
    Assert.assertEquals(null, company);
    Assert.assertEquals(null, addressLine);
    Assert.assertEquals(null, city);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
