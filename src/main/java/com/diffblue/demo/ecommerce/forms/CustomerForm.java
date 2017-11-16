package com.diffblue.demo.ecommerce.forms;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;

public class CustomerForm {

  @NotEmpty
  private String firstName;

  @NotEmpty
  private String lastName;

  @NotEmpty
  @Email
  private String email;

  @NotEmpty
  private String phoneNumber;

  @Valid
  private AddressForm shippingAddressForm;

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

  public AddressForm getShippingAddress() {
    return shippingAddressForm;
  }

  public void setShippingAddress(AddressForm shippingAddressForm) {
    this.shippingAddressForm = shippingAddressForm;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

}
