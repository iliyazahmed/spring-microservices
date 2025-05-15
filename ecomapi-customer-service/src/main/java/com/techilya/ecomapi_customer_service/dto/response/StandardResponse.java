package com.techilya.ecomapi_customer_service.dto.response;

public record StandardResponse<T>(int statusCode, boolean status, String responseDescription, T data) {
}
