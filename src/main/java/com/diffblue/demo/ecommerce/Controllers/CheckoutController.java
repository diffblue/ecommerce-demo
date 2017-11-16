package com.diffblue.demo.ecommerce.controllers;

import com.diffblue.demo.ecommerce.forms.CustomerForm;
import com.diffblue.demo.ecommerce.models.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class CheckoutController {


  @Autowired
  public CheckoutController() { }


  /**
   * Get the cart data and display it on the customerForm information page.
   * @param model where to put cart data, session current http session
   * @return Page for the output
   */

  @RequestMapping("/checkout")
  public String viewCheckoutPage(Map<String, Object> model, HttpSession session,
                                 CustomerForm customerForm) {
    if (session.getAttribute("shoppingCart") != null) {
      Cart shoppingCart = (Cart) session.getAttribute("shoppingCart");
      model.put("cart", shoppingCart);
      return "Checkout";
    } else {
      return "redirect:/cart";
    }
  }

  /**
   * Save customerForm information page.
   * @param customerForm - customerForm object
   * @param bindingResult - object with form validation result
   * @param session - current http session
   * @return page for the output
   */
  @PostMapping("/checkout")
  public String saveCustomerInformation(@Valid CustomerForm customerForm,
                                          BindingResult bindingResult, Map<String, Object> model,
                                            HttpSession session) {
    if (bindingResult.hasErrors()) {
      Cart shoppingCart = (Cart) session.getAttribute("shoppingCart");
      model.put("cart", shoppingCart);
      return "Checkout";
    } else {
      session.setAttribute("customerInformation", customerForm);
      return "redirect:/payment";
    }

  }

  /**
   * Get the cart and customer data and display it on the payment page.
   * @param model where to put cart data, session current http session
   * @return Page for the output
   */
  @RequestMapping("/payment")
  public String viewPaymentPage(Map<String, Object> model, HttpSession session) {


    if (session.getAttribute("shoppingCart") != null
        && session.getAttribute("customerInformation") != null) {

      Cart shoppingCart = (Cart) session.getAttribute("shoppingCart");
      CustomerForm customerForm = (CustomerForm) session.getAttribute("customerInformation");

      model.put("cart", shoppingCart);
      model.put("customerForm", customerForm);

      return "Payment";

    } else {
      return "redirect:/checkout";
    }
  }

}
