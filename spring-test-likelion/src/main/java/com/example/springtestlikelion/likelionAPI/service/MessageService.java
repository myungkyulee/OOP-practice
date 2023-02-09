package com.example.springtestlikelion.likelionAPI.service;

import com.example.springtestlikelion.likelionAPI.domain.Message;
import com.example.springtestlikelion.likelionAPI.dto.WriteMessageRequest;
import com.example.springtestlikelion.likelionAPI.repository.MemoryMessageRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessageService {
    private final MemoryMessageRepository memoryMessageRepository;

    public Message save(WriteMessageRequest request) {
        log.info("[MessageService] save Message");
        Message message = createMessage(request);
        memoryMessageRepository.save(message);
        return message;
    }

    public Message createMessage(WriteMessageRequest request) {
        log.info("[MessageService] create Message");
        return Message.builder()
                .authorName(request.getAuthorName())
                .content(request.getContent())
                .uuid(UUID.randomUUID())
                .createDate(LocalDateTime.now())
                .build();
    }

    public List<Message> findMessages() {
        log.info("[MessageService] find Messages all");
        return memoryMessageRepository.findAll();
    }

    public List<Message> findMessagesByUUID(String id) {
        log.info("[MessageService] find Messages by uuid");
        UUID uuid = UUID.fromString(id);
        return memoryMessageRepository.findByUUID(uuid);
    }
}
