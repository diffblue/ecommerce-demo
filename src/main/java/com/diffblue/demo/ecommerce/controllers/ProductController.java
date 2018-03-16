package com.diffblue.demo.ecommerce.controllers;

// Copyright 2016-2018 Diffblue limited. All rights reserved.

import com.diffblue.demo.ecommerce.Application;
import com.diffblue.demo.ecommerce.models.Product;
import com.diffblue.demo.ecommerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Controller for getting product information from the DB.
 * productList will get the names of all the products that are currently held in the DB
 */

@Controller
public class ProductController {

  private final ProductRepository productRepo;

  @Autowired
  public ProductController(ProductRepository productRepo2) {
    this.productRepo = productRepo2;
  }

  /**
   * Get the full list of products.
   * @param model where to put the list of product names (as Collection of strings)
   * @return Page for the output
   */

  @RequestMapping("/ProductList")
  public String productList(Map<String, Object> model) {

    Iterable<Product> allProducts = this.productRepo.findAll();
    Application.log.info("All Products as string: " + allProducts.toString());
    model.put("products", allProducts);
    return "ProductList";
  }

  /**
   * Get a given product data to display on the product page.
   * @param id product id, model where to put the product data
   * @return Product Page for the output
   */
  @RequestMapping("/product/{id}")
  public String productPage(@PathVariable("id") int id, Map<String, Object> model) {
    Product prod = this.productRepo.findById(id);
    if (prod != null) {
      Application.log.info("Product as string: " + prod.toString());
      model.put("product", prod);
      return "ProductPage";
    } else {
      Application.log.info("Unknown product id provided: " + id);
      return "redirect:/ProductList";
    }
  }
}
