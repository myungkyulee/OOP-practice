package com.example.springtestlikelion.likelionAPI.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.UUID;

@AllArgsConstructor
@Getter
@ToString
@Builder
public class Message {
    private final UUID uuid;
    private final LocalDateTime createDate;
    private final String authorName;
    private final String content;

    public Message(String authorName, String content) {
        this(UUID.randomUUID(), LocalDateTime.now(), authorName, content);
    }
}