

`<persistence xmlns="http://java.sun.com/xml/ns/persistence"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://java.sun.com/xml/ns/persistence
                      http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
	version="2.0">`

		//FETCHING MULTIPLE JSON OBJECTS FROM POSTMAN
	@RequestMapping(value = "/products", method = RequestMethod.POST)
	Products addProducts(@RequestBody Products products) {
		Products productsTemp = new Products();
		productsTemp.productList = new ArrayList<Product>();
		products.productList.forEach((product)->{
			productsTemp.productList.add(productService.addProduct(product));
		});
		return productsTemp;
	}

	package com.demo.model;

import java.util.List;

import com.demo.entity.Product;

public class Products {
public List<Product> productList;
}

{
    "productList": [
        {
            "productName": "p1",
            "price": 30
        },
        {
            "productName": "p2",
            "price": 30
        }
    ]
}