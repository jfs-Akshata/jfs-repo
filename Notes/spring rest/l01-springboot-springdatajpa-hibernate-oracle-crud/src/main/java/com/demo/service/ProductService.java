package com.demo.service;

import java.util.List;

import com.demo.entity.Product;

public interface ProductService {
List<Product> getProducts();
Product addProduct(Product product);
List<Product> addProducts(List<Product> productList);
Product updateProduct(Product product);
void deleteProduct(int productId);
}
