package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Product;
import com.demo.repository.ProductJPARepository;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
	private ProductJPARepository productJPARepository;
	@Override
	public List<Product> getProducts() {
		return productJPARepository.findAll();
	}
	@Override
	public Product addProduct(Product product) {
		return productJPARepository.save(product);
	}
	@Override
	public Product updateProduct(Product product) {
		return productJPARepository.save(product);
	}
	@Override
	public void deleteProduct(int productId) {
		productJPARepository.deleteById(productId);
	}
	@Override
	public List<Product> addProducts(List<Product> productList) {
		return productJPARepository.saveAll(productList);
	}
	
}
