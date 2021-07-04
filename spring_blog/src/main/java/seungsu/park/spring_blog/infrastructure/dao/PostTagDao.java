package seungsu.park.spring_blog.infrastructure.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import seungsu.park.spring_blog.domain.model.entity.PostTag;

public interface PostTagDao extends JpaRepository<PostTag, Integer> {

	List<PostTag> findByTagName(String tagName);

	List<PostTag> findByPostId(int postId);
}
