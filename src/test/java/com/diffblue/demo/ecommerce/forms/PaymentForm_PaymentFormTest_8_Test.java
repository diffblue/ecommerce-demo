package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.PaymentForm;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PaymentForm_PaymentFormTest_8_Test {
  @Test
  public void PaymentFormTest() throws Exception {
    // Arrange and Act
    PaymentForm paymentForm = new PaymentForm();

    // Assert
    String cvv = paymentForm.getCvv();
    String toStringResult = paymentForm.toString();
    Date expiryDate = paymentForm.getExpiryDate();
    String cardNumber = paymentForm.getCardNumber();
    Assert.assertEquals(null, cvv);
    Assert.assertEquals(null, paymentForm.getNameOnCard());
    Assert.assertEquals(null, cardNumber);
    Assert.assertEquals(null, expiryDate);
    Assert.assertNotNull(toStringResult);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
