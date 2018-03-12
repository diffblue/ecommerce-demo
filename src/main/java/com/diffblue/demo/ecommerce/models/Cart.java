package com.diffblue.demo.ecommerce.models;

// Copyright 2016-2018 DiffBlue limited. All rights reserved.

import java.util.HashMap;
import java.util.Map;

public class Cart {

  private Map<Product, Integer> cartItems;
  private double subtotal;
  private double shipping;

  /**
   * Constructor.
   */
  public Cart() {
    cartItems = new HashMap<>();
    subtotal = 0;
    shipping = 4.50;
  }

  /**
   * Add product to card.
   * @param product the product to add to the cart
   */

  public void addProduct(Product product) {
    if (cartItems.get(product) != null) {
      cartItems.replace(product, cartItems.get(product) + 1);
    } else {
      cartItems.put(product, 1);
    }
    this.subtotal = this.subtotal + product.getPrice();
  }

  public Map<Product, Integer> getProducts() {
    return cartItems;
  }

  /**
   * Get cart subtotal.
   * @return products subtotal
   */
  public double getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(double subtotal) {
    this.subtotal = subtotal;
  }

  /**
   * Update product quantity in the cart.
   * @param product product to be update, newQty new quantity
   */
  public void updateProductQuantity(Product product, int newQty) {
    if (cartItems.containsKey(product)) {
      int currQty = cartItems.get(product);
      int diff = newQty - currQty;

      double totalToUpdate = (double) diff;
      totalToUpdate = totalToUpdate * product.getPrice();
      this.setSubtotal(this.subtotal + totalToUpdate);

      if (newQty == 0) {
        cartItems.remove(product);
      } else {
        cartItems.replace(product, newQty);
      }
    }
  }

  public double getShipping() {
    return shipping;
  }

  public double getTotal() {
    return subtotal + shipping;
  }


}
