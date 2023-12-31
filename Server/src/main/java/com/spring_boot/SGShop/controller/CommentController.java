package com.spring_boot.SGShop.controller;

import com.spring_boot.SGShop.modal.Comment;
import com.spring_boot.SGShop.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @PostMapping
    public ResponseEntity<?> insertComment(@RequestBody Comment comment) {
        return ResponseEntity.ok(commentService.insertComment(comment));
    }
}
