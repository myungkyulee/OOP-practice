package com.example.springtestlikelion.likelionAPI.dto;

import lombok.Data;

@Data
public class Response {
    private final String resultCode;
    private final Status msg;
    private final Object data;
}
