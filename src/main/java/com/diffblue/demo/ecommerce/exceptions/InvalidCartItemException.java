package com.diffblue.demo.ecommerce;

import com.diffblue.demo.ecommerce.models.Product;

public class InvalidCartItemException extends Exception {
  private int status;
  private String message;
  private Product product;
  
  /**
   * InvalidCartItemException constructor.
   * @param status - http status code to be returned to the user
   * @param message - message to be displayed to the user
   * @param product - product object belonging to the invalid item
   */
  public InvalidCartItemException(int status, String message, Product product) {
    this.status = status;
    this.message = message + " ("
      + product.getName() + " - "
      + product.getCollection().getName() + " - "
      + product.getSize() + ")";
    this.product = product;
  } 
  
  public String getMessage() {
    return message;
  }
  
  public int getStatus() {
    return status;
  }  
}
