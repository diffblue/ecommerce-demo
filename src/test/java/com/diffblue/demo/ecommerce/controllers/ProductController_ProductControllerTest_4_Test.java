package com.diffblue.demo.ecommerce.controllers;

import com.diffblue.demo.ecommerce.controllers.ProductController;
import com.diffblue.demo.ecommerce.repositories.CategoryRepository;
import com.diffblue.demo.ecommerce.repositories.ProductRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ProductController_ProductControllerTest_4_Test {
  @Test
  public void ProductControllerTest() throws Exception {
    // Arrange
    CategoryRepository categoryRepo2 = Whitebox.newInstance(CategoryRepository.class);
    ProductRepository productRepo2 = Whitebox.newInstance(ProductRepository.class);

    // Act
    ProductController productController = new ProductController(categoryRepo2, productRepo2);

    // Assert
    Assert.assertNotNull(productController.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
