package com.techilya.ecomapi_customer_service.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerRegistrationRequestDTO {
    private String name;
    private String emailId;
    private String mobileNumber;
    private String countryCode;
}
