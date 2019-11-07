package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Address;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Address_getPostcodeTest_8_Test {
  @Test
  public void getPostcodeTest() throws Exception {
    // Arrange
    Address address = new Address("aaaaa", "aaaaa", "aaaaa", "aaaaa");

    // Act
    String actual = address.getPostcode();

    // Assert
    Assert.assertEquals("aaaaa", actual);
    int id = address.getId();
    String country = address.getCountry();
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
    Assert.assertEquals("aaaaa", country);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
