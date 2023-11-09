package com.example.jacksontest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonRequestDto {

    @JsonProperty(value = "order_id")
    private String orderId;

    @JsonProperty(value = "product_name")
    private String prductName;

    @JsonProperty(value = "request_currency")
    private String requestCurrency;

    @JsonProperty(value = "request_amount")
    private String requestAmount;

    @JsonProperty(value = "redirect_url")
    private String redirectUrl;

    @JsonProperty(value = "customer_id")
    private String customerId;

    @JsonProperty(value = "customer_num")
    private int customerNum;


}
