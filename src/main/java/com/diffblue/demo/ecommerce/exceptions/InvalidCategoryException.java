package com.diffblue.demo.ecommerce;

public class InvalidCategoryException extends Exception {
  private int status;
  private String message;
  
  public InvalidCategoryException(int status, String message) {
    this.status = status;
    this.message = message;
  } 
  
  public String getMessage() {
    return message;
  }

  public int getStatus() {
    return status;
  }
}
