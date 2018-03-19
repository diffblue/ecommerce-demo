package com.diffblue.demo.ecommerce.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
public class CustomisedErrorController implements ErrorController {

    private final ErrorAttributes attributes;

    public CustomisedErrorController(ErrorAttributes attributes) {
        this.attributes = attributes;
    }
    @Override
    public String getErrorPath() {
        return "/error";
    }

    @RequestMapping("/error")
    public String customError(Model model, HttpServletRequest request) {
        Map<String, Object> errormap = retriveErrorAttributes(true, request);
        model.addAttribute("status",errormap.get("status"));
        model.addAttribute("error",errormap.get("error"));
        model.addAttribute("message",errormap.get("message"));
        model.addAttribute("timestamp",errormap.get("timestamp"));
        model.addAttribute("path",errormap.get("path"));
        model.addAttribute("title","Some thing went wrong");
        model.addAttribute("solution","try after some time. If the issue persists then create a trouble ticket.");
        return"CustomisedError";
    }
    private Map<String, Object> retriveErrorAttributes(boolean includeStackTrace, HttpServletRequest httpServletRequest){
        RequestAttributes requestAttributes = new ServletRequestAttributes(httpServletRequest);
        Map<String, Object> errormap = this.attributes.getErrorAttributes(requestAttributes, includeStackTrace);
        return errormap;
    }
}