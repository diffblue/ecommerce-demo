package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Address;
import com.diffblue.demo.ecommerce.models.Category;
import com.diffblue.demo.ecommerce.models.Collection;
import com.diffblue.demo.ecommerce.models.Order;
import com.diffblue.demo.ecommerce.models.OrderItem;
import com.diffblue.demo.ecommerce.models.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class OrderItem_setOrderTest_3_Test {
//failed_pass   @Test
//  public void setOrderTest() throws Exception {
//    // Arrange
//    String string = "aaaaa";
//    String string1 = "aaaaa";
//    String string2 = "aaaak";
//    String string3 = "aaaaa";
//    Address address = new Address(string, string1, string2, string3);
//    Order order = new Order("aaaaa", string, string1, string2, string3, address);
//    Product product = new Product();
//    OrderItem orderItem = new OrderItem(order, product, 1);
//
//    // Act
//    orderItem.setOrder(order);
//
//    // Assert
//    int id = order.getId();
//    String lastName = order.getLastName();
//    Address shippingAddress = order.getShippingAddress();
//    String toStringResult = order.toString();
//    String orderRef = order.getOrderRef();
//    String firstName = order.getFirstName();
//    String email = order.getEmail();
//    Assert.assertEquals(0, id);
//    Assert.assertEquals("aaaaa", order.getPhoneNumber());
//    Assert.assertEquals("aaaak", email);
//    Assert.assertEquals("aaaaa", firstName);
//    Assert.assertEquals("aaaaa", orderRef);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertSame(address, shippingAddress);
//    int id1 = shippingAddress.getId();
//    String country = shippingAddress.getCountry();
//    String toStringResult1 = shippingAddress.toString();
//    String city = shippingAddress.getCity();
//    String addressLine = shippingAddress.getAddressLine();
//    String company = shippingAddress.getCompany();
//    Assert.assertEquals("aaaaa", lastName);
//    Assert.assertEquals("aaaaa", shippingAddress.getPostcode());
//    Assert.assertEquals(null, company);
//    Assert.assertEquals("aaaaa", addressLine);
//    Assert.assertEquals("aaaaa", city);
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals("aaaak", country);
//    Assert.assertEquals(0, id1);
//    int id2 = orderItem.getId();
//    Order order1 = orderItem.getOrder();
//    String toStringResult2 = orderItem.toString();
//    int quantity = orderItem.getQuantity();
//    Product product1 = orderItem.getProduct();
//    Assert.assertEquals(0, id2);
//    Assert.assertSame(product, product1);
//    int id3 = product1.getId();
//    String sku = product1.getSku();
//    String photo = product1.getPhoto();
//    String name = product1.getName();
//    String toStringResult3 = product1.toString();
//    String size = product1.getSize();
//    String description = product1.getDescription();
//    Category category = product1.getCategory();
//    Collection collection = product1.getCollection();
//    Assert.assertEquals(1, quantity);
//    Assert.assertSame(order, order1);
//    Assert.assertNotNull(toStringResult2);
//    Assert.assertEquals(null, category);
//    Assert.assertEquals(null, description);
//    Assert.assertEquals(null, size);
//    Assert.assertNotNull(toStringResult3);
//    Assert.assertEquals(null, name);
//    Assert.assertEquals(null, photo);
//    Assert.assertEquals(null, sku);
//    Assert.assertEquals(0, id3);
//    Assert.assertEquals(null, collection);
//    Assert.assertEquals(0.0, product1.getPrice());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
