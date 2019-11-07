package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Address;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Address_setCountryTest_6_Test {
  @Test
  public void setCountryTest() throws Exception {
    // Arrange
    Address address = new Address("aaaaa", "aaaaa", "aaaaa", "aaaaa");
    String country = "aaaaaaaaaaaaaaa";

    // Act
    address.setCountry(country);

    // Assert
    int id = address.getId();
    String country1 = address.getCountry();
    String toStringResult = address.toString();
    String city = address.getCity();
    String addressLine = address.getAddressLine();
    String company = address.getCompany();
    Assert.assertEquals(0, id);
    Assert.assertEquals("aaaaa", address.getPostcode());
    Assert.assertEquals(null, company);
    Assert.assertEquals("aaaaa", addressLine);
    Assert.assertEquals("aaaaa", city);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("aaaaaaaaaaaaaaa", country1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
