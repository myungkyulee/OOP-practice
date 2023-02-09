package com.example.springtestlikelion.likelionAPI.dto;

import lombok.Data;

@Data
public class WriteMessageRequest {
    private String authorName;
    private String content;
}
