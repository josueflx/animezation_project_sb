package com.reign.animezation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductsController {

	@RequestMapping("/products.html")
	public String products() {
		return "products";
	}
}