package com.diffblue.demo.ecommerce.models;

// Copyright 2016-2018 DiffBlue limited. All rights reserved.

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "order_items")
public class OrderItem {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @NotNull
  private int id;

  @Column(name = "quantity")
  @NotNull
  private int quantity;

  @OneToOne
  @JoinColumn(name = "order_id")
  private Order order;

  @OneToOne
  @JoinColumn(name = "product_id")
  private Product product;


  /**
   * Order Item constructor.
   * @param order - order object
   * @param product - product object
   * @param quantity - product quantity ordered
   */
  public OrderItem(Order order, Product product, int quantity) {
    this.order = order;
    this.product = product;
    this.quantity = quantity;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }
}
