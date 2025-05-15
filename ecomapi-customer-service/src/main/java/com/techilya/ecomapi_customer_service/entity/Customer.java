package com.techilya.ecomapi_customer_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer {
    @Column(name = "customer_id")
    @Id
    private Integer id;
    private String name;
    private String emailAddress;
    private String mobileNumber;
    private String countryCode;
}
