package com.diffblue.demo.ecommerce.controllers;

import com.diffblue.demo.ecommerce.controllers.CheckoutController;
import com.diffblue.demo.ecommerce.forms.AddressForm;
import com.diffblue.demo.ecommerce.forms.CustomerForm;
import com.diffblue.demo.ecommerce.repositories.AddressRepository;
import com.diffblue.demo.ecommerce.repositories.OrderItemRepository;
import com.diffblue.demo.ecommerce.repositories.OrderRepository;
import java.security.Principal;
import java.util.HashMap;
import javax.servlet.http.HttpSession;
import org.apache.catalina.Manager;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.session.PersistentManager;
import org.apache.catalina.session.StandardSession;
import org.apache.catalina.session.StandardSessionFacade;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;
import org.powermock.reflect.Whitebox;

public class CheckoutController_viewCheckoutPageTest_4_Test {
//failed_compile   @Test
//  public void viewCheckoutPageTest() throws Exception {
//    // Arrange
//    CheckoutController checkoutController = new CheckoutController(Whitebox.newInstance(OrderRepository.class),
//        Whitebox.newInstance(AddressRepository.class), Whitebox.newInstance(OrderItemRepository.class));
//    HashMap<String, Object> hashMap = new HashMap<String, Object>();
//    hashMap.put("aaaaa", "aaaaa");
//    PersistentManager persistentManager = new PersistentManager();
//    persistentManager.setContext(new StandardContext());
//    persistentManager.setContext(new StandardContext());
//    StandardSession standardSession = new StandardSession(persistentManager);
//    CustomerForm customerForm = new CustomerForm();
//
//    // Act and Assert
//    thrown.expect(IllegalStateException.class);
//    checkoutController.viewCheckoutPage(hashMap, standardSession, customerForm);
//    Assert.assertEquals(1, hashMap.size());
//    Object getResult = hashMap.get("aaaaa");
//    Assert.assertTrue(getResult instanceof String);
//    Assert.assertEquals("aaaaa", getResult);
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
//    Assert.assertEquals(1573142874046L, idleTimeInternal);
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
//    String lastName = customerForm.getLastName();
//    String toStringResult2 = customerForm.toString();
//    String firstName = customerForm.getFirstName();
//    AddressForm shippingAddress = customerForm.getShippingAddress();
//    String email = customerForm.getEmail();
//    Assert.assertEquals(null, lastName);
//    Assert.assertEquals(null, customerForm.getPhoneNumber());
//    Assert.assertEquals(null, email);
//    Assert.assertEquals(null, shippingAddress);
//    Assert.assertEquals(null, firstName);
//    Assert.assertNotNull(toStringResult2);
//    Assert.assertNotNull(checkoutController.toString());
//  }
  @Rule
  public Timeout timeout = new Timeout(10000);
  @Rule
  public ExpectedException thrown = ExpectedException.none();
}
