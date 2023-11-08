package com.scaler.ecom.project.EcomProducts.controller.controllerAdvice;

import com.scaler.ecom.project.EcomProducts.dto.ErrorHandling;
import com.scaler.ecom.project.EcomProducts.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductControllerAdvice {

    @ExceptionHandler(value = ProductNotFoundException.class)
   public ResponseEntity handleProductNotFoundException(Exception exception){
        ErrorHandling errorHandling = new ErrorHandling();
        errorHandling.setMessage(exception.getMessage());
        errorHandling.setMessageCode(404);
       return  new ResponseEntity<>(errorHandling, HttpStatus.NOT_FOUND);
    }

}
