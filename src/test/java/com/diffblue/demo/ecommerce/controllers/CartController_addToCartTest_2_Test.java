package com.diffblue.demo.ecommerce.controllers;

import com.diffblue.demo.ecommerce.controllers.CartController;
import com.diffblue.demo.ecommerce.models.Category;
import com.diffblue.demo.ecommerce.models.Collection;
import com.diffblue.demo.ecommerce.models.Product;
import com.diffblue.demo.ecommerce.repositories.ProductRepository;
import java.security.Principal;
import javax.servlet.http.HttpSession;
import org.apache.catalina.Manager;
import org.apache.catalina.session.PersistentManager;
import org.apache.catalina.session.StandardSession;
import org.apache.catalina.session.StandardSessionFacade;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class CartController_addToCartTest_2_Test {
//failed_compile   @Test
//  public void addToCartTest() throws Exception {
//    // Arrange
//    CartController cartController = new CartController(Whitebox.newInstance(ProductRepository.class));
//    Product product = new Product();
//    PersistentManager persistentManager = new PersistentManager();
//    StandardSession standardSession = new StandardSession(persistentManager);
//    String size = "aaaaa";
//
//    // Act and Assert
//    thrown.expect(NullPointerException.class);
//    cartController.addToCart(product, standardSession, size);
//    int id = product.getId();
//    String sku = product.getSku();
//    String photo = product.getPhoto();
//    String name = product.getName();
//    String toStringResult = product.toString();
//    String size1 = product.getSize();
//    String description = product.getDescription();
//    Category category = product.getCategory();
//    Collection collection = product.getCollection();
//    Assert.assertEquals(0, id);
//    Assert.assertEquals(0.0, product.getPrice());
//    Assert.assertEquals(null, collection);
//    Assert.assertEquals(null, category);
//    Assert.assertEquals(null, description);
//    Assert.assertEquals(null, size1);
//    Assert.assertNotNull(toStringResult);
//    Assert.assertEquals(null, name);
//    Assert.assertEquals(null, photo);
//    Assert.assertEquals(null, sku);
//    String authType = standardSession.getAuthType();
//    String toStringResult1 = standardSession.toString();
//    Manager manager = standardSession.getManager();
//    long creationTimeInternal = standardSession.getCreationTimeInternal();
//    String id1 = standardSession.getId();
//    boolean isValidInternalResult = standardSession.isValidInternal();
//    String idInternal = standardSession.getIdInternal();
//    int maxInactiveInterval = standardSession.getMaxInactiveInterval();
//    long thisAccessedTimeInternal = standardSession.getThisAccessedTimeInternal();
//    long lastAccessedTimeInternal = standardSession.getLastAccessedTimeInternal();
//    Principal principal = standardSession.getPrincipal();
//    long idleTimeInternal = standardSession.getIdleTimeInternal();
//    HttpSession session = standardSession.getSession();
//    Assert.assertEquals(null, authType);
//    Assert.assertFalse(standardSession.isValid());
//    Assert.assertTrue(session instanceof StandardSessionFacade);
//    Assert.assertEquals(1573142869150L, idleTimeInternal);
//    int maxInactiveInterval1 = session.getMaxInactiveInterval();
//    String toStringResult2 = ((StandardSessionFacade) session).toString();
//    Assert.assertEquals(null, principal);
//    Assert.assertEquals("StandardSession[null]", toStringResult1);
//    Assert.assertEquals(0L, creationTimeInternal);
//    Assert.assertEquals(-1, maxInactiveInterval);
//    Assert.assertEquals(0L, lastAccessedTimeInternal);
//    Assert.assertEquals(0L, thisAccessedTimeInternal);
//    Assert.assertEquals(null, id1);
//    Assert.assertEquals(null, idInternal);
//    Assert.assertFalse(isValidInternalResult);
//    Assert.assertSame(persistentManager, manager);
//    Assert.assertTrue(manager instanceof PersistentManager);
//    Assert.assertSame(persistentManager, manager);
//    Assert.assertEquals(null, session.getId());
//    Assert.assertNotNull(toStringResult2);
//    Assert.assertEquals(-1, maxInactiveInterval1);
//    Assert.assertNotNull(cartController.toString());
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
