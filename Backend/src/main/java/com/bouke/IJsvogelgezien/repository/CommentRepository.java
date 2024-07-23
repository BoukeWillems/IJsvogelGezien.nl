package com.bouke.IJsvogelgezien.repository;

import com.bouke.IJsvogelgezien.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByUploadId(Long uploadId);
    List<Comment> findByParentCommentId(Long parentCommentId);
}
