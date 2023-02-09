package com.example.springtestlikelion.likelionAPI.controller;

import com.example.springtestlikelion.likelionAPI.domain.Message;
import com.example.springtestlikelion.likelionAPI.domain.Post;
import com.example.springtestlikelion.likelionAPI.dto.*;
import com.example.springtestlikelion.likelionAPI.dto.post.PostDtoReq;
import com.example.springtestlikelion.likelionAPI.dto.post.PostDtoRes;
import com.example.springtestlikelion.likelionAPI.service.MessageService;
import com.example.springtestlikelion.likelionAPI.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final MessageService messageService;
    private final PostService postService;

    @PostMapping("/chat/writeMessage")
    public Response writeMessage(@RequestBody WriteMessageRequest req) {
        Message message = messageService.save(req);
        return new Response("S-1", Status.성공, new MyUUID(message.getUuid()));
    }

    @GetMapping("/chat/messages")
    public Response getMessages(@RequestParam(name = "fromUuid", required = false) String uuid) {
        if (uuid == null) {
            List<Message> messages = messageService.findMessages();
            return new Response("S-1", Status.성공, messages);
        }
        List<Message> messages = messageService.findMessagesByUUID(uuid);
        return new Response("S-1", Status.성공, messages);
    }

    @PostMapping("/posts")
    public Response createPost(@RequestBody PostDtoReq postDtoReq) {
        Long postId = postService.save(postDtoReq);
        return new Response("S-1", Status.성공, new PostDtoRes(postId));
    }
    @GetMapping("/posts")
    public Response getPosts() {
        List<Post> messages = postService.findPosts();
        return new Response("S-1", Status.성공, messages);
    }

    @PatchMapping("/posts/{id}")
    public Response editPost(){

    }

    /*@PostMapping("/posts/{id}")
    public Response createPost(Long id) {
        Post psot = postService.findById(id);
        return new Response("S-1", Status.성공, new PostDtoRes(postId));
    }*/
}
