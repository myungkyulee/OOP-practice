package com.example.springtestlikelion.likelionAPI.repository;

import com.example.springtestlikelion.likelionAPI.domain.Post;
import com.example.springtestlikelion.likelionAPI.dto.post.PostDtoReq;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MemoryPostRepository {
    private static Long sequence = 0L;
    private static final Map<Long, Post> store = new HashMap<>();

    public Long save(PostDtoReq postDtoReq) {
        log.info("[MemoryPostRepository] post save ");
        ++sequence;
        Post post = createPost(postDtoReq);
        store.put(sequence, post);
        return sequence;
    }

    private Post createPost(PostDtoReq postDtoReq) {
        return Post.builder()
                .subject(postDtoReq.getSubject())
                .content(postDtoReq.getContent())
                .createDate(LocalDateTime.now())
                .modifyDate(LocalDateTime.now())
                .id(sequence)
                .build();
    }

    public List<Post> findAll() {
        List<Post> posts = new ArrayList<>();
        for (Long id : store.keySet()) {
            posts.add(store.get(id));
        }
        return posts;
    }
}
