package seungsu.park.spring_blog.application.configuration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import seungsu.park.spring_blog.application.aop.CategoryInterceptor;
import seungsu.park.spring_blog.application.aop.UserSessionArgumentResolver;
import seungsu.park.spring_blog.application.aop.UserSessionInterceptor;
import seungsu.park.spring_blog.infrastructure.dao.CategoryDao;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
    
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(new UserSessionInterceptor());
        registry.addInterceptor((new CategoryInterceptor(categoryDao)));
    }

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers){
        argumentResolvers.add(new UserSessionArgumentResolver());
    }
}
