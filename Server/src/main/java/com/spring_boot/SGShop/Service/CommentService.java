package com.spring_boot.SGShop.Service;

import com.spring_boot.SGShop.Modal.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    List<Comment> getAllCommentOfAStudent();

    Comment insertComment(Comment comment);

    String deleteComment(Long id);
    Optional<Comment> updateComment(Long id, Comment comment);

}
