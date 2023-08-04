package com.spring_boot.SGShop.repository;

import com.spring_boot.SGShop.modal.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
