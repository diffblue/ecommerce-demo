package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.PaymentForm;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class PaymentFormTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getCardNumberOutputNull() {

    // Arrange
    final PaymentForm paymentForm = new PaymentForm();

    // Act and Assert result
    Assert.assertNull(paymentForm.getCardNumber());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCvvOutputNull() {

    // Arrange
    final PaymentForm paymentForm = new PaymentForm();

    // Act and Assert result
    Assert.assertNull(paymentForm.getCvv());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getExpiryDateOutputNull() {

    // Arrange
    final PaymentForm paymentForm = new PaymentForm();

    // Act and Assert result
    Assert.assertNull(paymentForm.getExpiryDate());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNameOnCardOutputNull() {

    // Arrange
    final PaymentForm paymentForm = new PaymentForm();

    // Act and Assert result
    Assert.assertNull(paymentForm.getNameOnCard());
  }
}
