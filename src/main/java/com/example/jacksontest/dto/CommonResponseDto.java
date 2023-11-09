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

    @JsonProperty(value = "customer_num")
    private int customerNum;

    public CommonResponseDto(CommonRequestDto commonRequestDto){

        this.orderId = commonRequestDto.getOrderId();
        this.prductName = commonRequestDto.getPrductName();
        this.customerNum = commonRequestDto.getCustomerNum();

    }


}
