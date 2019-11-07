package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Address;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Address_setAddressLineTest_14_Test {
  @Test
  public void setAddressLineTest() throws Exception {
    // Arrange
    Address address = new Address("aaaaa", "aaaaa", "aaaaa", "aaaaa");
    String addressLine = "aaaaaaaaaaaaaaa";

    // Act
    address.setAddressLine(addressLine);

    // Assert
    int id = address.getId();
    String country = address.getCountry();
    String toStringResult = address.toString();
    String city = address.getCity();
    String addressLine1 = address.getAddressLine();
    String company = address.getCompany();
    Assert.assertEquals(0, id);
    Assert.assertEquals("aaaaa", address.getPostcode());
    Assert.assertEquals(null, company);
    Assert.assertEquals("aaaaaaaaaaaaaaa", addressLine1);
    Assert.assertEquals("aaaaa", city);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("aaaaa", country);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
