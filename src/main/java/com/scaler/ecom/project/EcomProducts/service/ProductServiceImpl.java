package com.scaler.ecom.project.EcomProducts.service;

import com.scaler.ecom.project.EcomProducts.dto.ProductResponseDTO;
import com.scaler.ecom.project.EcomProducts.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Override
    public List<Product> getAllProduct() {
        List<Product> products =  createProduct();
        return products;
    }

    @Override
    public Product getProductById(int id) {
        return null;
    }

    private List<Product> createProduct() {

        Product p1 = new Product();
        p1.setId(1);
        p1.setTitle("iphone 15 pro max");
        p1.setCategory("Electronics");
        p1.setPrice(150000);
        p1.setDescription("Premium Phone");
        p1.setImage("www.google.com/iphone-15-pro-max");

        Product p2 = new Product();
        p2.setId(2);
        p2.setTitle("iphone 14 pro max");
        p2.setCategory("Electronics");
        p2.setPrice(130000);
        p2.setDescription("Premium Phone but not latest");
        p2.setImage("www.google.com/iphone-14-pro-max");

        return Arrays.asList(p1, p2);
    }
}
