package com.diffblue.demo.ecommerce.models;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name  = "addresses")
public class Address {

  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @NotNull
  private int id;

  @Column(name = "company")
  private String company;

  @Column(name = "address")
  @NotEmpty
  private String addressLine;

  @Column(name = "city")
  @NotEmpty
  private String city;

  @Column(name = "country")
  @NotEmpty
  private String country;

  @Column(name = "postcode")
  @NotEmpty
  private String postcode;


  /**
   * Address constructor where company name is provided.
   * @param company - company name
   * @param address - address line
   * @param city - city
   * @param country - country
   * @param postcode - postcode
   */
  public Address(String company, String address, String city, String country, String postcode) {
    this.company = company;
    this.addressLine = address;
    this.city = city;
    this.country = country;
    this.postcode = postcode;
  }

  /**
   * Address constructor where company name is not provided.
   * @param address - address line
   * @param city - city
   * @param country - country
   * @param postcode - postcode
   */
  public Address(String address, String city, String country, String postcode) {
    this.addressLine = address;
    this.city = city;
    this.country = country;
    this.postcode = postcode;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

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
