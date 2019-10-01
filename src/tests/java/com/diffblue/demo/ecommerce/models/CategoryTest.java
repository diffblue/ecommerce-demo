package com.diffblue.demo.ecommerce.models;

import com.diffblue.demo.ecommerce.models.Category;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class CategoryTest {

  @Rule public final Timeout globalTimeout = new Timeout(10000);

  // Test written by Diffblue Cover.
  @Test
  public void getIdOutputZero() {

    // Arrange
    final Category category = new Category();

    // Act and Assert result
    Assert.assertEquals(0, category.getId());
  }

  // Test written by Diffblue Cover.
  @Test
  public void getNameOutputNull() {

    // Arrange
    final Category category = new Category();

    // Act and Assert result
    Assert.assertNull(category.getName());
  }
}
