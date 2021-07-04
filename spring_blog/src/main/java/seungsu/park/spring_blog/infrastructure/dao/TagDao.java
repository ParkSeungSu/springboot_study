package seungsu.park.spring_blog.infrastructure.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import seungsu.park.spring_blog.domain.model.entity.Tag;

public interface TagDao extends JpaRepository<Tag,Integer> {
    Tag findByName(String tag);
    
}
