package com.diffblue.demo.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import javax.servlet.http.HttpSession;

@Controller
public class CheckoutController {


  @Autowired
  public CheckoutController() { }


  /**
   * Get the cart data and display it on the customer information page.
   * @param model where to put cart data, session current http session
   * @return Page for the output
   */

  @RequestMapping("/checkout")
  public String viewCheckoutPage(Map<String, Object> model, HttpSession session) {
    if (session.getAttribute("shoppingCart") != null) {
      Cart shoppingCart = (Cart) session.getAttribute("shoppingCart");
      model.put("cart", shoppingCart);
      return "Checkout";
    } else {
      return "redirect:/cart";
    }
  }

}
