package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Address;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Address_setCityTest_1_Test {
  @Test
  public void setCityTest() throws Exception {
    // Arrange
    Address address = new Address("aaaaa", "aaaaa", "aaaaa", "aaaaa");
    String city = "aaaaaaaaaaaaaaa";

    // Act
    address.setCity(city);

    // Assert
    int id = address.getId();
    String country = address.getCountry();
    String toStringResult = address.toString();
    String city1 = address.getCity();
    String addressLine = address.getAddressLine();
    String company = address.getCompany();
    Assert.assertEquals(0, id);
    Assert.assertEquals("aaaaa", address.getPostcode());
    Assert.assertEquals(null, company);
    Assert.assertEquals("aaaaa", addressLine);
    Assert.assertEquals("aaaaaaaaaaaaaaa", city1);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("aaaaa", country);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
