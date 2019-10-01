package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.AddressForm;
import com.diffblue.demo.ecommerce.forms.CustomerForm;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CustomerFormTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getEmailOutputNull() {

    // Arrange
    final CustomerForm customerForm = new CustomerForm();

    // Act and Assert result
    Assert.assertNull(customerForm.getEmail());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getFirstNameOutputNull() {

    // Arrange
    final CustomerForm customerForm = new CustomerForm();

    // Act and Assert result
    Assert.assertNull(customerForm.getFirstName());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getLastNameOutputNull() {

    // Arrange
    final CustomerForm customerForm = new CustomerForm();

    // Act and Assert result
    Assert.assertNull(customerForm.getLastName());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPhoneNumberOutputNull() {

    // Arrange
    final CustomerForm customerForm = new CustomerForm();

    // Act and Assert result
    Assert.assertNull(customerForm.getPhoneNumber());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getShippingAddressOutputNull() {

    // Arrange
    final CustomerForm customerForm = new CustomerForm();

    // Act and Assert result
    Assert.assertNull(customerForm.getShippingAddress());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setShippingAddressInputNotNullOutputVoid() {

    // Arrange
    final CustomerForm customerForm = new CustomerForm();
    final AddressForm shippingAddressForm = new AddressForm();

    // Act
    customerForm.setShippingAddress(shippingAddressForm);

    // Assert side effects
    Assert.assertNotNull(customerForm.getShippingAddress());
    Assert.assertNull(customerForm.getShippingAddress().getPostcode());
    Assert.assertNull(customerForm.getShippingAddress().getCity());
    Assert.assertNull(customerForm.getShippingAddress().getCountry());
    Assert.assertNull(customerForm.getShippingAddress().getCompany());
    Assert.assertNull(customerForm.getShippingAddress().getAddressLine());
  }
}
