package seungsu.park.spring_blog.presentation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import seungsu.park.spring_blog.domain.model.entity.Hello;
import seungsu.park.spring_blog.infrastructure.dao.HelloDao;

@RestController
public class HelloRestController{
    @Autowired
    private HelloDao helloDao;
    @RequestMapping("/add")
    public Hello add(Hello hello){
        Hello helloData = helloDao.save(hello);

        return helloData;
    }

}