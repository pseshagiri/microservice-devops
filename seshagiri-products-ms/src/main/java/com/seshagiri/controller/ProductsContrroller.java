package com.seshagiri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seshagiri.model.Product;
import com.seshagiri.service.ProductsService;

@RestController
@RequestMapping("/products")
public class ProductsContrroller {
	
	@Autowired()
	ProductsService productService;
	
	@GetMapping()
	public List<Product> getAll() {
		
		return productService.getAllProduct();
		
	}

}
