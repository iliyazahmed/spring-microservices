package com.techilya.ecomapi_customer_service.service;

import com.techilya.ecomapi_customer_service.dto.request.CustomerRegistrationRequestDTO;
import com.techilya.ecomapi_customer_service.dto.response.CustomerRegistrationResponseDTO;
import com.techilya.ecomapi_customer_service.dto.response.StandardResponse;
import com.techilya.ecomapi_customer_service.entity.Customer;
import com.techilya.ecomapi_customer_service.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;
    
    public StandardResponse<CustomerRegistrationResponseDTO> registerCustomer(CustomerRegistrationRequestDTO requestDTO) {
        Customer customerBuild = buildCustomerEntity(requestDTO);

        Customer customerRegistrationResponse = customerRepository.save(customerBuild);

        CustomerRegistrationResponseDTO responseDTO = buildCustomerEntityResponse(customerRegistrationResponse);
        return new StandardResponse<>(200, true, "Successfully User Has been Registered", responseDTO);

    }

    private static CustomerRegistrationResponseDTO buildCustomerEntityResponse(Customer customerRegistrationResponse) {
        return CustomerRegistrationResponseDTO.builder()
                .customerId(customerRegistrationResponse.getId()).build();
    }

    private static Customer buildCustomerEntity(CustomerRegistrationRequestDTO requestDTO) {
        return Customer.builder()
                .name(requestDTO.getName())
                .emailAddress(requestDTO.getEmailId())
                .mobileNumber(requestDTO.getMobileNumber())
                .countryCode(requestDTO.getCountryCode()).build();
    }
}
