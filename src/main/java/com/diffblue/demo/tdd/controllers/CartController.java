package com.diffblue.demo.tdd.controllers;

// Copyright 2016-2018 DiffBlue limited. All rights reserved.

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.diffblue.demo.tdd.Application;
import com.diffblue.demo.tdd.models.Product;
import com.diffblue.demo.tdd.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CartController {

	private final ProductRepository productRepo;

	@Autowired
	public CartController(ProductRepository productRepo) {
		this.productRepo = productRepo;
	}

	@PostMapping("/addCartItem")
	public String addCartItem(HttpServletRequest request, HttpSession session) {
		// TBD
		return "redirect:/cart";
	}

	public HashMap<Integer, Integer> addProductToCart(String productParam,
			HashMap<Integer, Integer> cartItems) throws IllegalArgumentException {
		if (productParam == null || cartItems == null)
			throw new IllegalArgumentException();
		try {
			int productId = Integer.parseInt(productParam);
			Product product = this.productRepo.findById(productId);
			if (product != null) {
				int newCount = 1;
				Integer found = cartItems.get(product.getId());
				if (found != null) {
					newCount += found;
					cartItems.remove(productId);
				}
				cartItems.put(productId, newCount);
			} else {
				throw new IllegalArgumentException("Product id not found: " + productParam);
			}
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Invalid product id: " + productParam);
		}
		return cartItems;
	}
}
