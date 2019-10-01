package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Address;
import com.diffblue.demo.ecommerce.models.Order;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class OrderTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getEmailOutputNotNull() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");
    final Order order = new Order("foo", "foo", "foo", "foo", "foo", address);

    // Act and Assert result
    Assert.assertEquals("foo", order.getEmail());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getFirstNameOutputNotNull() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");
    final Order order = new Order("foo", "foo", "foo", "foo", "foo", address);

    // Act and Assert result
    Assert.assertEquals("foo", order.getFirstName());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIdOutputZero() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");
    final Order order = new Order("foo", "foo", "foo", "foo", "foo", address);

    // Act and Assert result
    Assert.assertEquals(0, order.getId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLastNameOutputNotNull() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");
    final Order order = new Order("foo", "foo", "foo", "foo", "foo", address);

    // Act and Assert result
    Assert.assertEquals("foo", order.getLastName());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getOrderRefOutputNotNull() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");
    final Order order = new Order("foo", "foo", "foo", "foo", "foo", address);

    // Act and Assert result
    Assert.assertEquals("foo", order.getOrderRef());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPhoneNumberOutputNotNull() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");
    final Order order = new Order("foo", "foo", "foo", "foo", "foo", address);

    // Act and Assert result
    Assert.assertEquals("foo", order.getPhoneNumber());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getShippingAddressOutputNotNull() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");
    final Order order = new Order("foo", "foo", "foo", "foo", "foo", address);

    // Act
    final Address actual = order.getShippingAddress();

    // Assert result
    Assert.assertNotNull(actual);
    Assert.assertEquals("foo", actual.getCountry());
    Assert.assertEquals(0, actual.getId());
    Assert.assertEquals("foo", actual.getPostcode());
    Assert.assertEquals("foo", actual.getCity());
    Assert.assertNull(actual.getCompany());
    Assert.assertEquals("foo", actual.getAddressLine());
  }
}
