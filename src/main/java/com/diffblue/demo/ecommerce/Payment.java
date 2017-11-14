package com.diffblue.demo.ecommerce;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Payment {

  @NotEmpty
  @Size(min = 16, max = 19)
  private String cardNumber;

  @NotEmpty
  private String nameOnCard;

  @NotNull
  @Future
  @DateTimeFormat(pattern = "MM/YY")
  private Date expiryDate;

  @NotEmpty
  @Size(min = 3, max = 4)
  private String cvv;


  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }

  public String getNameOnCard() {
    return nameOnCard;
  }

  public void setNameOnCard(String nameOnCard) {
    this.nameOnCard = nameOnCard;
  }

  public Date getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(Date expiryDate) {
    this.expiryDate = expiryDate;
  }

  public String getCvv() {
    return cvv;
  }

  public void setCvv(String cvv) {
    this.cvv = cvv;
  }
}
