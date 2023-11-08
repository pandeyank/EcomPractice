package com.scaler.ecom.project.EcomProducts.service;

import com.scaler.ecom.project.EcomProducts.exception.ProductNotFoundException;
import com.scaler.ecom.project.EcomProducts.model.Product;
import com.scaler.ecom.project.EcomProducts.util.ProductUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
@Qualifier("fakeStoreAPIService")
public class FakeStoreAPIServiceImpl implements  ProductService{

    @Autowired
    RestTemplateBuilder restTemplateBuilder;


/*    @Autowired
    public FakeStoreAPIServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }*/

    @Override
    public List<Product> getAllProduct() {
       String getAllProductURL = "https://fakestoreapi.com/products";
       RestTemplate restTemplate = restTemplateBuilder.build();
       List<Product> products = new ArrayList<>();
        Product product[]  = restTemplate.getForEntity(getAllProductURL, Product[].class).getBody();
        for(Product p: product){
            products.add(p);
        }

        return products;
    }

    @Override
    public Product getProductById(int id) throws ProductNotFoundException {
        String getProductByIdURL = "https://fakestoreapi.com/products"+ "/"+ id;
        RestTemplate restTemplate = restTemplateBuilder.build();
        Product product = restTemplate.getForEntity(getProductByIdURL, Product.class).getBody();
        if(ProductUtils.isNull(product)){
            throw new ProductNotFoundException("Product Not found with id: " +id);
        }
        return  product;
    }
}
