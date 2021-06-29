package seungsu.park.spring_blog.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import seungsu.park.spring_blog.domain.model.entity.Post;

@Repository
public interface PostDao extends JpaRepository<Post,Integer>{
    
}
