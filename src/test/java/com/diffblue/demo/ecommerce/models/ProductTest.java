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

    // Act and Assert result
    Assert.assertFalse(product.equals(obj));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse2() {

    // Arrange
    final Product product = new Product();
    product.setName("foo");
    product.setId(1);
    final Product obj = new Product();

    // Act and Assert result
    Assert.assertFalse(product.equals(obj));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse3() {

    // Arrange
    final Product product = new Product();
    product.setSize("foo");
    final Product obj = new Product();

    // Act and Assert result
    Assert.assertFalse(product.equals(obj));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse4() {

    // Arrange
    final Product product = new Product();
    product.setSize("foo");
    final Collection collection = new Collection();
    collection.setId(4096);
    product.setCollection(collection);
    final Category category = new Category();
    category.setId(1);
    product.setCategory(category);
    final Product obj = new Product();
    obj.setSize("foo");
    final Collection collection1 = new Collection();
    collection1.setId(4096);
    obj.setCollection(collection1);
    final Category category1 = new Category();
    obj.setCategory(category1);

    // Act and Assert result
    Assert.assertFalse(product.equals(obj));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse5() {

    // Arrange
    final Product product = new Product();
    product.setSize("foo");
    product.setPrice(-1.0);
    final Collection collection = new Collection();
    collection.setId(4096);
    product.setCollection(collection);
    final Category category = new Category();
    category.setId(0);
    product.setCategory(category);
    final Product obj = new Product();
    obj.setSize("foo");
    obj.setPrice(256.0);
    final Collection collection1 = new Collection();
    collection1.setId(4096);
    obj.setCollection(collection1);
    final Category category1 = new Category();
    obj.setCategory(category1);

    // Act and Assert result
    Assert.assertFalse(product.equals(obj));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse6() {

    // Arrange
    final Product product = new Product();
    product.setSize("foo");
    product.setDescription("foo");
    product.setPrice(256.0);
    final Collection collection = new Collection();
    collection.setId(4096);
    product.setCollection(collection);
    final Category category = new Category();
    category.setId(0);
    product.setCategory(category);
    final Product obj = new Product();
    obj.setSize("foo");
    obj.setDescription("foo");
    obj.setPrice(256.0);
    final Collection collection1 = new Collection();
    collection1.setId(4096);
    obj.setCollection(collection1);
    final Category category1 = new Category();
    obj.setCategory(category1);

    // Act and Assert result
    Assert.assertFalse(product.equals(obj));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputFalse7() {

    // Arrange
    final Product product = new Product();
    product.setSize("foo");
    product.setDescription("foo");
    product.setPrice(256.0);
    final Collection collection = new Collection();
    collection.setId(4096);
    product.setCollection(collection);
    final Category category = new Category();
    category.setId(0);
    product.setCategory(category);
    final Product obj = new Product();
    obj.setSize("foo");
    obj.setDescription("foo");
    obj.setPrice(256.0);
    final Collection collection1 = new Collection();
    collection1.setId(4097);
    obj.setCollection(collection1);
    final Category category1 = new Category();
    obj.setCategory(category1);

    // Act and Assert result
    Assert.assertFalse(product.equals(obj));
  }

  // Test written by Diffblue Cover.
  @Test
  public void equalsInputNotNullOutputTrue() {

    // Arrange
    final Product product = new Product();
    product.setSize("foo");
    product.setPrice(256.0);
    final Collection collection = new Collection();
    collection.setId(4096);
    product.setCollection(collection);
    final Category category = new Category();
    category.setId(0);
    product.setCategory(category);
    final Product obj = new Product();
    obj.setSize("foo");
    obj.setPrice(256.0);
    final Collection collection1 = new Collection();
    collection1.setId(4096);
    obj.setCollection(collection1);
    final Category category1 = new Category();
    obj.setCategory(category1);

    // Act and Assert result
    Assert.assertTrue(product.equals(obj));
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
  public void setCategoryInputNotNullOutputVoid() {

    // Arrange
    final Product product = new Product();
    final Category category = new Category();

    // Act
    product.setCategory(category);

    // Assert side effects
    Assert.assertNotNull(product.getCategory());
    Assert.assertEquals(0, product.getCategory().getId());
    Assert.assertNull(product.getCategory().getName());
  }
}
