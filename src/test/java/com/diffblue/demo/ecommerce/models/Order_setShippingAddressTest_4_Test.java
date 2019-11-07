package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Address;
import com.diffblue.demo.ecommerce.models.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Order_setShippingAddressTest_4_Test {
  @Test
  public void setShippingAddressTest() throws Exception {
    // Arrange
    String string = "aaaaa";
    String string1 = "aaaaa";
    String string2 = "aaaaa";
    String string3 = "kaaaa";
    Order order = new Order("aaaaa", string, string1, string2, string3, new Address(string, string1, string2, string3));
    Address address = new Address(string, string1, string2, string3);

    // Act
    order.setShippingAddress(address);

    // Assert
    int id = address.getId();
    String country = address.getCountry();
    String toStringResult = address.toString();
    String city = address.getCity();
    String addressLine = address.getAddressLine();
    String company = address.getCompany();
    Assert.assertEquals(0, id);
    Assert.assertEquals("kaaaa", address.getPostcode());
    Assert.assertEquals(null, company);
    Assert.assertEquals("aaaaa", addressLine);
    Assert.assertEquals("aaaaa", city);
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("aaaaa", country);
    int id1 = order.getId();
    String lastName = order.getLastName();
    Address shippingAddress = order.getShippingAddress();
    String toStringResult1 = order.toString();
    String orderRef = order.getOrderRef();
    String firstName = order.getFirstName();
    String email = order.getEmail();
    Assert.assertEquals(0, id1);
    Assert.assertEquals("kaaaa", order.getPhoneNumber());
    Assert.assertEquals("aaaaa", email);
    Assert.assertEquals("aaaaa", firstName);
    Assert.assertEquals("aaaaa", orderRef);
    Assert.assertNotNull(toStringResult1);
    Assert.assertSame(address, shippingAddress);
    Assert.assertEquals("aaaaa", lastName);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
