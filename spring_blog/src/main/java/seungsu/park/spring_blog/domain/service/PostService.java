package seungsu.park.spring_blog.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import seungsu.park.spring_blog.domain.repository.PostRepository;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;
}
