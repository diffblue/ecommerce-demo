package com.diffblue.demo.ecommerce.forms;

import com.diffblue.demo.ecommerce.forms.PaymentForm;
import java.util.Date;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PaymentForm_setExpiryDateTest_7_Test {
//failed_pass   @Test
//  public void setExpiryDateTest() throws Exception {
//    // Arrange
//    PaymentForm paymentForm = new PaymentForm();
//    Date date = new Date(1L);
//
//    // Act
//    paymentForm.setExpiryDate(date);
//
//    // Assert
//    int year = date.getYear();
//    int timezoneOffset = date.getTimezoneOffset();
//    int hours = date.getHours();
//    String toStringResult = date.toString();
//    int minutes = date.getMinutes();
//    long time = date.getTime();
//    int seconds = date.getSeconds();
//    int month = date.getMonth();
//    int date1 = date.getDate();
//    String toLocaleStringResult = date.toLocaleString();
//    Assert.assertEquals(70, year);
//    Assert.assertEquals(4, date.getDay());
//    Assert.assertEquals("Jan 1, 1970 12:00:00 AM", toLocaleStringResult);
//    Assert.assertEquals(1, date1);
//    Assert.assertEquals(0, month);
//    Assert.assertEquals(0, seconds);
//    Assert.assertEquals(1L, time);
//    Assert.assertEquals(0, minutes);
//    Assert.assertEquals("Thu Jan 01 00:00:00 UTC 1970", toStringResult);
//    Assert.assertEquals(0, hours);
//    Assert.assertEquals(0, timezoneOffset);
//    String cvv = paymentForm.getCvv();
//    String toStringResult1 = paymentForm.toString();
//    Date expiryDate = paymentForm.getExpiryDate();
//    String cardNumber = paymentForm.getCardNumber();
//    Assert.assertEquals(null, cvv);
//    Assert.assertEquals(null, paymentForm.getNameOnCard());
//    Assert.assertEquals(null, cardNumber);
//    Assert.assertSame(date, expiryDate);
//    Assert.assertNotNull(toStringResult1);
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
