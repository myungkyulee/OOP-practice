package com.example.springtestlikelion.likelionAPI.service;

import com.example.springtestlikelion.likelionAPI.domain.Post;
import com.example.springtestlikelion.likelionAPI.dto.post.PostDtoReq;
import com.example.springtestlikelion.likelionAPI.repository.MemoryPostRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PostService {
    private final MemoryPostRepository memoryPostRepository;

    public Long save(PostDtoReq postDtoReq) {
        log.info("[PostService] post save ");
        return memoryPostRepository.save(postDtoReq);
    }

    public List<Post> findPosts() {
        return memoryPostRepository.findAll();
    }

}
