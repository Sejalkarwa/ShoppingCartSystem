package io.sejal.springboot.service;

import io.sejal.springboot.model.Product;
import java.util.List;
public interface ProductService {
	
	Product createProduct(Product product);
	List<Product>getAllProducts();
	Product getProductById(Long id);

}
