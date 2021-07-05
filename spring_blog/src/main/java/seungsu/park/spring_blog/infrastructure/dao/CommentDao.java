package seungsu.park.spring_blog.infrastructure.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import seungsu.park.spring_blog.domain.model.entity.Comment;

public interface CommentDao extends JpaRepository<Comment, Integer>{

    List<Comment> findByPostId(int postId);
    
}
