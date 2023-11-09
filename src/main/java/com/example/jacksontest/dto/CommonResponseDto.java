package com.example.jacksontest.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CommonResponseDto {

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

    public CommonResponseDto(CommonRequestDto commonRequestDto){

        this.orderId = commonRequestDto.getOrderId();
        this.prductName = commonRequestDto.getPrductName();
        this.requestCurrency = commonRequestDto.getRequestCurrency();
        this.requestAmount = commonRequestDto.getRequestAmount();
        this.redirectUrl = commonRequestDto.getRedirectUrl();
        this.customerId = commonRequestDto.getRedirectUrl();
        this.customerNum = commonRequestDto.getCustomerNum();

    }


}
