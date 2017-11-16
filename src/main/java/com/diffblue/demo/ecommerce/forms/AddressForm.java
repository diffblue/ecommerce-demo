package com.diffblue.demo.ecommerce.forms;

import org.hibernate.validator.constraints.NotEmpty;

public class AddressForm {

  private String company;

  @NotEmpty
  private String addressLine;

  @NotEmpty
  private String city;

  @NotEmpty
  private String country;

  @NotEmpty
  private String postcode;

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getAddressLine() {
    return addressLine;
  }

  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getPostcode() {
    return postcode;
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

}
