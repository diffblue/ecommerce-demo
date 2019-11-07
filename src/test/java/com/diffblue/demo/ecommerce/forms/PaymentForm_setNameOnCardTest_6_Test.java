package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.PaymentForm;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PaymentForm_setNameOnCardTest_6_Test {
  @Test
  public void setNameOnCardTest() throws Exception {
    // Arrange
    PaymentForm paymentForm = new PaymentForm();
    String nameOnCard = "aaaaa";

    // Act
    paymentForm.setNameOnCard(nameOnCard);

    // Assert
    String toStringResult = paymentForm.toString();
    Date expiryDate = paymentForm.getExpiryDate();
    String cardNumber = paymentForm.getCardNumber();
    Assert.assertNotNull(toStringResult);
    Assert.assertEquals("aaaaa", paymentForm.getNameOnCard());
    Assert.assertEquals(null, cardNumber);
    Assert.assertEquals(null, expiryDate);
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
