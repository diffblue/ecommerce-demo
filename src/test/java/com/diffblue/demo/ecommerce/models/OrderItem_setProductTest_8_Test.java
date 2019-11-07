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

public class OrderItem_setProductTest_8_Test {
//failed_pass   @Test
//  public void setProductTest() throws Exception {
//    // Arrange
//    String string = "aaaaa";
//    String string1 = "aaaaa";
//    String string2 = "aaaak";
//    String string3 = "aaaaa";
//    Address address = new Address(string, string1, string2, string3);
//    Order order = new Order("aaaaa", string, string1, string2, string3, address);
//    OrderItem orderItem = new OrderItem(order, new Product(), 1);
//    Product product = new Product();
//
//    // Act
//    orderItem.setProduct(product);
//
//    // Assert
//    String sku = product.getSku();
//    String photo = product.getPhoto();
//    String name = product.getName();
//    String toStringResult = product.toString();
//    String size = product.getSize();
//    String description = product.getDescription();
//    Category category = product.getCategory();
//    Collection collection = product.getCollection();
//    Assert.assertEquals(null, sku);
//    Assert.assertEquals(0.0, product.getPrice());
//    Assert.assertEquals(null, collection);
//    Assert.assertEquals(null, category);
//    Assert.assertEquals(null, description);
//    Assert.assertEquals(null, size);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, name);
//    Assert.assertEquals(null, photo);
//    int id = orderItem.getId();
//    Order order1 = orderItem.getOrder();
//    String toStringResult1 = orderItem.toString();
//    int quantity = orderItem.getQuantity();
//    Assert.assertEquals(0, id);
//    Assert.assertSame(product, orderItem.getProduct());
//    Assert.assertEquals(1, quantity);
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertSame(order, order1);
//    int id1 = order1.getId();
//    String lastName = order1.getLastName();
//    Address shippingAddress = order1.getShippingAddress();
//    String toStringResult2 = order1.toString();
//    String orderRef = order1.getOrderRef();
//    String firstName = order1.getFirstName();
//    String email = order1.getEmail();
//    Assert.assertEquals(0, id1);
//    Assert.assertEquals("aaaaa", order1.getPhoneNumber());
//    Assert.assertEquals("aaaak", email);
//    Assert.assertEquals("aaaaa", firstName);
//    Assert.assertEquals("aaaaa", orderRef);
//    Assert.assertNotNull(toStringResult2);
//    Assert.assertSame(address, shippingAddress);
//    int id2 = shippingAddress.getId();
//    String country = shippingAddress.getCountry();
//    String toStringResult3 = shippingAddress.toString();
//    String city = shippingAddress.getCity();
//    String addressLine = shippingAddress.getAddressLine();
//    String company = shippingAddress.getCompany();
//    Assert.assertEquals("aaaaa", lastName);
//    Assert.assertEquals("aaaaa", shippingAddress.getPostcode());
//    Assert.assertEquals(null, company);
//    Assert.assertEquals("aaaaa", addressLine);
//    Assert.assertEquals("aaaaa", city);
//    Assert.assertNotNull(toStringResult3);
//    Assert.assertEquals("aaaak", country);
//    Assert.assertEquals(0, id2);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
