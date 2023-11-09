package com.example.jacksontest.controller;

import com.example.jacksontest.dto.CommonRequestDto;
import com.example.jacksontest.dto.CommonResponseDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonCotroller {

    @PostMapping("/jacksonTest")
    public CommonResponseDto common (@RequestBody CommonRequestDto commonRequestDto){

        CommonResponseDto commonResponseDto = new CommonResponseDto(commonRequestDto);

        System.out.println(commonRequestDto.getOrderId());
        System.out.println(commonRequestDto.getPrductName());
        System.out.println(commonRequestDto.getCustomerNum());

        return commonResponseDto;
    }

}
