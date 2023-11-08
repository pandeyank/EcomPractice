package com.scaler.ecom.project.EcomProducts.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Getter
@Setter
@Service
public class ProductResponseDTO {
    private int id;
    private String title;
    private double price;
    private String category;
    private String description;
    private String image;
}
