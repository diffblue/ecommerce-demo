package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Address;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Address_AddressTest_11_Test {
  @Test
  public void AddressTest() throws Exception {
    // Arrange
    String company = "aaaaa";
    String address = "aaaaa";
    String city = "aaaaa";
    String country = "aaaaa";
    String postcode = "aakaa";

    // Act
    Address address1 = new Address(company, address, city, country, postcode);

    // Assert
    String country1 = address1.getCountry();
    String toStringResult = address1.toString();
    String city1 = address1.getCity();
    String addressLine = address1.getAddressLine();
    String company1 = address1.getCompany();
    Assert.assertEquals("aaaaa", country1);
    Assert.assertEquals("aakaa", address1.getPostcode());
    Assert.assertEquals("aaaaa", company1);
    Assert.assertEquals("aaaaa", addressLine);
    Assert.assertEquals("aaaaa", city1);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
