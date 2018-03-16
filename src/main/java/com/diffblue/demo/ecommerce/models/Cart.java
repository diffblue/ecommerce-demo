package com.diffblue.demo.ecommerce.models;

// Copyright 2016-2018 Diffblue Limited. All rights reserved.

import java.util.HashMap;
import java.util.Map;

public class Cart {

  private Map<Product, Integer> cartItems;
  private double subtotal;
  private double shipping;
  private double tax;
  private double taxRate;
  private double total;

  /**
   * Constructor.
   */
  public Cart() {
    cartItems = new HashMap<>();
    subtotal = 0;
    shipping = 4.50;
    tax = 0;
    taxRate = 0.20;
    total = 0;
  }

  /**
   * Add product to card.
   * @param product the product to add to the cart
   */

  public void addProduct(Product product) {
    if (cartItems.get(product) != null) {
      cartItems.put(product, cartItems.get(product) + 1);
    } else {
      cartItems.put(product, 1);
    }
    double productPrice = product.getPrice();
    tax = checkTax(product,productPrice);
    this.subtotal = this.subtotal + product.getPrice();
    setTotal(tax, shipping);
  }

  public Map<Product, Integer> getProducts() {
    return cartItems;
  }

  /**
   * Get cart subtotal.
   * @return products subtotal
   */

  public double getTax() {
    return tax;
  }

  public void setTax(double tax) {
    this.tax = tax;
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
  public void updateProductQuantity(Product product, int newQty, String size) {
    product.setSize(size);
    if (cartItems.containsKey(product)) {
      int currQty = cartItems.get(product);
      int diff = newQty - currQty;

      double totalToUpdate = (double) diff;
      totalToUpdate = totalToUpdate * product.getPrice();
      tax = checkTax(product, totalToUpdate);
      this.setSubtotal(this.subtotal + totalToUpdate);
      if (newQty == 0) {
        cartItems.remove(product);
      } else {
        cartItems.replace(product, newQty);
      }
      setTotal(tax, shipping);
    }
  }

  /**
   * Checks and calculates tax.
   * @return tax when adding or updaitng products
   */
  public double checkTax(Product product, double productTotal) {
    Category cateory = product.getCategory();
    if (!"Child".equals(product.getSize()) && "Apparel".equals(cateory.getName()) ) {
      this.tax = this.tax + (productTotal * taxRate);
    }
    return tax;
  }

  public double getShipping() {
    return shipping;
  }

  public void setTotal(double tax, double shipping) {
    this.total = shipping + tax;
  }

  public double getTotal() {
    return total + subtotal;
  }

}
