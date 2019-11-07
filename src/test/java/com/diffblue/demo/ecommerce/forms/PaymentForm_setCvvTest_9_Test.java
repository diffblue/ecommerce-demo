package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.PaymentForm;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PaymentForm_setCvvTest_9_Test {
  @Test
  public void setCvvTest() throws Exception {
    // Arrange
    PaymentForm paymentForm = new PaymentForm();
    String cvv = "aaaaa";

    // Act
    paymentForm.setCvv(cvv);

    // Assert
    String cvv1 = paymentForm.getCvv();
    String toStringResult = paymentForm.toString();
    Date expiryDate = paymentForm.getExpiryDate();
    String cardNumber = paymentForm.getCardNumber();
    Assert.assertEquals("aaaaa", cvv1);
    Assert.assertEquals(null, paymentForm.getNameOnCard());
    Assert.assertEquals(null, cardNumber);
    Assert.assertEquals(null, expiryDate);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
