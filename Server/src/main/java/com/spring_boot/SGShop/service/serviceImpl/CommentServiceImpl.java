package com.spring_boot.SGShop.service.serviceImpl;

import com.spring_boot.SGShop.modal.Comment;
import com.spring_boot.SGShop.modal.User;
import com.spring_boot.SGShop.repository.CommentRepository;
import com.spring_boot.SGShop.repository.UserRepository;
import com.spring_boot.SGShop.service.CommentService;
import com.spring_boot.SGShop.exception.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    UserRepository userRepository;

    @Override
    public List<Comment> getAllCommentOfUser() {
        List<Comment> listComment = commentRepository.findAll();
        if(listComment.isEmpty())
            throw new NotFoundException("Can't found any comment");

        return listComment;
    }

    @Override
    public Comment insertComment(Comment comment) {
        User userFound = userRepository.findById(comment.getUser().getId()).get();
        comment.setUser(userFound);
        commentRepository.save(comment);
        return comment;
    }

    @Override
    public String deleteComment(Long id) {
        return null;
    }

    @Override
    public Optional<Comment> updateComment(Long id, Comment comment) {
        return Optional.empty();
    }
}
