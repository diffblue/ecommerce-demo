package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Cart;
import com.diffblue.demo.ecommerce.models.Category;
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
  public void checkTaxInputNotNullZeroOutputZero2() {

    // Arrange
    final Cart cart = new Cart();
    final Product product = new Product();
    product.setSize("Child");
    final Category category = new Category();
    product.setCategory(category);

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
  public void checkTaxInputNotNullZeroOutputZero3() {

    // Arrange
    final Cart cart = new Cart();
    final Product product = new Product();
    product.setSize("Child");
    final Category category = new Category();
    category.setName("Apparel");
    product.setCategory(category);

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
}
