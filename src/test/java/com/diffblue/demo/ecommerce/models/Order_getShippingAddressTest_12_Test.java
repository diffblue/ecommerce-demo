package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Address;
import com.diffblue.demo.ecommerce.models.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Order_getShippingAddressTest_12_Test {
  @Test
  public void getShippingAddressTest() throws Exception {
    // Arrange
    String string = "aaaaa";
    String string1 = "aaaaa";
    String string2 = "aaaaa";
    String string3 = "kaaaa";
    Address address = new Address(string, string1, string2, string3);
    Order order = new Order("aaaaa", string, string1, string2, string3, address);

    // Act
    Address actual = order.getShippingAddress();

    // Assert
    Assert.assertSame(address, actual);
    String country = actual.getCountry();
    String toStringResult = actual.toString();
    String city = actual.getCity();
    String addressLine = actual.getAddressLine();
    String company = actual.getCompany();
    Assert.assertEquals("aaaaa", country);
    Assert.assertEquals("kaaaa", actual.getPostcode());
    Assert.assertEquals(null, company);
    Assert.assertEquals("aaaaa", addressLine);
    Assert.assertEquals("aaaaa", city);
    Assert.assertNotNull(toStringResult);
    int id = order.getId();
    String lastName = order.getLastName();
    Address shippingAddress = order.getShippingAddress();
    String toStringResult1 = order.toString();
    String orderRef = order.getOrderRef();
    String firstName = order.getFirstName();
    String email = order.getEmail();
    Assert.assertEquals(0, id);
    Assert.assertEquals("kaaaa", order.getPhoneNumber());
    Assert.assertEquals("aaaaa", email);
    Assert.assertEquals("aaaaa", firstName);
    Assert.assertEquals("aaaaa", orderRef);
    Assert.assertNotNull(toStringResult1);
    Assert.assertSame(actual, shippingAddress);
    Assert.assertEquals("aaaaa", lastName);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
