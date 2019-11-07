package com.diffblue.demo.ecommerce.controllers;

import com.diffblue.demo.ecommerce.controllers.CartController;
import com.diffblue.demo.ecommerce.models.Cart;
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

public class CartController_getOrCreateSessionCartTest_1_Test {
//failed_compile   @Test
//  public void getOrCreateSessionCartTest() throws Exception {
//    // Arrange
//    CartController cartController = new CartController(Whitebox.newInstance(ProductRepository.class));
//    PersistentManager persistentManager = new PersistentManager();
//    StandardSession standardSession = new StandardSession(persistentManager);
//
//    // Act and Assert
//    thrown.expect(IllegalStateException.class);
//    cartController.getOrCreateSessionCart(standardSession);
//    String authType = standardSession.getAuthType();
//    String toStringResult = standardSession.toString();
//    Manager manager = standardSession.getManager();
//    long creationTimeInternal = standardSession.getCreationTimeInternal();
//    String id = standardSession.getId();
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
//    Assert.assertEquals(1573142867413L, idleTimeInternal);
//    int maxInactiveInterval1 = session.getMaxInactiveInterval();
//    String toStringResult1 = ((StandardSessionFacade) session).toString();
//    Assert.assertEquals(null, principal);
//    Assert.assertEquals("StandardSession[null]", toStringResult);
//    Assert.assertEquals(0L, creationTimeInternal);
//    Assert.assertEquals(-1, maxInactiveInterval);
//    Assert.assertEquals(0L, lastAccessedTimeInternal);
//    Assert.assertEquals(0L, thisAccessedTimeInternal);
//    Assert.assertEquals(null, id);
//    Assert.assertEquals(null, idInternal);
//    Assert.assertFalse(isValidInternalResult);
//    Assert.assertSame(persistentManager, manager);
//    Assert.assertTrue(manager instanceof PersistentManager);
//    Assert.assertSame(persistentManager, manager);
//    Assert.assertEquals(null, session.getId());
//    Assert.assertNotNull(toStringResult1);
//    Assert.assertEquals(-1, maxInactiveInterval1);
//    Assert.assertNotNull(cartController.toString());
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
