package com.diffblue.demo.ecommerce;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Cart {

  private Map<Product, Integer> cartItems;
  private BigDecimal subtotal;
  private BigDecimal total;

  /**
   * Constructor.
   */
  public Cart() {
    cartItems = new HashMap<>();
    subtotal = new BigDecimal(0);
    total = new BigDecimal(0);
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
    this.subtotal = this.subtotal.add(product.getPrice());
  }

  public Map<Product, Integer> getProducts() {
    return cartItems;
  }

  /**
   * Get cart subtotal.
   * @return products subtotal
   */
  public BigDecimal getSubtotal() {
    return subtotal;
  }

  /**
   * Get cart total.
   * @return cart total
   */
  public BigDecimal getTotal() {
    return subtotal;
  }
}
