package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Address;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AddressTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getAddressLineOutputNotNull() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");

    // Act and Assert result
    Assert.assertEquals("foo", address.getAddressLine());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCityOutputNotNull() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");

    // Act and Assert result
    Assert.assertEquals("foo", address.getCity());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCompanyOutputNull() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");

    // Act and Assert result
    Assert.assertNull(address.getCompany());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCountryOutputNotNull() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");

    // Act and Assert result
    Assert.assertEquals("foo", address.getCountry());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIdOutputZero() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");

    // Act and Assert result
    Assert.assertEquals(0, address.getId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPostcodeOutputNotNull() {

    // Arrange
    final Address address = new Address("foo", "foo", "foo", "foo");

    // Act and Assert result
    Assert.assertEquals("foo", address.getPostcode());
  }
}
