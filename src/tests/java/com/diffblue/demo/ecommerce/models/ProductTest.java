package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Category;
import com.diffblue.demo.ecommerce.models.Collection;
import com.diffblue.demo.ecommerce.models.Product;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ProductTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse() {

    // Arrange
    final Product product = new Product();
    product.setName("foo");
    final Product obj = new Product();
    obj.setDescription("foo");

    // Act and Assert result
    Assert.assertFalse(product.equals(obj));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse2() {

    // Arrange
    final Product product = new Product();
    product.setId(1);
    product.setName("foo");
    final Product obj = new Product();
    obj.setDescription("foo");

    // Act and Assert result
    Assert.assertFalse(product.equals(obj));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse3() {

    // Arrange
    final Product product = new Product();
    product.setId(0);
    product.setSize("foo");
    final Product obj = new Product();
    obj.setDescription("foo");

    // Act and Assert result
    Assert.assertFalse(product.equals(obj));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse4() {

    // Arrange
    final Product product = new Product();
    product.setId(0);
    final Category category = new Category();
    product.setCategory(category);
    final Collection collection = new Collection();
    product.setCollection(collection);
    product.setSize("foo");
    final Product obj = new Product();
    final Category category1 = new Category();
    obj.setCategory(category1);
    obj.setPrice(12.0);
    final Collection collection1 = new Collection();
    obj.setCollection(collection1);
    obj.setSize("foo");

    // Act and Assert result
    Assert.assertFalse(product.equals(obj));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse5() {

    // Arrange
    final Product product = new Product();
    product.setId(0);
    final Category category = new Category();
    category.setId(1);
    product.setCategory(category);
    product.setPrice(0.0);
    final Collection collection = new Collection();
    product.setCollection(collection);
    product.setSize("foo");
    final Product obj = new Product();
    final Category category1 = new Category();
    obj.setCategory(category1);
    final Collection collection1 = new Collection();
    obj.setCollection(collection1);
    obj.setSize("foo");

    // Act and Assert result
    Assert.assertFalse(product.equals(obj));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse6() {

    // Arrange
    final Product product = new Product();
    product.setId(0);
    final Category category = new Category();
    category.setId(0);
    product.setCategory(category);
    product.setPrice(0.0);
    final Collection collection = new Collection();
    product.setCollection(collection);
    product.setSize("foo");
    final Product obj = new Product();
    final Category category1 = new Category();
    obj.setCategory(category1);
    obj.setDescription("foo");
    final Collection collection1 = new Collection();
    obj.setCollection(collection1);
    obj.setSize("foo");

    // Act and Assert result
    Assert.assertFalse(product.equals(obj));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse7() {

    // Arrange
    final Product product = new Product();
    product.setId(0);
    final Category category = new Category();
    category.setId(0);
    product.setCategory(category);
    product.setPrice(0.0);
    final Collection collection = new Collection();
    collection.setId(1);
    product.setCollection(collection);
    product.setSize("foo");
    final Product obj = new Product();
    final Category category1 = new Category();
    obj.setCategory(category1);
    obj.setDescription("foo");
    final Collection collection1 = new Collection();
    obj.setCollection(collection1);
    obj.setSize("foo");

    // Act and Assert result
    Assert.assertFalse(product.equals(obj));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue() {

    // Arrange
    final Product product = new Product();
    product.setId(0);
    final Category category = new Category();
    product.setCategory(category);
    product.setPrice(0.0);
    final Collection collection = new Collection();
    product.setCollection(collection);
    product.setSize("foo");
    final Product obj = new Product();
    final Category category1 = new Category();
    obj.setCategory(category1);
    final Collection collection1 = new Collection();
    obj.setCollection(collection1);
    obj.setSize("foo");

    // Act and Assert result
    Assert.assertTrue(product.equals(obj));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNullOutputFalse() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertFalse(product.equals(null));
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCategoryOutputNull() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertNull(product.getCategory());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getCollectionOutputNull() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertNull(product.getCollection());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getDescriptionOutputNull() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertNull(product.getDescription());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getIdOutputZero() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertEquals(0, product.getId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNameOutputNull() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertNull(product.getName());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPhotoOutputNull() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertNull(product.getPhoto());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getPriceOutputZero() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertEquals(0.0, product.getPrice(), 0.0);
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSizeOutputNull() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertNull(product.getSize());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getSkuOutputNull() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertNull(product.getSku());
  }

  // Test written by Diffblue Cover.
  @Test
  public void hashCodeOutputZero() {

    // Arrange
    final Product product = new Product();

    // Act and Assert result
    Assert.assertEquals(0, product.hashCode());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setDescriptionInputNotNullOutputVoid() {

    // Arrange
    final Product product = new Product();

    // Act
    product.setDescription("foo");

    // Assert side effects
    Assert.assertEquals("foo", product.getDescription());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setNameInputNotNullOutputVoid() {

    // Arrange
    final Product product = new Product();

    // Act
    product.setName("foo");

    // Assert side effects
    Assert.assertEquals("foo", product.getName());
  }

  // Test written by Diffblue Cover.
  @Test
  public void setSkuInputNotNullOutputVoid() {

    // Arrange
    final Product product = new Product();

    // Act
    product.setSku("foo");

    // Assert side effects
    Assert.assertEquals("foo", product.getSku());
  }
}
