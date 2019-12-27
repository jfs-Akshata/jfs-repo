package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.Product;
import com.demo.model.Products;
import com.demo.service.ProductService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/products")
	// @GetMapping("/products")(
	List<Product> getProducts() {
		return productService.getProducts();
	}

	@RequestMapping(value = "/product", method = RequestMethod.POST)
	Product addProduct(@RequestBody Product product) {
		return productService.addProduct(product);
	}

	@RequestMapping(value = "/product", method = RequestMethod.PUT)
	Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}

	@RequestMapping(value = "/product/{productId}", method = RequestMethod.DELETE)
	void deleteProduct(@PathVariable int productId) {
		productService.deleteProduct(productId);
	}

	// FETCHING MULTIPLE JSON OBJECTS FROM POSTMAN
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	List<Product> addProducts(@RequestBody Products products) {
		
//		Products productsTemp = new Products();
//		productsTemp.productList = new ArrayList<Product>();
//		
//		products.productList.forEach((product) -> {
//			productsTemp.productList.add(productService.addProduct(product));
//		});
//		return productsTemp;
		System.err.println("using saveAll() method!");
		return productService.addProducts(products.productList);
	}
	
	@RequestMapping(value = "/productsR", method = RequestMethod.POST)
	String addProductsTest(@RequestParam Product product,@RequestBody String products) {	
		System.err.println("PRODUCT : " + product);
		System.err.println("PRODUCTS : " + products);
		return products;
	}
}