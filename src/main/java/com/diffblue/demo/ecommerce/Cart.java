package com.diffblue.demo.ecommerce;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Cart {

  private Map<Product, Integer> cartItems;
  private BigDecimal subtotal;

  /**
   * Constructor.
   */
  public Cart() {
    cartItems = new HashMap<>();
    subtotal = new BigDecimal(0);
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

  public void setSubtotal(BigDecimal subtotal) {
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

      BigDecimal totalToUpdate = new BigDecimal(diff);
      totalToUpdate = totalToUpdate.multiply(product.getPrice());
      this.setSubtotal(this.subtotal.add(totalToUpdate));

      if (newQty == 0) {
        cartItems.remove(product);
      } else {
        cartItems.replace(product, newQty);
      }
    }
  }


}
