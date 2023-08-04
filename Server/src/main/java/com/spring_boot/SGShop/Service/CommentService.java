package com.spring_boot.SGShop.Service;

import com.spring_boot.SGShop.modal.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    List<Comment> getAllCommentOfUser();

    Comment insertComment(Comment comment);

    String deleteComment(Long id);
    Optional<Comment> updateComment(Long id, Comment comment);

}
