package com.scaler.ecom.project.EcomProducts.controller;

import com.scaler.ecom.project.EcomProducts.dto.ProductResponseDTO;
import com.scaler.ecom.project.EcomProducts.exception.ProductNotFoundException;
import com.scaler.ecom.project.EcomProducts.model.Product;
import com.scaler.ecom.project.EcomProducts.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    @Qualifier("fakeStoreAPIService")
    ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        List<Product> products =  productService.getAllProduct();
        return ResponseEntity.ok(products);

    }

    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id" ) int id) throws ProductNotFoundException {
       Product product = productService.getProductById(id);
       return ResponseEntity.ok(product);
    }

}
