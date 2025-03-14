package com.programming.frontendorchestration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.programming.frontendorchestration.model.Product;
import com.programming.frontendorchestration.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping
	public List<Product> getProducts() {
		return productService.getProducts();
	}
	
	@GetMapping("/search")
	public List<Product> getProductsBySearch(@RequestParam String query) {
		return productService.getProductsBySearch(query);
	}
	
	@GetMapping("/{categoryId}/{productId}")
	public Product getProductsById(@PathVariable int categoryId ,@PathVariable int productId) {
		return productService.getProductById(categoryId,productId);
	}
}
