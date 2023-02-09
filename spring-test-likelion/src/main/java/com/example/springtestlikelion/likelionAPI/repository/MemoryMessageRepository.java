package com.example.springtestlikelion.likelionAPI.repository;

import com.example.springtestlikelion.likelionAPI.domain.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Slf4j
@Repository
public class MemoryMessageRepository {
    private static final List<Message> store = new ArrayList<>();

    public void save(Message message) {
        log.info("[MemoryMessageRepository] save Message");
        store.add(message);
    }

    public List<Message> findByUUID(UUID uuid) {
        List<Message> messages = new ArrayList<>();
        boolean flag = false;
        for (Message message : store) {
            if (uuid.equals(message.getUuid())) {
                flag = true;
            }

            if (flag) {
                messages.add(message);
            }
        }
        return messages;
    }

    public List<Message> findAll() {
        List<Message> messages = new ArrayList<>();
        for (Message message : store) {
            messages.add(message);
        }

        return messages;
    }
}
