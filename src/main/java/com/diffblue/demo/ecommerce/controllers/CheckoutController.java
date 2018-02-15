package com.diffblue.demo.ecommerce.controllers;

import com.diffblue.demo.ecommerce.forms.AddressForm;
// Copyright 2016-2018 DiffBlue limited. All rights reserved.

import com.diffblue.demo.ecommerce.forms.CustomerForm;
import com.diffblue.demo.ecommerce.forms.PaymentForm;
import com.diffblue.demo.ecommerce.models.Address;
import com.diffblue.demo.ecommerce.models.Cart;
import com.diffblue.demo.ecommerce.models.Order;
import com.diffblue.demo.ecommerce.models.OrderItem;
import com.diffblue.demo.ecommerce.repositories.AddressRepository;
import com.diffblue.demo.ecommerce.repositories.OrderItemRepository;
import com.diffblue.demo.ecommerce.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.UUID;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class CheckoutController {

  private final OrderRepository orderRepo;
  private final AddressRepository addressRepo;
  private final OrderItemRepository orderItemRepo;

  /**
   * CheckoutController constructor.
   * @param orderRepo - order repository object
   * @param addressRepo - address repository object
   * @param orderItemRepo - order item repository object
   */
  @Autowired
  public CheckoutController(OrderRepository orderRepo, AddressRepository addressRepo,
                                OrderItemRepository orderItemRepo) {
    this.orderRepo = orderRepo;
    this.addressRepo = addressRepo;
    this.orderItemRepo = orderItemRepo;
  }


  /**
   * Get the cart data and display it on the customerForm information page.
   * @param model where to put cart data, session current http session
   * @return Page for the output
   */

  @RequestMapping("/checkout")
  public String viewCheckoutPage(Map<String, Object> model, HttpSession session,
                                 CustomerForm customerForm) {
    if (session.getAttribute("shoppingCart") != null) {
      Cart shoppingCart = (Cart) session.getAttribute("shoppingCart");
      model.put("cart", shoppingCart);
      return "Checkout";
    } else {
      return "redirect:/cart";
    }
  }

  /**
   * Save customerForm information page.
   * @param customerForm - customerForm object
   * @param bindingResult - object with form validation result
   * @param model - model where to add data to access on view
   * @param session - current http session
   * @return page for the output
   */
  @PostMapping("/checkout")
  public String saveCustomerInformation(@Valid CustomerForm customerForm,
                                          BindingResult bindingResult, Map<String, Object> model,
                                            HttpSession session) {
    if (bindingResult.hasErrors()) {
      Cart shoppingCart = (Cart) session.getAttribute("shoppingCart");
      model.put("cart", shoppingCart);
      return "Checkout";
    } else {
      session.setAttribute("customerInformation", customerForm);
      return "redirect:/payment";
    }
  }

  /**
   * Get the cart and customer data and display it on the payment page.
   * @param model where to put cart data, session current http session
   * @return Page for the output
   */
  @RequestMapping("/payment")
  public String viewPaymentPage(Map<String, Object> model, HttpSession session,
                                PaymentForm paymentForm) {

    if (session.getAttribute("shoppingCart") != null
        && session.getAttribute("customerInformation") != null) {

      Cart shoppingCart = (Cart) session.getAttribute("shoppingCart");
      CustomerForm customerForm = (CustomerForm) session.getAttribute("customerInformation");
      model.put("cart", shoppingCart);
      model.put("customerForm", customerForm);

      return "Payment";

    } else {
      return "redirect:/checkout";
    }
  }

  /**
   * Validate payment form and make payment.
   * @param paymentForm - payment form object
   * @param bindingResult - object with form validation result
   * @param model - model where to add data to access on view
   * @param session - current http session
   * @return page for the output
   */
  @PostMapping("/payment")
  public String makePayment(@Valid PaymentForm paymentForm, BindingResult bindingResult,
                                        Map<String, Object> model, HttpSession session) {

    Cart shoppingCart = (Cart) session.getAttribute("shoppingCart");
    CustomerForm customer = (CustomerForm) session.getAttribute("customerInformation");

    if (bindingResult.hasErrors()) {

      model.put("cart", shoppingCart);
      model.put("customer", customer);
      return "Payment";

    } else {

      AddressForm address = customer.getShippingAddress();
      Address addressToSave;
      if (address.getCompany() != "") {
        addressToSave = new Address(address.getCompany(), address.getAddressLine(),
                                      address.getCity(), address.getCountry(),
                                          address.getPostcode());
      } else {
        addressToSave = new Address(address.getAddressLine(), address.getCity(),
            address.getCountry(), address.getPostcode());
      }

      Address savedAddress = addressRepo.save(addressToSave);

      Order savedOrder = orderRepo.save(new Order(UUID.randomUUID().toString(),
                              customer.getFirstName(), customer.getLastName(), customer.getEmail(),
                                customer.getPhoneNumber(), savedAddress));


      shoppingCart.getProducts().forEach((product,quantity)-> {
        OrderItem savedOrderItem = orderItemRepo.save(new OrderItem(savedOrder, product, quantity));
      } );


      session.removeAttribute("shoppingCart");
      session.removeAttribute("customerInformation");
      session.setAttribute("orderRef", savedOrder.getOrderRef());
      session.setAttribute("email", savedOrder.getEmail());

      return "redirect:/order-complete";
    }
  }

  /**
   * Get the order reference and customer data and display it on the order complete page.
   * @param model - model to add data to access on view
   * @param session - current http session
   * @return Page for the output
   */
  @RequestMapping("/order-complete")
  public String viewOrderCompletePage(Map<String, Object> model, HttpSession session) {

    if (session.getAttribute("orderRef") != null && session.getAttribute("email") != null) {
      model.put("orderRef", session.getAttribute("orderRef"));
      model.put("email", session.getAttribute("email"));
      return "OrderComplete";
    } else {
      return "redirect:/";
    }

  }

}
