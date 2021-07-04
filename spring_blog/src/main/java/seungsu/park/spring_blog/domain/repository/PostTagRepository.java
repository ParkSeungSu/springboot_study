package seungsu.park.spring_blog.domain.repository;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import seungsu.park.spring_blog.domain.model.entity.PostTag;
import seungsu.park.spring_blog.infrastructure.dao.PostTagDao;

@Repository
public class PostTagRepository {
    @Autowired
	PostTagDao postTagDao;

	@Autowired
	TagRepository tagRepository;

	public void insertPostTag(PostTag postTag) {
		postTag.setRegDate(new Date());
		postTagDao.save(postTag);

		tagRepository.increaseUseCount(postTag.getTagId());
	}

	public List<PostTag> findByPostId(int postId) {
		return postTagDao.findByPostId(postId);
	}

	public void deletePostTag(PostTag postTag) {
		postTagDao.deleteById(postTag.getId());

		tagRepository.decreaseUseCount(postTag.getTagId());
	}
}
