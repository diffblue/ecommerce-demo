package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Address;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Address_setCompanyTest_5_Test {
  @Test
  public void setCompanyTest() throws Exception {
    // Arrange
    Address address = new Address("aaaaa", "aaaaa", "aaaaa", "aaaaa");
    String company = "aaaaaaaaaaaaaaa";

    // Act
    address.setCompany(company);

    // Assert
    int id = address.getId();
    String country = address.getCountry();
    String toStringResult = address.toString();
    String city = address.getCity();
    String addressLine = address.getAddressLine();
    String company1 = address.getCompany();
    Assert.assertEquals(0, id);
    Assert.assertEquals("aaaaa", address.getPostcode());
    Assert.assertEquals("aaaaaaaaaaaaaaa", company1);
    Assert.assertEquals("aaaaa", addressLine);
    Assert.assertEquals("aaaaa", city);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("aaaaa", country);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
