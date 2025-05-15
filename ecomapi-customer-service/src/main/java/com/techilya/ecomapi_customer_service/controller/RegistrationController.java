package com.techilya.ecomapi_customer_service.controller;

import com.techilya.ecomapi_customer_service.dto.request.CustomerRegistrationRequestDTO;
import com.techilya.ecomapi_customer_service.dto.response.CustomerRegistrationResponseDTO;
import com.techilya.ecomapi_customer_service.dto.response.StandardResponse;
import com.techilya.ecomapi_customer_service.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer-service/api/v1")
public class RegistrationController {

    private final CustomerService customerService;

    public RegistrationController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/register")
    public ResponseEntity<StandardResponse<CustomerRegistrationResponseDTO>> registerCustomer(CustomerRegistrationRequestDTO requestDTO) {
        StandardResponse<CustomerRegistrationResponseDTO> registeredCustomer = customerService.registerCustomer(requestDTO);
        return ResponseEntity.ok(registeredCustomer);
    }
}
