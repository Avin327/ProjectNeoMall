package com.programming.frontendorchestration.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.programming.frontendorchestration.model.Category;
import com.programming.frontendorchestration.model.Product;

@Service
public class CategoryService {

	@Autowired
	private RestTemplate restTemplate;

	private final String PRODUCT_SERVICE_URL = "http://product-service/category";

	public List<Category> getCategories() {
		try {
			Category[] category = restTemplate.getForObject(PRODUCT_SERVICE_URL + "/getAllCategories", Category[].class);
			return category != null ? Arrays.asList(category) : Collections.emptyList();
		} catch (RestClientException e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}

	public List<Product> getProductsByCategoryId(int categoryId) {
		try {
			Category category = restTemplate.getForObject(PRODUCT_SERVICE_URL + "/getCategoryById/" + categoryId, Category.class);
			return category != null ? category.getProducts() : Collections.emptyList();
		} catch (RestClientException e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}

}
