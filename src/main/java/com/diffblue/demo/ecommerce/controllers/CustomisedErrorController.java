package com.diffblue.demo.ecommerce.controllers;

import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

@Controller
public class CustomisedErrorController implements ErrorController {

  private final ErrorAttributes attributes;

  public CustomisedErrorController(ErrorAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * Calls the /error endpoint when an error arises.
   */
  @Override
  public String getErrorPath() {
    return "/error";
  }

  /**
   * Displays the CustomisedError.html page and gets the details of the Http error.
   */
  @RequestMapping("/error")
  public String customError(Model model, HttpServletRequest request) {
    Map<String, Object> errormap = retriveErrorAttributes(true, request);
    model.addAttribute("status",errormap.get("status"));
    model.addAttribute("error",errormap.get("error"));
    model.addAttribute("message",errormap.get("message"));
    model.addAttribute("timestamp",errormap.get("timestamp"));
    model.addAttribute("path",errormap.get("path"));
    return "CustomisedError";
  }

  private Map<String, Object> retriveErrorAttributes(boolean includeStackTrace,
                                                     HttpServletRequest httpServletRequest) {
    RequestAttributes requestAttributes = new ServletRequestAttributes(httpServletRequest);
    Map<String, Object> errormap = this.attributes.getErrorAttributes(requestAttributes,
            includeStackTrace);
    return errormap;
  }
}
