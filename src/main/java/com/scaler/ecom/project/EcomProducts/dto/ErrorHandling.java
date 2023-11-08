package com.scaler.ecom.project.EcomProducts.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
public class ErrorHandling {
   private  String message;
   private int messageCode;
}
