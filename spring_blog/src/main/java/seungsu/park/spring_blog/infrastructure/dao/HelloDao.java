package seungsu.park.spring_blog.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import seungsu.park.spring_blog.domain.model.entity.Hello;

public interface HelloDao extends JpaRepository<Hello,Integer>{
    
}
