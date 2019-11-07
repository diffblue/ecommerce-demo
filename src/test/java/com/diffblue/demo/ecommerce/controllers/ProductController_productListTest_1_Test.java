package com.diffblue.demo.ecommerce.controllers;

import com.diffblue.demo.ecommerce.controllers.ProductController;
import com.diffblue.demo.ecommerce.repositories.CategoryRepository;
import com.diffblue.demo.ecommerce.repositories.ProductRepository;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ProductController_productListTest_1_Test {
  @Test
  public void productListTest() throws Exception {
    // Arrange
    ProductController productController = new ProductController(Whitebox.newInstance(CategoryRepository.class),
        Whitebox.newInstance(ProductRepository.class));
    String category = "aaaaa";
    HashMap<String, Object> hashMap = new HashMap<String, Object>();
    hashMap.put("aaaaa", "aaaaa");

    // Act
    String actual = productController.productList(category, hashMap);

    // Assert
    Assert.assertEquals("redirect:/exception", actual);
    Assert.assertEquals(1, hashMap.size());
    Object getResult = hashMap.get("aaaaa");
    Assert.assertTrue(getResult instanceof String);
    Assert.assertEquals("aaaaa", getResult);
    Assert.assertNotNull(productController.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
