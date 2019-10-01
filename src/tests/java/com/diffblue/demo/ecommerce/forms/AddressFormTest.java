package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.AddressForm;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class AddressFormTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getAddressLineOutputNull() {

    // Arrange
    final AddressForm addressForm = new AddressForm();

    // Act and Assert result
    Assert.assertNull(addressForm.getAddressLine());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCityOutputNull() {

    // Arrange
    final AddressForm addressForm = new AddressForm();

    // Act and Assert result
    Assert.assertNull(addressForm.getCity());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCompanyOutputNull() {

    // Arrange
    final AddressForm addressForm = new AddressForm();

    // Act and Assert result
    Assert.assertNull(addressForm.getCompany());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCountryOutputNull() {

    // Arrange
    final AddressForm addressForm = new AddressForm();

    // Act and Assert result
    Assert.assertNull(addressForm.getCountry());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPostcodeOutputNull() {

    // Arrange
    final AddressForm addressForm = new AddressForm();

    // Act and Assert result
    Assert.assertNull(addressForm.getPostcode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setAddressLineInputNotNullOutputVoid() {

    // Arrange
    final AddressForm addressForm = new AddressForm();

    // Act
    addressForm.setAddressLine("foo");

    // Assert side effects
    Assert.assertEquals("foo", addressForm.getAddressLine());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setCityInputNotNullOutputVoid() {

    // Arrange
    final AddressForm addressForm = new AddressForm();

    // Act
    addressForm.setCity("foo");

    // Assert side effects
    Assert.assertEquals("foo", addressForm.getCity());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setCompanyInputNotNullOutputVoid() {

    // Arrange
    final AddressForm addressForm = new AddressForm();

    // Act
    addressForm.setCompany("foo");

    // Assert side effects
    Assert.assertEquals("foo", addressForm.getCompany());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setCountryInputNotNullOutputVoid() {

    // Arrange
    final AddressForm addressForm = new AddressForm();

    // Act
    addressForm.setCountry("foo");

    // Assert side effects
    Assert.assertEquals("foo", addressForm.getCountry());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setPostcodeInputNotNullOutputVoid() {

    // Arrange
    final AddressForm addressForm = new AddressForm();

    // Act
    addressForm.setPostcode("foo");

    // Assert side effects
    Assert.assertEquals("foo", addressForm.getPostcode());
  }
}
