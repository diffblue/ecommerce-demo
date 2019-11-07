package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.AddressForm;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class AddressForm_setCompanyTest_6_Test {
  @Test
  public void setCompanyTest() throws Exception {
    // Arrange
    AddressForm addressForm = new AddressForm();
    String company = "aaaaa";

    // Act
    addressForm.setCompany(company);

    // Assert
    String country = addressForm.getCountry();
    String toStringResult = addressForm.toString();
    String city = addressForm.getCity();
    String addressLine = addressForm.getAddressLine();
    String company1 = addressForm.getCompany();
    Assert.assertEquals(null, country);
    Assert.assertEquals(null, addressForm.getPostcode());
    Assert.assertEquals("aaaaa", company1);
    Assert.assertEquals(null, addressLine);
    Assert.assertEquals(null, city);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
