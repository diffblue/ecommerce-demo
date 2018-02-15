package com.diffblue.demo.ecommerce.models;

// Copyright 2016-2018 DiffBlue limited. All rights reserved.

import org.hibernate.validator.constraints.NotEmpty;

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
@Table(name = "orders")
public class Order {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @NotNull
  private int id;

  @Column(name = "order_ref")
  @NotEmpty
  private String orderRef;

  @Column(name = "first_name")
  @NotEmpty
  private String firstName;

  @Column(name = "last_name")
  @NotEmpty
  private String lastName;

  @Column(name = "email")
  @NotEmpty
  private String email;

  @Column(name = "phone")
  @NotEmpty
  private String phoneNumber;

  @OneToOne
  @JoinColumn(name = "shipping_address_id")
  private Address shippingAddress;

  /**
   * Order constructor.
   * @param orderRef - order reference
   * @param firstName - customer first name
   * @param lastName - customer last name
   * @param email - customer email
   * @param phoneNumber - customer phone number
   * @param shippingAddress - shipping address
   */
  public Order(String orderRef, String firstName, String lastName, 
               String email, String phoneNumber, Address shippingAddress) {
    this.orderRef = orderRef;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.shippingAddress = shippingAddress;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getOrderRef() {
    return orderRef;
  }

  public void setOrderRef(String orderRef) {
    this.orderRef = orderRef;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public Address getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Address shippingAddress) {
    this.shippingAddress = shippingAddress;
  }
}
