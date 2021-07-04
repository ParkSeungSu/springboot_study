package seungsu.park.spring_blog.application.configuration;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import seungsu.park.spring_blog.domain.service.factory.SearchServiceFactory;

@Configuration
public class BlogConfig {
    @Bean
    public FactoryBean serviceLocatorFactoryBean(){
        ServiceLocatorFactoryBean factoryBean = new ServiceLocatorFactoryBean();
        factoryBean.setServiceLocatorInterface(SearchServiceFactory.class);
        return factoryBean;
    }
}
