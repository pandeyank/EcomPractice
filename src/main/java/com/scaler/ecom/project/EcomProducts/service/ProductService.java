package com.scaler.ecom.project.EcomProducts.service;

import com.scaler.ecom.project.EcomProducts.dto.ProductResponseDTO;
import com.scaler.ecom.project.EcomProducts.exception.ProductNotFoundException;
import com.scaler.ecom.project.EcomProducts.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
  public List<Product> getAllProduct();
  public Product getProductById(int id) throws ProductNotFoundException;
}
