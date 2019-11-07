package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Address;
import com.diffblue.demo.ecommerce.models.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class Order_setIdTest_11_Test {
  @Test
  public void setIdTest() throws Exception {
    // Arrange
    String string = "aaaaa";
    String string1 = "aaaaa";
    String string2 = "aaaaa";
    String string3 = "kaaaa";
    Address address = new Address(string, string1, string2, string3);
    Order order = new Order("aaaaa", string, string1, string2, string3, address);
    int id = 1;

    // Act
    order.setId(id);

    // Assert
    int id1 = order.getId();
    String lastName = order.getLastName();
    Address shippingAddress = order.getShippingAddress();
    String toStringResult = order.toString();
    String orderRef = order.getOrderRef();
    String firstName = order.getFirstName();
    String email = order.getEmail();
    Assert.assertEquals(1, id1);
    Assert.assertEquals("kaaaa", order.getPhoneNumber());
    Assert.assertEquals("aaaaa", email);
    Assert.assertEquals("aaaaa", firstName);
    Assert.assertEquals("aaaaa", orderRef);
    Assert.assertNotNull(toStringResult);
    Assert.assertSame(address, shippingAddress);
    int id2 = shippingAddress.getId();
    String country = shippingAddress.getCountry();
    String toStringResult1 = shippingAddress.toString();
    String city = shippingAddress.getCity();
    String addressLine = shippingAddress.getAddressLine();
    String company = shippingAddress.getCompany();
    Assert.assertEquals("aaaaa", lastName);
    Assert.assertEquals("kaaaa", shippingAddress.getPostcode());
    Assert.assertEquals(null, company);
    Assert.assertEquals("aaaaa", addressLine);
    Assert.assertEquals("aaaaa", city);
    Assert.assertNotNull(toStringResult1);
    Assert.assertEquals("aaaaa", country);
    Assert.assertEquals(0, id2);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
