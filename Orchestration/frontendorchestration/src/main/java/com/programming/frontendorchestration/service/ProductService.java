package com.programming.frontendorchestration.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.programming.frontendorchestration.model.Product;

@Service
public class ProductService {

	@Autowired
	private RestTemplate restTemplate;

	private final String PRODUCT_SERVICE_URL = "http://product-service/product";

	public List<Product> getProducts() {
		try {
			Product[] products = restTemplate.getForObject(PRODUCT_SERVICE_URL + "/getAll", Product[].class);
			return products != null ? Arrays.asList(products) : Collections.emptyList();
		} catch (RestClientException e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}

	public List<Product> getProductsBySearch(String query) {
		try {
			Product[] products = restTemplate.getForObject(PRODUCT_SERVICE_URL + "/search?query=" + query,
					Product[].class);
			return products != null ? Arrays.asList(products) : Collections.emptyList();
		} catch (RestClientException e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}

	public Product getProductById(int categoryId, int productId) {
		try {
			Product product = restTemplate.getForObject(PRODUCT_SERVICE_URL + "/get/" + categoryId + "/" + productId,
					Product.class);
			return product;
		} catch (RestClientException e) {
			e.printStackTrace();
			return null;
		}
	}
}
