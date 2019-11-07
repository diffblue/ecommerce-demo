package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Address;
import com.diffblue.demo.ecommerce.models.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Order_OrderTest_10_Test {
  @Test
  public void OrderTest() throws Exception {
    // Arrange
    String orderRef = "aaaaa";
    String string = "aaaaa";
    String string1 = "aaaaa";
    String string2 = "aaaaa";
    String string3 = "aakaa";
    Address address = new Address(string, string1, string2, string3);

    // Act
    Order order = new Order(orderRef, string, string1, string2, string3, address);

    // Assert
    int id = order.getId();
    String lastName = order.getLastName();
    Address shippingAddress = order.getShippingAddress();
    String toStringResult = order.toString();
    String orderRef1 = order.getOrderRef();
    String firstName = order.getFirstName();
    String email = order.getEmail();
    Assert.assertEquals(0, id);
    Assert.assertEquals("aakaa", order.getPhoneNumber());
    Assert.assertEquals("aaaaa", email);
    Assert.assertEquals("aaaaa", firstName);
    Assert.assertEquals("aaaaa", orderRef1);
    Assert.assertNotNull(toStringResult);
    Assert.assertSame(address, shippingAddress);
    int id1 = shippingAddress.getId();
    String country = shippingAddress.getCountry();
    String toStringResult1 = shippingAddress.toString();
    String city = shippingAddress.getCity();
    String addressLine = shippingAddress.getAddressLine();
    String company = shippingAddress.getCompany();
    Assert.assertEquals("aaaaa", lastName);
    Assert.assertEquals("aakaa", shippingAddress.getPostcode());
    Assert.assertEquals(null, company);
    Assert.assertEquals("aaaaa", addressLine);
    Assert.assertEquals("aaaaa", city);
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals("aaaaa", country);
    Assert.assertEquals(0, id1);
    Assert.assertSame(shippingAddress, address);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
