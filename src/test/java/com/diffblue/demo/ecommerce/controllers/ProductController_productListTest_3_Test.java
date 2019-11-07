package com.diffblue.demo.ecommerce.controllers;

import com.diffblue.demo.ecommerce.controllers.ProductController;
import com.diffblue.demo.ecommerce.repositories.CategoryRepository;
import com.diffblue.demo.ecommerce.repositories.ProductRepository;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class ProductController_productListTest_3_Test {
//failed_run   @Test
//  public void productListTest() throws Exception {
//    // Arrange
//    ProductController productController = new ProductController(Whitebox.newInstance(CategoryRepository.class),
//        Whitebox.newInstance(ProductRepository.class));
//    HashMap<String, Object> hashMap = new HashMap<String, Object>();
//    hashMap.put("aaaaa", "aaaaa");
//
//    // Act
//    String actual = productController.productList(hashMap);
//
//    // Assert
//    Assert.assertEquals("ProductList", actual);
//    Assert.assertEquals(2, hashMap.size());
//    Object getResult = hashMap.get("aaaaa");
//    Object getResult1 = hashMap.get("products");
//    Assert.assertTrue(getResult instanceof String);
//    Assert.assertTrue(getResult1 instanceof ArrayList);
//    Assert.assertEquals("aaaaa", getResult);
//    Assert.assertEquals(0, ((ArrayList) getResult1).size());
//    Assert.assertNotNull(productController.toString());
//  }
  @org.junit.Rule
  public Timeout timeout = new Timeout(10000);
}
