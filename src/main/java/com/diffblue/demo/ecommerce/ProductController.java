package com.diffblue.demo.ecommerce;

// Copyright 2016-2017 DiffBlue limited. All rights reserved.

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

  @RequestMapping("/product/{id}")
  public String productPage(@PathVariable("id") String id, Map<String, Object> model) {
    Product prod = this.productRepo.findById(id);
    if(prod != null){
      Application.log.info("Product as string: " + prod.toString());
      model.put("product", prod);
      return "ProductPage";
    }else{
      return "redirect:/ProductList";
    }

  }
}
