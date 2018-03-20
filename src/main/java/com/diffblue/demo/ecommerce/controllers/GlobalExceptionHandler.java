package com.diffblue.demo.ecommerce.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

  @ExceptionHandler(value = Exception.class)
  public String defaultExceptionHandler(Exception exception) throws Exception {
    return "redirect:/exception";
  }
}
