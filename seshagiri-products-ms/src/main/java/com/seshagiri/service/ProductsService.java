package com.seshagiri.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.seshagiri.model.Category;
import com.seshagiri.model.Product;
import com.seshagiri.util.CategoryEnum;

@Service
public class ProductsService {
	
	public List<Product> getAllProduct(){
		List<Product> products = new ArrayList<>();
		Product p1 = new Product();
		Category c1 = new Category();
		c1.setId("c1");
		c1.setName("RealMe");
		c1.setType(CategoryEnum.Mobiles.value);
		p1.setId("p1");
		p1.setName("Mobile");
		p1.setPrice(15000);
		p1.setCategory(c1);
		products.add(p1);
		return products;
	}

}
