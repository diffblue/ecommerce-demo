package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Address;
import com.diffblue.demo.ecommerce.models.Order;
import com.diffblue.demo.ecommerce.models.OrderItem;
import com.diffblue.demo.ecommerce.models.Product;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class OrderItemTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getIdOutputZero() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");
    final Order order = new Order("foo", "foo", "foo", "foo", "foo", address);
    final Product product = new Product();
    final OrderItem orderItem = new OrderItem(order, product, 0);

    // Act and Assert result
    Assert.assertEquals(0, orderItem.getId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getOrderOutputNotNull() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");
    final Order order = new Order("foo", "foo", "foo", "foo", "foo", address);
    final Product product = new Product();
    final OrderItem orderItem = new OrderItem(order, product, 0);

    // Act
    final Order actual = orderItem.getOrder();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("foo", actual.getLastName());
    Assert.assertEquals("foo", actual.getPhoneNumber());
    Assert.assertEquals("foo", actual.getOrderRef());
    Assert.assertNotNull(actual.getShippingAddress());
    Assert.assertEquals("foo", actual.getShippingAddress().getCountry());
    Assert.assertEquals(0, actual.getShippingAddress().getId());
    Assert.assertEquals("foo", actual.getShippingAddress().getPostcode());
    Assert.assertEquals("foo", actual.getShippingAddress().getCity());
    Assert.assertNull(actual.getShippingAddress().getCompany());
    Assert.assertEquals("foo", actual.getShippingAddress().getAddressLine());
    Assert.assertEquals("foo", actual.getFirstName());
    Assert.assertEquals("foo", actual.getEmail());
    Assert.assertEquals(0, actual.getId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getProductOutputNotNull() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");
    final Order order = new Order("foo", "foo", "foo", "foo", "foo", address);
    final Product product = new Product();
    final OrderItem orderItem = new OrderItem(order, product, 0);

    // Act
    final Product actual = orderItem.getProduct();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertNull(actual.getDescription());
    Assert.assertNull(actual.getSize());
    Assert.assertNull(actual.getCategory());
    Assert.assertNull(actual.getPhoto());
    Assert.assertNull(actual.getName());
    Assert.assertNull(actual.getCollection());
    Assert.assertEquals(0, actual.getId());
    Assert.assertNull(actual.getSku());
    Assert.assertEquals(0.0, actual.getPrice(), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getQuantityOutputZero() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");
    final Order order = new Order("foo", "foo", "foo", "foo", "foo", address);
    final Product product = new Product();
    final OrderItem orderItem = new OrderItem(order, product, 0);

    // Act and Assert result
    Assert.assertEquals(0, orderItem.getQuantity());
  }
}
