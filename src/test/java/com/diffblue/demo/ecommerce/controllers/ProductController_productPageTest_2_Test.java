package com.diffblue.demo.ecommerce.controllers;

import com.diffblue.demo.ecommerce.controllers.ProductController;
import com.diffblue.demo.ecommerce.repositories.CategoryRepository;
import com.diffblue.demo.ecommerce.repositories.ProductRepository;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ProductController_productPageTest_2_Test {
  @Test
  public void productPageTest() throws Exception {
    // Arrange
    ProductController productController = new ProductController(Whitebox.newInstance(CategoryRepository.class),
        Whitebox.newInstance(ProductRepository.class));
    int id = 1;
    HashMap<String, Object> hashMap = new HashMap<String, Object>();
    hashMap.put("aaaaa", "aaaaa");

    // Act
    String actual = productController.productPage(id, hashMap);

    // Assert
    Assert.assertEquals("redirect:/ProductList", actual);
    Assert.assertEquals(1, hashMap.size());
    Object getResult = hashMap.get("aaaaa");
    Assert.assertTrue(getResult instanceof String);
    Assert.assertEquals("aaaaa", getResult);
    Assert.assertNotNull(productController.toString());
  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
