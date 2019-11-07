package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.PaymentForm;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PaymentForm_setCardNumberTest_5_Test {
  @Test
  public void setCardNumberTest() throws Exception {
    // Arrange
    PaymentForm paymentForm = new PaymentForm();
    String cardNumber = "aaaaa";

    // Act
    paymentForm.setCardNumber(cardNumber);

    // Assert
    String cvv = paymentForm.getCvv();
    String toStringResult = paymentForm.toString();
    Date expiryDate = paymentForm.getExpiryDate();
    String cardNumber1 = paymentForm.getCardNumber();
    Assert.assertEquals(null, cvv);
    Assert.assertEquals(null, paymentForm.getNameOnCard());
    Assert.assertEquals("aaaaa", cardNumber1);
    Assert.assertEquals(null, expiryDate);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
