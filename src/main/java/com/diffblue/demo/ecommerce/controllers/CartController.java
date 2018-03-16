package com.diffblue.demo.ecommerce.controllers;

// Copyright 2016-2018 Diffblue Limited. All rights reserved.

import com.diffblue.demo.ecommerce.Application;
import com.diffblue.demo.ecommerce.models.Cart;
import com.diffblue.demo.ecommerce.models.Product;
import com.diffblue.demo.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
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
    Cart shoppingCart = getOrCreateSessionCart(session);
    model.put("cart", shoppingCart);
    return "Cart";
  }

  /**
   * Add product to cart.
   * @param product the product to add to the cart
   * @return Page for the output
   */
  @PostMapping("/addToCart")
  public String addToCart(@ModelAttribute Product product, HttpSession session,
                          @RequestParam String size) {

    Product prod = this.productRepo.findById(product.getId());
    prod.setSize(size);
    if (prod != null) {
      Cart shoppingCart = getOrCreateSessionCart(session);
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
  @RequestMapping("/removeFromCart/{id}/size/{size}")
  public String removeFromCart(@PathVariable("id") int id, HttpSession session,
                               @PathVariable("size") String size) {
    return this.updateCart(id, 0, session, size);
  }

  /**
   * Update a given product quantity in the cart.
   * @param request http request, session current http session
   */
  @PostMapping("/updateCartItem")
  public String updateCartItem(HttpServletRequest request, HttpSession session) {
    int id = Integer.parseInt(request.getParameter("product_id"));
    int newQty = Integer.parseInt(request.getParameter("quantity"));
    String size = request.getParameter("size");
    return this.updateCart(id, newQty, session, size);
  }

  /**
   * Update a given product quantity in the cart.
   * @param productId product id, quantity new quantity, session - current session
   * @return Page for the output
   */
  public String updateCart(int productId, int quantity, HttpSession session, String size) {
    Product prod = this.productRepo.findById(productId);
    if (prod != null) {
      Cart shoppingCart = this.getSessionCart(session);
      if (shoppingCart != null) {
        shoppingCart.updateProductQuantity(prod, quantity, size);
        session.setAttribute("shoppingCart",shoppingCart);
      }
    } else {
      Application.log.info("Unknown product id provided: " + productId);
    }
    return "redirect:/cart";
  }


  /**
   * Get cart in current session.
   * @param session - current session
   * @return Current session if set, null otherwise
   */
  public Cart getSessionCart(HttpSession session) {
    Cart shoppingCart = null;
    if (session.getAttribute("shoppingCart") != null) {
      shoppingCart = (Cart) session.getAttribute("shoppingCart");
    }
    return shoppingCart;
  }

  /**
   * Get cart in current session, or create one if doesn't exist.
   * @param session - current session
   * @return Current session if set, new cart otherwise
   */
  public Cart getOrCreateSessionCart(HttpSession session) {

    Cart shoppingCart = getSessionCart(session);
    if (shoppingCart == null) {
      shoppingCart = new Cart();
    }

    return shoppingCart;
  }

}
