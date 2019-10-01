package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Cart;
import com.diffblue.demo.ecommerce.models.Category;
import com.diffblue.demo.ecommerce.models.Collection;
import com.diffblue.demo.ecommerce.models.Product;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import java.util.HashMap;
import java.util.Map;

public class CartTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void checkInvalidOutputNull() {

    // Arrange
    final Cart cart = new Cart();

    // Act and Assert result
    Assert.assertNull(cart.checkInvalid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkInvalidOutputNull2() {

    // Arrange
    final Cart cart = new Cart();
    final Product product = new Product();
    final Collection collection = new Collection();
    product.setCollection(collection);
    cart.addProduct(product);

    // Act and Assert result
    Assert.assertNull(cart.checkInvalid());
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkTaxInputNotNullZeroOutputZero2() {

    // Arrange
    final Cart cart = new Cart();
    final Product product1 = new Product();
    cart.addProduct(product1);
    final Product product = new Product();

    // Act and Assert result
    Assert.assertEquals(0.0, cart.checkTax(product, 0.0), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void checkTaxInputNotNullZeroOutputZero() {

    // Arrange
    final Cart cart = new Cart();
    final Product product = new Product();

    // Act and Assert result
    Assert.assertEquals(0.0, cart.checkTax(product, 0.0), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getProductsOutput0() {

    // Arrange
    final Cart cart = new Cart();

    // Act
    final Map<Product, Integer> actual = cart.getProducts();

    // Assert result
    final HashMap<Product, Integer> hashMap = new HashMap<Product, Integer>();
    Assert.assertEquals(hashMap, actual);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getShippingOutputPositive() {

    // Arrange
    final Cart cart = new Cart();

    // Act and Assert result
    Assert.assertEquals(4.5, cart.getShipping(), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSubtotalOutputZero() {

    // Arrange
    final Cart cart = new Cart();

    // Act and Assert result
    Assert.assertEquals(0.0, cart.getSubtotal(), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTaxOutputZero() {

    // Arrange
    final Cart cart = new Cart();

    // Act and Assert result
    Assert.assertEquals(0.0, cart.getTax(), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getTotalOutputZero() {

    // Arrange
    final Cart cart = new Cart();

    // Act and Assert result
    Assert.assertEquals(0.0, cart.getTotal(), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void updateProductQuantityInputNotNullZeroNotNullOutputVoid() {

    // Arrange
    final Cart cart = new Cart();
    final Product product = new Product();

    // Act
    cart.updateProductQuantity(product, 0, "foo");

    // Assert side effects
    Assert.assertNotNull(product);
    Assert.assertNull(product.getDescription());
    Assert.assertEquals("foo", product.getSize());
    Assert.assertNull(product.getCategory());
    Assert.assertNull(product.getPhoto());
    Assert.assertNull(product.getName());
    Assert.assertNull(product.getCollection());
    Assert.assertEquals(0, product.getId());
    Assert.assertNull(product.getSku());
    Assert.assertEquals(0.0, product.getPrice(), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void updateProductQuantityInputNotNullZeroNotNullOutputVoid2() {

    // Arrange
    final Cart cart = new Cart();
    final Product product1 = new Product();
    cart.addProduct(product1);
    cart.setSubtotal(-1.0);
    cart.setTax(0.0);
    final Product product = new Product();
    product.setPrice(-1.0);

    // Act
    cart.updateProductQuantity(product, 0, "foo");

    // Assert side effects
    Assert.assertNotNull(product);
    Assert.assertNull(product.getDescription());
    Assert.assertEquals("foo", product.getSize());
    Assert.assertNull(product.getCategory());
    Assert.assertNull(product.getPhoto());
    Assert.assertNull(product.getName());
    Assert.assertNull(product.getCollection());
    Assert.assertEquals(0, product.getId());
    Assert.assertNull(product.getSku());
    Assert.assertEquals(-1.0, product.getPrice(), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void updateProductQuantityInputNotNullZeroNotNullOutputVoid3() {

    // Arrange
    final Cart cart = new Cart();
    final Product product1 = new Product();
    final Collection collection = new Collection();
    collection.setId(536_969_217);
    product1.setCollection(collection);
    product1.setSize("foo");
    final Category category = new Category();
    category.setId(-1_410_367_489);
    product1.setCategory(category);
    cart.addProduct(product1);
    cart.setSubtotal(0x1.ep+24 /* 3.14573e+07 */);
    cart.setTax(0.0);
    final Product product = new Product();
    final Collection collection1 = new Collection();
    collection1.setId(536_969_217);
    product.setCollection(collection1);
    final Category category1 = new Category();
    category1.setId(-1_410_367_489);
    product.setCategory(category1);

    // Act
    cart.updateProductQuantity(product, 0, "foo");

    // Assert side effects
    final HashMap<Product, Integer> hashMap = new HashMap<Product, Integer>();
    Assert.assertEquals(hashMap, cart.getProducts());
    Assert.assertNotNull(product);
    Assert.assertNull(product.getDescription());
    Assert.assertEquals("foo", product.getSize());
    Assert.assertNotNull(product.getCategory());
    Assert.assertEquals(-1_410_367_489, product.getCategory().getId());
    Assert.assertNull(product.getCategory().getName());
    Assert.assertNull(product.getPhoto());
    Assert.assertNull(product.getName());
    Assert.assertNotNull(product.getCollection());
    Assert.assertEquals(536_969_217, product.getCollection().getId());
    Assert.assertNull(product.getCollection().getName());
    Assert.assertEquals(0, product.getId());
    Assert.assertNull(product.getSku());
    Assert.assertEquals(0.0, product.getPrice(), 0.0);
  }
}
