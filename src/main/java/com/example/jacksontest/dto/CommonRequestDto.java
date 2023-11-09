package com.example.jacksontest.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CommonRequestDto {

    private String orderId;

    private String prductName;

    private int customerNum;

    @JsonCreator
    public CommonRequestDto(
            @JsonProperty(value = "order_id", required = true) String orderId,
            @JsonProperty(value = "product_name", required = true) String prductName,
            @JsonProperty(value = "customer_num", required = true) int customerNum){
        this.orderId = orderId;
        this.prductName = prductName;
        this.customerNum = customerNum;
    }


}
