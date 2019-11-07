package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Address;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Address_AddressTest_10_Test {
  @Test
  public void AddressTest() throws Exception {
    // Arrange
    String address = "aaaaa";
    String city = "aaaaa";
    String country = "aaaaa";
    String postcode = "aaaaa";

    // Act
    Address address1 = new Address(address, city, country, postcode);

    // Assert
    int id = address1.getId();
    String country1 = address1.getCountry();
    String toStringResult = address1.toString();
    String city1 = address1.getCity();
    String addressLine = address1.getAddressLine();
    String company = address1.getCompany();
    Assert.assertEquals(0, id);
    Assert.assertEquals("aaaaa", address1.getPostcode());
    Assert.assertEquals(null, company);
    Assert.assertEquals("aaaaa", addressLine);
    Assert.assertEquals("aaaaa", city1);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("aaaaa", country1);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
