package com.diffblue.demo.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

import javax.servlet.http.HttpSession;

@Controller
public class CartController {

  private final ProductRepository productRepo;

  @Autowired
  public CartController(ProductRepository productRepo) {
    this.productRepo = productRepo;
  }

  /**
   * Get the cart data and display it on the cart view page.
   * @param model where to put cart data
   * @return Page for the output
   */

  @RequestMapping("/cart")
  public String viewCart(Map<String, Object> model, HttpSession session) {
    Cart shoppingCart = new Cart();
    if (session.getAttribute("shoppingCart") != null) {
      shoppingCart = (Cart) session.getAttribute("shoppingCart");
    }
    model.put("cart", shoppingCart);
    return "Cart";
  }

  /**
   * Add product to cart.
   * @param product the product to add to the cart
   * @return Page for the output
   */
  @PostMapping("/addToCart")
  public String addToCart(@ModelAttribute Product product, HttpSession session) {

    Cart shoppingCart = null;
    Product prod = this.productRepo.findById(product.getId());

    if (prod != null) {
      if (session.getAttribute("shoppingCart") == null) {
        shoppingCart = new Cart();
      } else {
        shoppingCart = (Cart) session.getAttribute("shoppingCart");
      }
      shoppingCart.addProduct(prod);
      session.setAttribute("shoppingCart",shoppingCart);
    }

    return "redirect:/cart";
  }

  /**
   * Remove a given product from the cart.
   * @param id product id
   * @return Page for the output
   */
  @RequestMapping("/removeFromCart/{id}")
  public String removeFromCart(@PathVariable("id") int id, HttpSession session) {
    Product prod = this.productRepo.findById(id);
    if (prod != null) {
      if (session.getAttribute("shoppingCart") != null) {
        Cart shoppingCart = (Cart) session.getAttribute("shoppingCart");
        shoppingCart.removeProduct(prod);
        session.setAttribute("shoppingCart",shoppingCart);
      } else {
        Application.log.info("Shopping cart not created");
      }
    } else {
      Application.log.info("Unknown product id provided: " + id);
    }
    return "redirect:/cart";
  }

}
